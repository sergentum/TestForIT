DELETE FROM car_part;
DELETE FROM part;
DELETE FROM car;

ALTER SEQUENCE car_seq RESTART WITH 1;
ALTER SEQUENCE part_seq RESTART WITH 1;

INSERT INTO car (name) VALUES ('Audi');
INSERT INTO car (name) VALUES ('BMW');
INSERT INTO car (name) VALUES ('Volvo');
INSERT INTO car (name) VALUES ('Mercedes-Benz');
INSERT INTO car (name) VALUES ('Ford');

INSERT INTO part (name) VALUES ('Wheels');
INSERT INTO part (name) VALUES ('Side mirror');
INSERT INTO part (name) VALUES ('Hood');
INSERT INTO part (name) VALUES ('Bumper');
INSERT INTO part (name) VALUES ('Light');
--
INSERT INTO car_part VALUES (1, 2);
INSERT INTO car_part VALUES (3, 5);
INSERT INTO car_part VALUES (2, 4);
INSERT INTO car_part VALUES (1, 2);
INSERT INTO car_part VALUES (1, 1);
INSERT INTO car_part VALUES (4, 1);
INSERT INTO car_part VALUES (5, 3);
INSERT INTO car_part VALUES (3, 1);
INSERT INTO car_part VALUES (5, 1);
INSERT INTO car_part VALUES (2, 2);