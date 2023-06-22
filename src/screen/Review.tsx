import { StackActions } from '@react-navigation/native';
import {
  Box,
  Text,
  Heading,
  VStack,
  FormControl,
  Input,
  Link,
  Button,
  HStack,
  Center,
  FlatList,
  Avatar,
} from 'native-base';
import StarRating from 'react-native-star-rating-widget';

import { useEffect, useState } from 'react';
import axios from 'axios';

export default function Review({ navigation, route }) {
  const [review, setReview] = useState([]);
  const [comment, setComment] = useState('');
  const handleChange = (text) => setComment(text);
  useEffect(() => {
    setReview(route.params);
  }, []);

  return (
    <Box flex={1}>
      <Heading size='md' m={5}>
        리뷰
      </Heading>
      <FlatList
        marginX={5}
        data={review}
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
                  onChange={(rating) => console.log(rating)}
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
      <Box safeArea>
        <Input
          type={'text'}
          w='100%'
          py='0'
          onChangeText={handleChange}
          value={comment}
          InputRightElement={
            <Button
              size='xs'
              rounded='none'
              w='1/6'
              h='full'
              onPress={() => {
                setComment('');
                setReview((prev) => [
                  ...prev,
                  {
                    content: comment,
                    starRate: 5,
                    timeStamp: '6:22 PM',
                    title: '성민',
                    userImagePath:
                      'https://miro.medium.com/max/1400/0*0fClPmIScV5pTLoE.jpg',
                  },
                ]);
              }}
            >
              <Text>게시</Text>
            </Button>
          }
          placeholder='리뷰 작성'
        />
      </Box>
    </Box>
  );
}
