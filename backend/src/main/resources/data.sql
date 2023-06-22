-- << Address >> --
INSERT INTO address (id, latitude, longitude)
VALUES (1, 35.8804367, 128.5784586),
       (2, 35.88973824, 128.5596631),
       (3, 35.8901545, 128.5605071),
       (4, 35.89009722, 128.6190667),
       (5, 35.8900645, 128.5575349),
       (6, 35.89003301, 128.5641586),
       (7, 35.8899455, 128.6009181),
       (8, 35.88935019, 128.5552382),
       (9, 35.88920513, 128.5547843),
       (10, 35.88899386, 128.6334461);

-- << Car Center >> --
INSERT INTO `car_center` (`id`, `content`, `end_time`, `image_path`, `name`, `number`, `price`, `start_time`, `address_id`) VALUES (1, '대구 서구 원대동1가114 2', '18:00:00', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ7-MfrwfsV1ziBQpconJXq7J7k7s3ZuqwyMorxXOZWDXHgl6gS6RspsheM2gzU0-6al0s&usqp=CAU', '다우 카센터', '053-880-4367', 1000, '01:00:00', 1);
INSERT INTO `car_center` (`id`, `content`, `end_time`, `image_path`, `name`, `number`, `price`, `start_time`, `address_id`) VALUES (2, '대구 서구 가르뱅이로 87', '18:00:00', 'https://mblogthumb-phinf.pstatic.net/MjAyMTA3MjBfMTQ5/MDAxNjI2NzU4NTQ1NjUw.krESnSJT0ytHsUf18yhvhB_IoUWsDkwyET8l7kDebOMg.mWNlUdHuLU90iUBkTW6MyF3Xnp8FBHb_XhJBm81iuB0g.JPEG.pcplay83/DSC_9256.jpg?type=w800', '삼영카센타', '053-973-3824', 2000, '02:00:00', 2);
INSERT INTO `car_center` (`id`, `content`, `end_time`, `image_path`, `name`, `number`, `price`, `start_time`, `address_id`) VALUES (3, '대구 북구 신천동로 718', '18:00:00', 'https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjExMTBfMjUz%2FMDAxNjY4MDQyMTgzMjE0.9SN72muW7qYNgUWLwxoYwrUv5aWfSeRLC4EVcksH6WYg.QSAVxlPxNQG6qTaBZ1ZMJwHFLK5pWIStZyaD3flVLwcg.JPEG.syc3515%2F1668042041382.jpg&type=sc960_832', '동아상사', '053-890-1545', 3000, '03:00:00', 3);
INSERT INTO `car_center` (`id`, `content`, `end_time`, `image_path`, `name`, `number`, `price`, `start_time`, `address_id`) VALUES (4, '대구 달성군 화원읍 성천로 142', '18:00:00', 'https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20200609_191%2F1591707156731r9w9Q_JPEG%2F3JIEPG2g_6iaZ6dgaUWx9BFF.jpg', '책임카센타', '053-904-9722', 4000, '04:00:00', 4);
INSERT INTO `car_center` (`id`, `content`, `end_time`, `image_path`, `name`, `number`, `price`, `start_time`, `address_id`) VALUES (5, '대구 서구 팔달로 72-6', '18:00:00', 'https://dnvefa72aowie.cloudfront.net/origin/smb/201810/7c8ea0aae8b4495c4e199eb14c175ed2a530e21590e274c48af4426d0a576f57.jpg?q=95&s=1440x1440&t=inside', '(주)오토세븐', '053-115-4158', 5000, '05:00:00', 5);
INSERT INTO `car_center` (`id`, `content`, `end_time`, `image_path`, `name`, `number`, `price`, `start_time`, `address_id`) VALUES (6, '대구 북구 노원동3가 735-3', '18:00:00', 'https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230330_259%2F1680135538902mGnqv_JPEG%2F%25B0%25F8%25C0%25E5_%25C7%25F6%25B4%25EB_%25B0%25A3%25C6%25C7_%25BB%25E7%25C1%25F8_2.jpg', '현대자동차(주)대구서비스센터', '053-128-5641', 6000, '06:00:00', 6);
INSERT INTO `car_center` (`id`, `content`, `end_time`, `image_path`, `name`, `number`, `price`, `start_time`, `address_id`) VALUES (7, '대구 북구 연암로 22', '18:00:00', 'https://mblogthumb-phinf.pstatic.net/20160625_90/godori_038_1466837400184HeerA_JPEG/20160625_123218.jpg?type=w800', '한국타이어경대써비스', '053-455-9181', 7000, '07:00:00', 7);
INSERT INTO `car_center` (`id`, `content`, `end_time`, `image_path`, `name`, `number`, `price`, `start_time`, `address_id`) VALUES (8, '대구 서구 서대구로63길 39', '18:00:00', 'https://localview.co.kr/cp/thumbnail/205647985.jpg', '장가이버', '053-118-2382', 8000, '08:00:00', 8);
INSERT INTO `car_center` (`id`, `content`, `end_time`, `image_path`, `name`, `number`, `price`, `start_time`, `address_id`) VALUES (9, '대구 달서구 염색공단천로1길 37', '18:00:00', 'https://mblogthumb-phinf.pstatic.net/MjAxOTA4MDhfMTk5/MDAxNTY1MjIzNTM0NTU1.T8n9ETWcswhMEED9jD43zLgXT408g9d7JM91ar15UPYg.mp5XCPZbotEnpzxP5OmGa_BdAyJM12JARNIW_LAg6Yog.PNG.ucar_blog/1.png?type=w800', '세방하이드로빽', '053-119-1111', 9000, '09:00:00', 9);
INSERT INTO `car_center` (`id`, `content`, `end_time`, `image_path`, `name`, `number`, `price`, `start_time`, `address_id`) VALUES (10, '대구 동구 아양로37길 70', '18:00:00', 'https://search.pstatic.net/common/?autoRotate=true&quality=100&type=f640_380&src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20190920_58%2F1568940254225O6SAz_JPEG%2FYAOVa8RVpxTfGYPSd9qAJwev.jpg', '신암카센타', '053-889-9386', 10000, '10:00:00', 10);



-- << Charger >> --
INSERT INTO charger (id, car_center_id, charger_type, current_type, minimum_time, volume)
VALUES (1, 1, 'DC_FAST', 'AVAILABLE',1, 1),
       (2, 1, 'DC_FAST', 'AVAILABLE',1, 1),
       (3, 1, 'DC_FAST', 'AVAILABLE',1, 1),
       (4, 1, 'DC_FAST', 'AVAILABLE',1, 1),
       (5, 2, 'AC_3', 'AVAILABLE',1, 1),
       (6, 2, 'AC_3', 'AVAILABLE',1, 1),
       (7, 2, 'AC_3', 'AVAILABLE',1, 1),
       (8, 2, 'AC_3', 'AVAILABLE',1, 1),
       (9, 3, 'DC_DEMO', 'AVAILABLE',1, 1),
       (10, 3, 'DC_DEMO', 'AVAILABLE',1, 1),
       (11, 3, 'DC_DEMO', 'AVAILABLE',1, 1),
       (12, 3, 'DC_DEMO', 'AVAILABLE',1, 1),
       (13, 4, 'SLOW', 'AVAILABLE',1, 1),
       (14, 4, 'SLOW', 'AVAILABLE',1, 1),
       (15, 4, 'SLOW', 'AVAILABLE',1, 1),
       (16, 4, 'SLOW', 'AVAILABLE',1, 1),
       (17, 5, 'DC_FAST', 'AVAILABLE',1, 1),
       (18, 5, 'DC_FAST', 'AVAILABLE',1, 1),
       (19, 5, 'DC_FAST', 'AVAILABLE',1, 1),
       (20, 5, 'DC_FAST', 'AVAILABLE',1, 1),
       (21, 6, 'AC_3', 'AVAILABLE',1, 1),
       (22, 6, 'AC_3', 'AVAILABLE',1, 1),
       (23, 6, 'AC_3', 'AVAILABLE',1, 1),
       (24, 6, 'AC_3', 'AVAILABLE',1, 1),
       (25, 7, 'SLOW', 'AVAILABLE',1, 1),
       (26, 7, 'SLOW', 'AVAILABLE',1, 1),
       (27, 7, 'SLOW', 'AVAILABLE',1, 1),
       (28, 7, 'SLOW', 'AVAILABLE',1, 1),
       (29, 8, 'DC_FAST', 'AVAILABLE',1, 1),
       (30, 8, 'DC_FAST', 'AVAILABLE',1, 1),
       (31, 8, 'DC_FAST', 'AVAILABLE',1, 1),
       (32, 8, 'DC_FAST', 'AVAILABLE',1, 1),
       (33, 9, 'AC_3', 'AVAILABLE',1, 1),
       (34, 9, 'AC_3', 'AVAILABLE',1, 1),
       (35, 9, 'AC_3', 'AVAILABLE',1, 1),
       (36, 9, 'AC_3', 'AVAILABLE',1, 1),
       (37, 10, 'DC_DEMO', 'AVAILABLE',1, 1),
       (38, 10, 'DC_DEMO', 'AVAILABLE',1, 1),
       (39, 10, 'DC_DEMO', 'AVAILABLE',1, 1),
       (40, 10, 'DC_DEMO', 'AVAILABLE',1, 1);
-- << User >> --
INSERT INTO user (id, name, email, phone_number, time_stamp, image_path)
VALUES (1, 'Afreen Khan', 'user1@gmail.com', '010-1111-1111', '12:47 PM', 'https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500'),
       (2, 'Sujita Mathur', 'user2@gmail.com', '010-1112-1112', '11:11 PM', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTyEaZqT3fHeNrPGcnjLLX1v_W4mvBlgpwxnA&usqp=CAU'),
       (3, 'Anci Barroco', 'user3@gmail.com', '010-1113-1113', '6:22 PM', 'https://miro.medium.com/max/1400/0*0fClPmIScV5pTLoE.jpg'),
       (4, 'Aniket Kumar', 'user4@gmail.com', '010-1114-1114', '8:56 PM', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSr01zI37DYuR8bMV5exWQBSw28C1v_71CAh8d7GP1mplcmTgQA6Q66Oo--QedAN1B4E1k&usqp=CAU'),
       (5, 'Kiara', 'user5@gmail.com', '010-1115-1115', '12:47 PM', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRBwgu1A5zgPSvfE83nurkuzNEoXs9DMNr8Ww&usqp=CAU');

-- << Review >> --
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (1, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '카센터 서비스가 매우 훌륭했습니다.', 4, '이서연', 1, 1);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (2, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '카센터의 작업 속도가 아주 빨랐습니다.', 4, '박준호', 1, 2);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (3, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '카센터의 전기차 충전 서비스는 매우 편리하고 신속했습니다.', 3, '김지민', 1, 3);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (4, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '충전 시설이 청결하고 잘 관리되어 있어 안심하고 전기차를 충전할 수 있었습니다.', 4, '최하늘', 1, 4);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (5, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '충전 요금이 합리적이었고, 투명하게 안내되어 있어 이용자들에게 신뢰감을 줬습니다.', 5, '정윤서', 1, 5);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (6, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '카센터의 시설과 장비가 최신이었고, 기술력이 뛰어났습니다.', 5, '한승우', 2, 1);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (7, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '가격 대비 서비스의 질이 훌륭했습니다.', 2, '송예린', 2, 2);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (8, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '카센터 직원들이 전기차 충전에 대해 전문적인 지식을 갖고 있어서 문의사항에 대한 정확한 답변을 받을 수 있었습니다.', 3, '장성민', 2, 3);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (9, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '충전 시간이 예상보다 빠르게 진행되어 기다림 없이 빠르게 출발할 수 있었습니다.', 4, '윤가온', 2, 4);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (10, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '카센터 주변에 충전소가 위치해 있어 편리하게 충전할 수 있었습니다.', 5, '이지호', 2, 5);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (11, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '카센터 직원들의 커뮤니케이션이 원활했습니다.', 1, '박하율', 3, 1);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (12, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '카센터에서는 청결과 정리에 신경을 많이 썼습니다.', 5, '김주아', 3, 2);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (13, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '충전기의 상태가 좋아서 안전하게 충전할 수 있었습니다.', 3, '최현우', 3, 3);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (14, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '전기차 충전 시간 동안 편안한 대기 공간과 편의시설을 제공해주어 기다리는 동안 휴식을 취할 수 있었습니다.', 2, '정서영', 3, 4);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (15, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '카센터 방문 시 대기 시간이 짧았습니다.', 3, '한민재', 3, 5);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (16, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '카센터에서 제공하는 보증과 서비스 후 지원이 믿을만했습니다.', 3, '송하린', 4, 1);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (17, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '카센터의 전기차 충전 서비스는 24시간 이용 가능해서 시간에 구애받지 않고 충전할 수 있어 편리했습니다.', 4, '장윤석', 4, 2);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (18, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '전기차 충전 서비스 이용 시 충전 상태 모니터링이 가능하여 언제든지 충전 진행 상황을 확인할 수 있어 편리했습니다.', 1, '윤하진', 4, 3);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (19, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '카센터에서 수리한 차량의 상태가 매우 좋았습니다.', 1, '이은서', 4, 4);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (20, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '카센터의 전문성과 경험이 돋보이는 서비스로 인해 다시 방문하고 싶은 마음이 들었습니다.', 2, '박준혁', 4, 5);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (21, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '카센터의 전기차 충전 서비스는 매우 편리하고 신속합니다.', 1, '김서아', 5, 1);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (22, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '충전 시설이 잘 관리되어 있어 신뢰할 수 있었습니다. 충전기의 작동이 안정적이었고, 언제나 충분한 전력을 공급해 주었습니다.', 2, '최재민', 5, 2);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (23, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '카센터의 전기차 충전 요금이 합리적이었습니다.', 3, '정지훈', 5, 3);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (24, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '전기차 충전 시간이 빨라서 기다릴 필요가 없었습니다.', 2, '한아름', 5, 4);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (25, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '전기차 충전 시 충전기 사용 방법에 대한 친절한 안내가 제공되었습니다.', 1, '송도윤', 5, 5);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (26, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '카센터의 전기차 충전 시설은 청결하고 잘 정돈되어 있었습니다.', 5, '장하은', 6, 1);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (27, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '전기차 충전 중에 발생한 문제에 대해 카센터 직원들이 신속하게 대응해 주었습니다.', 5, '윤민서', 6, 2);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (28, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '카센터의 전기차 충전 서비스는 24시간 이용할 수 있어 편리했습니다.', 3, '이재혁', 4, 3);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (29, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '충전 시에는 카센터에서 제공하는 편안한 대기 공간을 이용할 수 있었습니다.', 4, '박소율', 4, 4);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (30, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '카센터의 전기차 충전 서비스는 전문적이고 안전한 느낌을 줍니다.', 5, '김하린', 6, 5);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (31, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '카센터의 전기차 충전 서비스는 탁월했습니다.', 4, '최윤호', 7, 1);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (32, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '전문성과 친절한 태도가 인상적이었습니다.', 3, '정가은', 7, 2);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (33, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '예약 시간을 엄수하며 신속하게 작업을 마무리해 주셨습니다.', 3, '한민지', 7, 3);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (34, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '충전기 설치와 충전 과정이 원활했습니다.', 4, '송하윤', 7, 4);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (35, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '정확하고 효과적인 수리를 해주셨습니다.', 5, '장도현', 7, 5);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (36, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '합리적인 가격에 퀄리티 높은 작업을 받을 수 있었습니다.', 1, '윤서아', 8, 1);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (37, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '주변 환경도 좋아 쉴 수 있는 공간이 있어 좋았습니다.', 2, '이준호', 8, 2);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (38, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '요구사항을 정확히 이해하고 충분한 설명을 제공해 주셨습니다.', 3, '박지민', 8, 3);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (39, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '작업 공간이 깔끔하고 청결하게 유지되어 있었습니다.', 2, '김현우', 8, 4);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (40, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '정기적인 점검과 유지보수가 확실히 이루어지는 것 같았습니다.', 1, '최하린', 8, 5);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (41, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '효율적인 일정 관리로 고객들의 시간을 소중히 여기는 모습이 보였습니다.', 1, '정수민', 9, 1);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (42, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '만족도를 최우선으로 생각하는 모습이 인상적이었습니다.', 2, '한서영', 9, 2);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (43, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '정확한 수리와 점검으로 안전하게 운전할 수 있게 해주셨습니다.', 1, '송민재', 9, 3);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (44, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '충전기 설치와 결제 과정이 간편하여 사용하기 편리했습니다.', 4, '장지율', 9, 4);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (45, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '다른 충전소보다 경제적으로 이용할 수 있어 만족스러웠습니다.', 5, '윤하연', 9, 5);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (46, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '충전 속도가 빠르게 제공되어 출발 전력을 충분히 얻을 수 있었습니다.', 5, '이도현', 10, 1);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (47, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '처음 전기차를 이용하는 사람들에게도 쉽게 이해할 수 있도록 설명해 주셨습니다.', 3, '박서아', 10, 2);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (48, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '충전 공간이 깔끔하게 관리되어 사용자 경험이 좋았습니다.', 4, '김준호', 10, 3);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (49, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '문제 해결을 위해 노력하는 모습이 보여 안심할 수 있었습니다.', 4, '최예린', 10, 4);
INSERT INTO `review` (`id`, `created_time`, `modified_time`, `content`, `star_rate`, `title`, `car_center_id`, `user_id`) VALUES (50, '2023-06-01 11:31:15.000000', '2023-06-01 11:31:15.000000', '언제든지 필요한 시간에 충전할 수 있어서 편안했습니다.', 5, '정하늘', 10, 5);

--<< Reservation >>--
INSERT INTO reservation (id, car_center_id, user_id, created_time, modified_time, reservation_status)
VALUES (1, 1, 1, '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 'REGISTERED'),
       (2, 2, 2, '2023-06-02 11:31:14.982873', '2023-06-02 11:31:14.982873', 'REGISTERED'),
       (3, 3, 3, '2023-06-03 11:31:14.982873', '2023-06-03 11:31:14.982873', 'REGISTERED'),
       (4, 4, 4, '2023-06-04 11:31:14.982873', '2023-06-04 11:31:14.982873', 'REGISTERED'),
       (5, 5, 5, '2023-06-05 11:31:14.982873', '2023-06-05 11:31:14.982873', 'REGISTERED');

--<< Payment >>--
INSERT INTO payment (id, user_id, car_center_id, created_time, modified_time, payment_type, amount)
VALUES (1, 1, 1, '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 'CARD', 11000),
       (2, 1, 2, '2023-06-02 11:31:14.982873', '2023-06-02 11:31:14.982873', 'DAEGU_HAPPY_PAY', 12000),
       (3, 1, 3, '2023-06-03 11:31:14.982873', '2023-06-03 11:31:14.982873', 'DAEGU_RO_CARD', 13000),
       (4, 2, 4, '2023-06-04 11:31:14.982873', '2023-06-04 11:31:14.982873', 'DEPOSIT', 14000),
       (5, 2, 5, '2023-06-05 11:31:14.982873', '2023-06-05 11:31:14.982873', 'ONNURI_GIFT_CARD', 15000),
       (6, 2, 6, '2023-06-06 11:31:14.982873', '2023-06-06 11:31:14.982873', 'DAEGU_HAPPY_PAY', 16000),
       (7, 3, 7, '2023-06-07 11:31:14.982873', '2023-06-07 11:31:14.982873', 'DAEGU_RO_CARD', 17000),
       (8, 3, 8, '2023-06-08 11:31:14.982873', '2023-06-08 11:31:14.982873', 'DEPOSIT', 18000),
       (9, 3, 9, '2023-06-09 11:31:14.982873', '2023-06-09 11:31:14.982873', 'ONNURI_GIFT_CARD', 19000);
