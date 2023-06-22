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
INSERT INTO `car_center` (`id`, `content`, `end_time`, `image_path`, `name`, `number`, `price`, `start_time`, `address_id`) VALUES (1, '대구 서구 원대동1가114 2번지', '18:00:00', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ7-MfrwfsV1ziBQpconJXq7J7k7s3ZuqwyMorxXOZWDXHgl6gS6RspsheM2gzU0-6al0s&usqp=CAU', '다우 카센터', '053-880-4367', 1000, '01:00:00', 1);
INSERT INTO `car_center` (`id`, `content`, `end_time`, `image_path`, `name`, `number`, `price`, `start_time`, `address_id`) VALUES (2, '대구광역시 서구 가르뱅이로 87번지', '18:00:00', 'https://mblogthumb-phinf.pstatic.net/MjAyMTA3MjBfMTQ5/MDAxNjI2NzU4NTQ1NjUw.krESnSJT0ytHsUf18yhvhB_IoUWsDkwyET8l7kDebOMg.mWNlUdHuLU90iUBkTW6MyF3Xnp8FBHb_XhJBm81iuB0g.JPEG.pcplay83/DSC_9256.jpg?type=w800', '삼영카센타', '053-973-3824', 2000, '02:00:00', 2);
INSERT INTO `car_center` (`id`, `content`, `end_time`, `image_path`, `name`, `number`, `price`, `start_time`, `address_id`) VALUES (3, '대구광역시 북구 신천동로 718번지', '18:00:00', 'https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjExMTBfMjUz%2FMDAxNjY4MDQyMTgzMjE0.9SN72muW7qYNgUWLwxoYwrUv5aWfSeRLC4EVcksH6WYg.QSAVxlPxNQG6qTaBZ1ZMJwHFLK5pWIStZyaD3flVLwcg.JPEG.syc3515%2F1668042041382.jpg&type=sc960_832', '동아상사', '053-890-1545', 3000, '03:00:00', 3);
INSERT INTO `car_center` (`id`, `content`, `end_time`, `image_path`, `name`, `number`, `price`, `start_time`, `address_id`) VALUES (4, '대구 달성군 화원읍 성천로 142번지', '18:00:00', 'https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20200609_191%2F1591707156731r9w9Q_JPEG%2F3JIEPG2g_6iaZ6dgaUWx9BFF.jpg', '책임카센타', '053-904-9722', 4000, '04:00:00', 4);
INSERT INTO `car_center` (`id`, `content`, `end_time`, `image_path`, `name`, `number`, `price`, `start_time`, `address_id`) VALUES (5, '대구 서구 팔달로 72-6번지', '18:00:00', 'https://dnvefa72aowie.cloudfront.net/origin/smb/201810/7c8ea0aae8b4495c4e199eb14c175ed2a530e21590e274c48af4426d0a576f57.jpg?q=95&s=1440x1440&t=inside', '(주)오토세븐', '053-115-4158', 5000, '05:00:00', 5);
INSERT INTO `car_center` (`id`, `content`, `end_time`, `image_path`, `name`, `number`, `price`, `start_time`, `address_id`) VALUES (6, '대구 북구 노원동3가 735-3번지', '18:00:00', 'https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230330_259%2F1680135538902mGnqv_JPEG%2F%25B0%25F8%25C0%25E5_%25C7%25F6%25B4%25EB_%25B0%25A3%25C6%25C7_%25BB%25E7%25C1%25F8_2.jpg', '현대자동차(주)대구서비스센터', '053-128-5641', 6000, '06:00:00', 6);
INSERT INTO `car_center` (`id`, `content`, `end_time`, `image_path`, `name`, `number`, `price`, `start_time`, `address_id`) VALUES (7, '대구 북구 연암로 22번지', '18:00:00', 'https://mblogthumb-phinf.pstatic.net/20160625_90/godori_038_1466837400184HeerA_JPEG/20160625_123218.jpg?type=w800', '한국타이어경대써비스', '053-455-9181', 7000, '07:00:00', 7);
INSERT INTO `car_center` (`id`, `content`, `end_time`, `image_path`, `name`, `number`, `price`, `start_time`, `address_id`) VALUES (8, '대구 서구 서대구로63길 39번지', '18:00:00', 'https://localview.co.kr/cp/thumbnail/205647985.jpg', '장가이버', '053-118-2382', 8000, '08:00:00', 8);
INSERT INTO `car_center` (`id`, `content`, `end_time`, `image_path`, `name`, `number`, `price`, `start_time`, `address_id`) VALUES (9, '대구 달서구 염색공단천로1길 37번지', '18:00:00', 'https://mblogthumb-phinf.pstatic.net/MjAxOTA4MDhfMTk5/MDAxNTY1MjIzNTM0NTU1.T8n9ETWcswhMEED9jD43zLgXT408g9d7JM91ar15UPYg.mp5XCPZbotEnpzxP5OmGa_BdAyJM12JARNIW_LAg6Yog.PNG.ucar_blog/1.png?type=w800', '세방하이드로빽', '053-119-1111', 9000, '09:00:00', 9);
INSERT INTO `car_center` (`id`, `content`, `end_time`, `image_path`, `name`, `number`, `price`, `start_time`, `address_id`) VALUES (10, '대구 동구 아양로37길 70번지', '18:00:00', 'https://search.pstatic.net/common/?autoRotate=true&quality=100&type=f640_380&src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20190920_58%2F1568940254225O6SAz_JPEG%2FYAOVa8RVpxTfGYPSd9qAJwev.jpg', '신암카센타', '053-889-9386', 10000, '10:00:00', 10);

-- << Charger >> --
INSERT INTO charger (id, car_center_id, charger_type, current_type, minimum_time, volume)
VALUES (1, 1, 'DC_FAST', 'AVAILABLE',1, 1),
       (2, 1, 'AC_3', 'AVAILABLE',1, 1),
       (3, 1, 'DC_DEMO', 'AVAILABLE',1, 1),
       (4, 1, 'SLOW', 'AVAILABLE',1, 1),
       (5, 2, 'DC_FAST', 'AVAILABLE',1, 1),
       (6, 2, 'AC_3', 'AVAILABLE',1, 1),
       (7, 2, 'DC_DEMO', 'AVAILABLE',1, 1),
       (8, 2, 'SLOW', 'AVAILABLE',1, 1),
       (9, 3, 'DC_FAST', 'AVAILABLE',1, 1),
       (10, 3, 'AC_3', 'AVAILABLE',1, 1),
       (11, 3, 'DC_DEMO', 'AVAILABLE',1, 1),
       (12, 3, 'SLOW', 'AVAILABLE',1, 1),
       (13, 4, 'DC_FAST', 'AVAILABLE',1, 1),
       (14, 4, 'AC_3', 'AVAILABLE',1, 1),
       (15, 4, 'DC_DEMO', 'AVAILABLE',1, 1),
       (16, 4, 'SLOW', 'AVAILABLE',1, 1),
       (17, 5, 'DC_FAST', 'AVAILABLE',1, 1),
       (18, 5, 'AC_3', 'AVAILABLE',1, 1),
       (19, 5, 'DC_DEMO', 'AVAILABLE',1, 1),
       (20, 5, 'SLOW', 'AVAILABLE',1, 1),
       (21, 6, 'DC_FAST', 'AVAILABLE',1, 1),
       (22, 6, 'AC_3', 'AVAILABLE',1, 1),
       (23, 6, 'DC_DEMO', 'AVAILABLE',1, 1),
       (24, 6, 'SLOW', 'AVAILABLE',1, 1),
       (25, 7, 'DC_FAST', 'AVAILABLE',1, 1),
       (26, 7, 'AC_3', 'AVAILABLE',1, 1),
       (27, 7, 'DC_DEMO', 'AVAILABLE',1, 1),
       (28, 7, 'SLOW', 'AVAILABLE',1, 1),
       (29, 8, 'DC_FAST', 'AVAILABLE',1, 1),
       (30, 8, 'AC_3', 'AVAILABLE',1, 1),
       (31, 8, 'DC_DEMO', 'AVAILABLE',1, 1),
       (32, 8, 'SLOW', 'AVAILABLE',1, 1),
       (33, 9, 'DC_FAST', 'AVAILABLE',1, 1),
       (34, 9, 'AC_3', 'AVAILABLE',1, 1),
       (35, 9, 'DC_DEMO', 'AVAILABLE',1, 1),
       (36, 9, 'SLOW', 'AVAILABLE',1, 1),
       (37, 10, 'DC_FAST', 'AVAILABLE',1, 1),
       (38, 10, 'AC_3', 'AVAILABLE',1, 1),
       (39, 10, 'DC_DEMO', 'AVAILABLE',1, 1),
       (40, 10, 'SLOW', 'AVAILABLE',1, 1);
-- << User >> --
INSERT INTO user (id, name, email, phone_number)
VALUES (1, 'User 1', 'user1@gmail.com', '010-1111-1111'),
       (2, 'User 2', 'user2@gmail.com', '010-1112-1112'),
       (3, 'User 3', 'user3@gmail.com', '010-1113-1113'),
       (4, 'User 4', 'user4@gmail.com', '010-1114-1114'),
       (5, 'User 5', 'user5@gmail.com', '010-1115-1115');

-- << Review >> --
INSERT INTO review (id, content, created_time, modified_time, star_rate, title, car_center_id)
VALUES (1, 'Review 1 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 1, 'Review 1', 1),
       (2, 'Review 2 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 2, 'Review 2', 1),
       (3, 'Review 3 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 3, 'Review 3', 1),
       (4, 'Review 4 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 4, 'Review 4', 2),
       (5, 'Review 5 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 5, 'Review 5', 2),
       (6, 'Review 6 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 1, 'Review 6', 2),
       (7, 'Review 7 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 2, 'Review 7', 3),
       (8, 'Review 8 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 3, 'Review 8', 3),
       (9, 'Review 9 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 4, 'Review 9', 3),
       (10, 'Review 10 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 5, 'Review 10', 4),
       (11, 'Review 11 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 1, 'Review 11', 4),
       (12, 'Review 12 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 2, 'Review 12', 4),
       (13, 'Review 13 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 3, 'Review 13', 5),
       (14, 'Review 14 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 4, 'Review 14', 5),
       (15, 'Review 15 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 5, 'Review 15', 5),
       (16, 'Review 16 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 1, 'Review 16', 6),
       (17, 'Review 17 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 2, 'Review 17', 6),
       (18, 'Review 18 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 3, 'Review 18', 6),
       (19, 'Review 19 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 4, 'Review 19', 7),
       (20, 'Review 20 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 5, 'Review 20', 7),
       (21, 'Review 21 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 1, 'Review 21', 7),
       (22, 'Review 22 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 2, 'Review 22', 8),
       (23, 'Review 23 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 3, 'Review 23', 8),
       (24, 'Review 24 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 4, 'Review 24', 8),
       (25, 'Review 25 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 5, 'Review 25', 9),
       (26, 'Review 26 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 1, 'Review 26', 9),
       (27, 'Review 27 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 2, 'Review 27', 9),
       (28, 'Review 28 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 3, 'Review 28', 10),
       (29, 'Review 29 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 4, 'Review 29', 10),
       (30, 'Review 30 Content', '2023-06-01 11:31:14.982873', '2023-06-01 11:31:14.982873', 5, 'Review 30', 10);
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
