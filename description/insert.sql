INSERT INTO `car_builder`.`car_type` (`id`,`name`,`brand`) VALUES (1, "Ignite", "Saxaki");
INSERT INTO `car_builder`.`car_type` (`id`,`name`,`brand`) VALUES (2, "Kiara", "Saxaki");
INSERT INTO `car_builder`.`car_type` (`id`,`name`,`brand`) VALUES (3, "Clift", "Saxaki");
INSERT INTO `car_builder`.`car_type` (`id`,`name`,`brand`) VALUES (4, "NZ/X-10", "Yolyo");
INSERT INTO `car_builder`.`car_type` (`id`,`name`,`brand`) VALUES (5, "NZ/X-20", "Yolyo");
INSERT INTO `car_builder`.`car_type` (`id`,`name`,`brand`) VALUES (6, "Two", "Tazma");
INSERT INTO `car_builder`.`car_type` (`id`,`name`,`brand`) VALUES (7, "Three", "Tazma");
INSERT INTO `car_builder`.`car_type` (`id`,`name`,`brand`) VALUES (8, "Dorottya", "Kotyoga");
INSERT INTO `car_builder`.`car_type` (`id`,`name`,`brand`) VALUES (9, "Radir", "Kotyoga");
INSERT INTO `car_builder`.`car_type` (`id`,`name`,`brand`) VALUES (10, "Apentis", "Kotyoga");

INSERT INTO `car_builder`.`part_storage` (`id`,`name`,`number`) VALUES (1,"Motor",1002);
INSERT INTO `car_builder`.`part_storage` (`id`,`name`,`number`) VALUES (2,"Wheel",2174);
INSERT INTO `car_builder`.`part_storage` (`id`,`name`,`number`) VALUES (3,"Seat",2041);
INSERT INTO `car_builder`.`part_storage` (`id`,`name`,`number`) VALUES (4,"Car Body",14268);
INSERT INTO `car_builder`.`part_storage` (`id`,`name`,`number`) VALUES (5,"Tank",1988);
INSERT INTO `car_builder`.`part_storage` (`id`,`name`,`number`) VALUES (6,"Other Motor Parts",4215);
INSERT INTO `car_builder`.`part_storage` (`id`,`name`,`number`) VALUES (7,"Electronic Parts",5423);

INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (1,1,1);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (2,1,3);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (3,1,2);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (4,1,14);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (5,1,1);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (6,1,5);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (1,2,1);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (2,2,4);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (3,2,4);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (4,2,20);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (5,2,1);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (6,2,7);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (7,2,8);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (1,3,1);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (2,3,4);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (3,3,4);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (4,3,18);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (5,3,1);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (6,3,6);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (1,4,1);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (2,4,4);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (3,4,5);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (4,4,24);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (5,4,1);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (6,4,11);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (7,4,10);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (1,5,2);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (2,5,4);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (3,5,4);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (4,5,27);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (5,5,2);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (6,5,17);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (7,5,25);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (1,6,1);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (2,6,4);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (3,6,4);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (4,6,18);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (5,6,1);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (6,6,6);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (7,6,13);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (1,7,1);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (2,7,4);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (3,7,4);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (4,7,19);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (5,7,1);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (6,7,7);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (7,7,16);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (1,8,1);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (2,8,4);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (3,8,5);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (4,8,18);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (5,8,1);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (6,8,9);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (7,8,12);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (1,9,1);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (2,9,4);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (3,9,4);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (4,9,24);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (5,9,1);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (6,9,8);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (7,9,11);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (1,10,1);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (2,10,4);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (3,10,5);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (4,10,24);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (5,10,1);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (6,10,10);
INSERT INTO `car_builder`.`car_part_connection` (`part_storage_id`,`car_type_id`,number) VALUES (7,10,16);

