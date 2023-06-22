import React, {
  useState,
  useEffect,
  useMemo,
  useRef,
  useCallback,
} from 'react';
import MapView, { Marker } from 'react-native-maps';
import { Platform, StyleSheet } from 'react-native';
import * as Location from 'expo-location';
import BottomSheet from '@gorhom/bottom-sheet';
import Device from 'expo-device';
import {
  Box,
  Button,
  Center,
  HStack,
  Icon,
  Input,
  Skeleton,
  VStack,
  Image,
  Text,
  Divider,
  Heading,
  Spacer,
  Pressable,
  Avatar,
  CheckIcon,
  Popover,
  FlatList,
  Modal,
} from 'native-base';
import { Ionicons } from '@expo/vector-icons';
import axios from 'axios';
import StarRating from 'react-native-star-rating-widget';

const baseURL = 'https://hg3498-app.azurewebsites.net/api/';

export default function Main({ navigation }) {
  const [location, setLocation] = useState({
    coords: { latitude: 35.90710840112608, longitude: 128.61331299999998 },
  });
  const [rating, setRating] = useState(0);
  const [chargeLocation, setChargeLocation] = useState([]);
  const [errorMsg, setErrorMsg] = useState(null);
  const [showModal, setShowModal] = useState(false);
  const [loading, setLoading] = useState(true);
  const [time, setTime] = useState(30 * 60);
  const [reviewList, setreviewList] = useState([{}]);
  const [isTimerOn, setIsTimerOn] = useState(false);
  const [currentCharge, setCurrentCharge] = useState({
    chargerCount: 0,
    chargerTypes: [],
    content: 'content',
    endTime: [0, 0],
    id: 0,
    imagePath: null,
    latitude: null,
    longitude: null,
    name: '',
    number: '',
    chargerType: 'DC_FAST',
    price: 0,
    starRateAverage: 0,
    startTime: [0, 0],
    reviews: [],
  });
  const bottomSheetRef = useRef<BottomSheet>(null);
  const snapPoints = useMemo(() => [250, 700], [700, 250]);
  const [currentReview, setCurrentReview] = useState({});
  const handleSheetChanges = useCallback((index: number) => {
    console.log('handleSheetChanges', index);
  }, []);
  useEffect(() => {
    (async () => {
      if (Platform.OS === 'android' && !Device.isDevice) {
        setErrorMsg(
          'Oops, this will not work on Snack in an Android Emulator. Try it on your device!'
        );
        return;
      }
      let { status } = await Location.requestForegroundPermissionsAsync();
      if (status !== 'granted') {
        setErrorMsg('Permission to access location was denied');
        return;
      }

      let location = await Location.getCurrentPositionAsync({});
      setLocation(location);

      await getChargeLocation();
    })();
  }, []);
  useEffect(() => {
    let interval;

    if (isTimerOn) {
      interval = setInterval(() => {
        setTime((prevTime) => prevTime - 1);
      }, 1000);
    }

    // 타이머가 멈췄을 때, 혹은 컴포넌트가 unmount될 때 interval을 제거합니다.
    return () => clearInterval(interval);
  }, [isTimerOn]);

  const formatTime = (time) => {
    const minutes = Math.floor(time / 60);
    const seconds = time % 60;

    return `${String(minutes).padStart(2, '0')}:${String(seconds).padStart(
      2,
      '0'
    )}`;
  };
  const getChargeLocation = async () => {
    axios.get(`${baseURL}carCenter`).then((res) => {
      setChargeLocation(res.data);
      console.log(res.data);
    });
  };
  const images = {
    DC_FAST: require('../image/DC_FAST.png'),
    AC_3: require('../image/AC_3.png'),
    DC_DEMO: require('../image/DC_DEMO.png'),
    SLOW: require('../image/SLOW.png'),

    // 필요한 만큼 추가하세요.
  };
  return (
    <Box style={styles.container}>
      <Box style={styles.topOverlay}>
        <Input
          size='2xl'
          placeholder='충전소 검색'
          width='100%'
          height={'50'}
          borderRadius='30'
          bg={'gray.100'}
          InputLeftElement={
            <Icon
              ml='2'
              size='6'
              color='gray.400'
              as={<Ionicons name='ios-search' />}
            />
          }
        />
      </Box>
      <Box>
        <MapView
          camera={{
            center: {
              latitude: 35.90710840112608,
              longitude: 128.61331299999998,
            },
            pitch: 40,
            heading: 20,
            // Only on iOS MapKit, in meters. The property is ignored by Google Maps.
            altitude: 3000,

            // Only when using Google Maps.
            zoom: 15,
          }}
          style={styles.map}
        >
          {chargeLocation.map((item, index) => {
            return (
              <Marker
                title={item.name}
                description={item.content}
                image={require('../image/marker.png')}
                key={index}
                onPress={() => {
                  setLoading(false);
                  setCurrentCharge(item);
                  console.log(item);
                }}
                coordinate={{
                  latitude: item.latitude,
                  longitude: item.longitude,
                }}
              />
            );
          })}
        </MapView>
      </Box>
      <BottomSheet
        ref={bottomSheetRef}
        index={0}
        snapPoints={snapPoints}
        onChange={handleSheetChanges}
      >
        <Box style={styles.contentContainer}>
          {loading ? (
            <VStack>
              <HStack
                w='100%'
                maxW='400'
                space={8}
                rounded='md'
                _dark={{
                  borderColor: 'coolGray.500',
                }}
                _light={{
                  borderColor: 'coolGray.200',
                }}
                p='4'
              >
                <VStack flex='3' space='4'>
                  <Skeleton startColor='rgb(138,229, 246)' />
                  <Skeleton.Text />
                  <HStack space='2' alignItems='center'>
                    <Skeleton size='5' rounded='full' />
                    <Skeleton h='3' flex='2' rounded='full' />
                    <Skeleton
                      h='3'
                      flex='1'
                      rounded='full'
                      startColor='indigo.300'
                    />
                  </HStack>
                </VStack>
                <Skeleton
                  flex='1'
                  h='150'
                  rounded='md'
                  startColor='coolGray.100'
                />
              </HStack>
              <Center>
                <Divider w='90%' />
              </Center>
              <VStack w='350'>
                <Skeleton.Text m={5} />
                <Skeleton.Text m={5} />
                <Skeleton.Text m={5} />
                <Skeleton.Text m={5} />
              </VStack>
            </VStack>
          ) : (
            <VStack>
              <HStack
                w='100%'
                maxW='400'
                space={8}
                rounded='md'
                _dark={{
                  borderColor: 'coolGray.500',
                }}
                _light={{
                  borderColor: 'coolGray.200',
                }}
                p='4'
              >
                <VStack flex='3' space='2'>
                  <Button variant='subtle' onPress={() => setShowModal(true)}>
                    {isTimerOn ? formatTime(time) : '30분 바로 예약하기'}
                  </Button>

                  <HStack>
                    <Image
                      source={images[currentCharge.chargerType]}
                      alt='Alternate Text'
                      w={300}
                      h={20}
                      resizeMode='contain'
                    ></Image>
                  </HStack>

                  <HStack space={2} ml={2}>
                    <CheckIcon size='5' mt='0.5' color='emerald.500' />
                    <Text color='emerald.500' fontSize='md'>
                      충전기가 {currentCharge.chargerCount}대 남았습니다.
                    </Text>
                  </HStack>
                  <HStack space='2' alignItems='center'>
                    <StarRating
                      starSize={20}
                      rating={currentCharge.starRateAverage}
                      onChange={setRating}
                    />
                    <Text bold color='coolGray.600' fontSize='sm'>
                      1KW / {currentCharge.price}원
                    </Text>
                  </HStack>
                </VStack>

                <Image
                  flex='1'
                  h='150'
                  rounded='md'
                  source={{
                    uri: currentCharge.imagePath,
                  }}
                  alt='Alternate Text'
                  size='xl'
                />
              </HStack>
              <Center>
                <Divider w='90%' />
              </Center>
              <VStack>
                <Pressable
                  onPress={() =>
                    navigation.navigate('Review', currentCharge.reviews)
                  }
                >
                  {({ isPressed }) => {
                    return (
                      <Box
                        bg={isPressed ? 'coolGray.100' : 'white'}
                        style={{
                          transform: [
                            {
                              scale: isPressed ? 0.96 : 1,
                            },
                          ],
                        }}
                      >
                        <Heading size='md' mt={4} mx={5} mb={2}>
                          리뷰
                        </Heading>
                      </Box>
                    );
                  }}
                </Pressable>
                <FlatList
                  marginX={5}
                  data={currentCharge.reviews}
                  renderItem={({ item, index }) => (
                    <Box
                      borderBottomWidth='1'
                      _dark={{
                        borderColor: 'muted.50',
                      }}
                      borderColor='muted.800'
                      pl={['0', '4']}
                      pr={['0', '5']}
                      py='2'
                    >
                      <HStack space={2}>
                        <Avatar
                          size='48px'
                          source={{
                            uri: item.userImagePath,
                          }}
                        />
                        <VStack>
                          <Text
                            _dark={{
                              color: 'warmGray.50',
                            }}
                            color='coolGray.800'
                            bold
                          >
                            {item.title}
                          </Text>
                          <Text
                            fontSize='xs'
                            _dark={{
                              color: 'warmGray.50',
                            }}
                            color='coolGray.800'
                            alignSelf='flex-start'
                          >
                            {item.timeStamp}
                          </Text>
                        </VStack>
                        <Box ml={20}>
                          <StarRating
                            starSize={20}
                            maxStars={5}
                            rating={item.starRate}
                            onChange={setRating}
                          />
                        </Box>
                      </HStack>
                      <Text
                        color='coolGray.600'
                        _dark={{
                          color: 'warmGray.200',
                        }}
                      >
                        {item.content}
                      </Text>
                    </Box>
                  )}
                  keyExtractor={(item, index) => index.toString()}
                />
              </VStack>
            </VStack>
          )}
        </Box>
      </BottomSheet>

      <Modal
        isOpen={showModal}
        onClose={() => setShowModal(false)}
        _backdrop={{
          _dark: {
            bg: 'coolGray.800',
          },
          bg: 'warmGray.50',
        }}
      >
        <Modal.Content maxWidth='350' maxH='212'>
          <Modal.CloseButton />
          <Modal.Header>예약시 유의사항</Modal.Header>
          <Modal.Body>
            예약을 진행하게 되면 다른 충전소 예약을 진행하실 수 없으며, 노쇼시
            추후 예약이 제한될 수 있는 점 유의해주세요.
          </Modal.Body>
          <Modal.Footer>
            <Button.Group space={2}>
              <Button
                variant='ghost'
                colorScheme='blueGray'
                onPress={() => {
                  setShowModal(false);
                }}
              >
                취소하기
              </Button>
              <Button
                onPress={() => {
                  setShowModal(false);
                  setIsTimerOn(true);
                }}
              >
                예약하기
              </Button>
            </Button.Group>
          </Modal.Footer>
        </Modal.Content>
      </Modal>
    </Box>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  map: {
    width: '100%',
    height: '100%',
  },
  topOverlay: {
    position: 'absolute',
    top: 0,
    left: 0,
    width: '90%',
    backgroundColor: 'white',
    zIndex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    marginTop: 60,
    marginHorizontal: 20,
    borderRadius: 30,
  },
  bottomOverlay: {
    position: 'absolute',
    bottom: 0,
    left: 0,
    width: '100%',
    backgroundColor: 'white',
    zIndex: 1,
    justifyContent: 'center',
    alignItems: 'center',

    borderRadius: 30,
  },
  contentContainer: {
    flex: 1,
    alignItems: 'center',
  },
});
