import React from 'react';
import {KakaoMapView} from '@jiggag/react-native-kakao-maps';
const Main = () => {
  return (
    <KakaoMapView
      markerImageUrl="https://github.com/jiggag/react-native-kakao-maps/blob/develop/example/custom_image.png?raw=true"
      markerList={[
        {
          lat: 37.59523,
          lng: 127.086,
          markerName: 'marker',
        },
        {
          lat: 37.59523,
          lng: 127.08705,
          markerName: 'marker2',
        },
      ]}
      width={300}
      height={500}
      centerPoint={{
        lat: 37.59523,
        lng: 127.086,
      }}
      onChange={event => {
        console.log('[onChange]', event.nativeEvent);
      }}
    />
  );
};

export default Main;
