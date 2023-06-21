import React, { useState, useEffect, createRef } from 'react';
import MapView, { Marker } from 'react-native-maps';
import { Platform, StyleSheet, View } from 'react-native';
import * as Location from 'expo-location';
import Device from 'expo-device';
import { Box, Icon, Input, ZStack } from 'native-base';
import { Ionicons } from '@expo/vector-icons';

export default function Main() {
  const [location, setLocation] = useState(null);
  const [errorMsg, setErrorMsg] = useState(null);

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
    })();
  }, []);

  return (
    <Box style={styles.container}>
      <Box style={styles.overlay}>
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
          followsUserLocation={true}
          showsUserLocation={true}
          style={styles.map}
        >
          <Marker coordinate={location}></Marker>
        </MapView>
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
  overlay: {
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
});
