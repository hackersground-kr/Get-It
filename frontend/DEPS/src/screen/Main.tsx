import React, {
  useState,
  useEffect,
  useMemo,
  useRef,
  useCallback,
} from 'react';
import MapView, { Marker } from 'react-native-maps';
import { Platform, StyleSheet, View, Text } from 'react-native';
import * as Location from 'expo-location';
import BottomSheet from '@gorhom/bottom-sheet';
import Device from 'expo-device';
import {
  Box,
  Center,
  HStack,
  Icon,
  Input,
  Skeleton,
  VStack,
} from 'native-base';
import { Ionicons } from '@expo/vector-icons';
import axios from 'axios';

const baseURL = 'https://hg3498-app.azurewebsites.net/api/';

export default function Main() {
  const [location, setLocation] = useState({
    coords: { latitude: 0, longitude: 0 },
  });
  const [chargeLocation, setChargeLocation] = useState([]);
  const [errorMsg, setErrorMsg] = useState(null);
  const [modalVisible, setModalVisible] = useState(false);

  const bottomSheetRef = useRef<BottomSheet>(null);
  const snapPoints = useMemo(() => ['25%', '50%'], []);
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

      getChargeLocation();
    })();
  }, []);

  const getChargeLocation = async () => {
    await axios.get(`${baseURL}carCenter`).then((res) => {
      setChargeLocation(res.data);
    });
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
          showsUserLocation={true}
          onMarkerPress={(e) => {
            console.log(e.nativeEvent);
            setModalVisible(true);
          }}
          camera={{
            center: {
              latitude: location.coords.latitude,
              longitude: location.coords.longitude,
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
          {chargeLocation.map((item, index) => (
            <Marker
              title='YIKES, Inc.'
              description='Web Design and Development'
              image={require('../image/marker.png')}
              key={index}
              coordinate={{
                latitude: item.latitude,
                longitude: item.longitude,
              }}
            />
          ))}
        </MapView>
      </Box>
      <Box style={styles.bottomOverlay}>
        <Center w='100%'>
          {/* <HStack
            w='100%'
            maxW='400'
            borderWidth='1'
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
              <Skeleton startColor='amber.300' />
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
            <Skeleton flex='1' h='150' rounded='md' startColor='coolGray.100' />
          </HStack> */}
          <BottomSheet
            ref={bottomSheetRef}
            index={1}
            snapPoints={snapPoints}
            onChange={handleSheetChanges}
          >
            <View style={styles.contentContainer}>
              <Text>Awesome 🎉</Text>
            </View>
          </BottomSheet>
        </Center>
      </Box>
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
