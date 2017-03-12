DROP TABLE IF EXISTS car_part;
DROP TABLE IF EXISTS part;
DROP TABLE IF EXISTS car;
DROP SEQUENCE IF EXISTS car_seq;
DROP SEQUENCE IF EXISTS part_seq;
DROP SEQUENCE IF EXISTS car_part_seq;

CREATE SEQUENCE car_seq START 1;
CREATE SEQUENCE part_seq START 1;
CREATE SEQUENCE car_part_seq START 1;

CREATE TABLE car
(
  id         INTEGER PRIMARY KEY DEFAULT nextval('car_seq'),
  name       VARCHAR NOT NULL
);

CREATE TABLE part
(
  id        INTEGER PRIMARY KEY DEFAULT nextval('part_seq'),
  name      VARCHAR NOT NULL
);

CREATE TABLE car_part (
  id          INTEGER PRIMARY KEY DEFAULT nextval('car_part_seq'),
  car_id      INTEGER NOT NULL,
  part_id     INTEGER NOT NULL ,
  FOREIGN KEY (car_id) REFERENCES car (id) ON DELETE CASCADE,
  FOREIGN KEY (part_id) REFERENCES part (id) ON DELETE CASCADE
);