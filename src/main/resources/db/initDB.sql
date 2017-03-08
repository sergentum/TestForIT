DROP TABLE IF EXISTS car_part;
DROP TABLE IF EXISTS part;
DROP TABLE IF EXISTS car;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START 1;

CREATE TABLE car
(
  id         INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  name       VARCHAR NOT NULL
);
--
-- CREATE TABLE part
-- (
--   id        INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
--   name      VARCHAR NOT NULL
-- );
--
-- CREATE TABLE car_part (
--   id          INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
--   car_id      INTEGER NOT NULL,
--   part_id     INTEGER NOT NULL ,
--   FOREIGN KEY (car_id) REFERENCES car (id) ON DELETE CASCADE,
--   FOREIGN KEY (part_id) REFERENCES part (id) ON DELETE CASCADE
-- );