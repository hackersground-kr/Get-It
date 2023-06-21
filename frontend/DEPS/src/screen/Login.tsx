/* eslint-disable react/react-in-jsx-scope */
import {StackActions} from '@react-navigation/native';
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
} from 'native-base';
import {useState} from 'react';
import axios from 'axios';

export default function Login({navigation}: any) {
  const [id, setId] = useState('');
  const [password, setPassword] = useState('');

  //   const logIn = () => {
  //     axios
  //       .post(
  //         'http://ec2-54-180-89-26.ap-northeast-2.compute.amazonaws.com:8080/user/login',
  //         {
  //           userId: id,
  //           userPw: password,
  //         },
  //       )
  //       .then(function (response: any) {
  //         navigation.dispatch(StackActions.replace('Main', {}));

  //         console.log(response.data);
  //       })
  //       .catch(function (error: any) {
  //         console.log(error);
  //       });
  //   };

  return (
    <Center flex={1} px="3">
      <Center w="100%">
        <Box safeArea p="2" py="8" w="90%" maxW="290">
          <Heading
            size="3xl"
            fontWeight="600"
            color="coolGray.800"
            _dark={{
              color: 'warmGray.50',
            }}>
            DEPS
          </Heading>
          <Heading
            mt="1"
            _dark={{
              color: 'warmGray.200',
            }}
            color="coolGray.600"
            fontWeight="medium"
            size="xs">
            로그인해서 모든 기능을 이용하세요!
          </Heading>

          <VStack space={3} mt="5">
            <FormControl>
              <FormControl.Label>ID</FormControl.Label>
              <Input onChangeText={e => setId(e)} />
            </FormControl>
            <FormControl>
              <FormControl.Label>Password</FormControl.Label>
              <Input type="password" onChangeText={e => setPassword(e)} />
              <Link
                _text={{
                  fontSize: 'xs',
                  fontWeight: '500',
                  color: 'indigo.500',
                }}
                alignSelf="flex-end"
                mt="1">
                아이디 찾기
              </Link>
              <Link
                _text={{
                  fontSize: 'xs',
                  fontWeight: '500',
                  color: 'indigo.500',
                }}
                alignSelf="flex-end"
                mt="1">
                비밀번호 찾기
              </Link>
            </FormControl>
            <Button
              mt="2"
              colorScheme="indigo"
              onPress={() => {
                navigation.navigate('Main');
              }}>
              로그인
            </Button>
            <HStack mt="6" justifyContent="center">
              <Text
                fontSize="sm"
                color="coolGray.600"
                _dark={{
                  color: 'warmGray.200',
                }}>
                새로운 사용자 인가요?{' '}
              </Text>
              <Link
                _text={{
                  color: 'indigo.500',
                  fontWeight: 'medium',
                  fontSize: 'sm',
                }}
                onPress={() => {
                  //   logIn();
                  navigation.navigate('Signup');
                }}>
                회원가입
              </Link>
            </HStack>
          </VStack>
        </Box>
      </Center>
    </Center>
  );
}
