CREATE TABLE USER(
	ID INT,
	NAME VARCHAR(20)
);

SELECT * FROM  `USER` u 

CREATE TABLE people(
	person_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	last_name TEXT(255),
	first_name TEXT(255),
	address TEXT(255),
	city CHAR(255)
)

INSERT INTO `people` (`person_id`, `last_name`, `first_name`, `address`, `city`) 
VALUES ('1', 'Vásquez', 'Israel', 'Calle Famosa Num 1', 'México'),
	       ('2', 'Hernández', 'Mónica', 'Reforma 222', 'México'),
	       ('3', 'Alanis', 'Edgar', 'Central 1', 'Monterrey');\

SELECT * FROM people p

CREATE VIEW `v` AS 
SELECT * FROM people p2 

SELECT * FROM v 