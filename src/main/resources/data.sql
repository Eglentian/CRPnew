CREATE TABLE "CarRental".car(
                                id int NOT NULL PRIMARY KEY,
                                model varchar(50) NOT NULL,
                                power int NOT NULL,
                                price int NOT NULL,
                                status varchar(50) NOT NULL
);

CREATE TABLE "CarRental".user (
                                  id int NOT NULL PRIMARY KEY,
                                  name varchar(50) NOT NULL,
                                  role varchar(50) NOT NULL,
                                  email varchar(50) NOT NULL UNIQUE,
                                  password varchar(50) NOT NULL
);

CREATE TABLE "CarRental".order (
                                   id int NOT NULL,
                                   created_on date,
                                   status varchar(50) NOT NULL,
                                   user_id int NOT NULL,
                                   car_id int NOT NULL,
                                   CONSTRAINT fk_user_id_fk_1 FOREIGN KEY (user_id) REFERENCES "CarRental".user(id),
                                   CONSTRAINT fk_car_id_fk_2 FOREIGN KEY (car_id) REFERENCES "CarRental".car(id)
);

INSERT INTO "CarRental".user(
    id, name, role, email, password)
VALUES ('1','Jani','user','jani@gmail.com','jani'),
       ('2','Tester','user','tester@gmail.com','tester')
;

INSERT INTO "CarRental".car(
    id, model, power, price, status)
VALUES ('1','OpelCorsa','1000','20','free'),
       ('2','ToyotaAuris','1600','35','free'),
       ('3','ToyotaYaris','1200','25','free')
;

