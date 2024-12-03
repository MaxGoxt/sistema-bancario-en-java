DROP DATABASE IF EXISTS `banco`;
CREATE DATABASE `banco`;
USE `banco`;

CREATE TABLE IF NOT EXISTS conta(
	id int auto_increment primary key,
    data_criacao date default(current_date()),
    nome_titular varchar(50) not null,
    sobrenome_titular varchar(50) not null,
    email varchar(120) unique not null,
    senha varchar(50) not null,
    saldo float default(0.0) not null
);

Delimiter $$

CREATE PROCEDURE CREATE_COUNT(
		IN nome VARCHAR(50), 
		IN sobrenome VARCHAR(50), 
		IN inEmail VARCHAR(120), 
		IN inSenha VARCHAR(50)
        )
BEGIN

INSERT INTO conta(nome_titular, sobrenome_titular, email, senha) 
VALUE(nome, sobrenome, inEmail, inSenha);

SELECT * FROM conta 
ORDER BY id DESC
LIMIT 1;
END$$

Delimiter ;


Delimiter $$

CREATE PROCEDURE TRANSFER(
		IN FromCount INT, 
		IN ToCountEmail VARCHAR(50), 
		IN Mount FLOAT(10,2))
BEGIN
DECLARE saldo_suficiente BOOLEAN; 

SELECT saldo >= Mount INTO saldo_suficiente 
FROM conta 
WHERE id = FromCount;

IF Mount > 0 AND saldo_suficiente THEN
	UPDATE conta SET saldo = saldo - Mount WHERE id = FromCount;
	UPDATE conta SET saldo = saldo + Mount WHERE email = ToCountEmail;
END IF;

END $$

Delimiter ;


Delimiter $$
CREATE PROCEDURE DELETE_COUNT(IN inId INT)
BEGIN
DELETE FROM conta WHERE id = inId;
END$$
Delimiter ;


Delimiter $$
CREATE PROCEDURE SET_SALDO(IN inId INT, IN mount FLOAT(10,2))
BEGIN

UPDATE conta SET saldo = mount WHERE id = inId;

END$$
Delimiter ;

CALL CREATE_COUNT("Maximiliano", "Gómez", "max@gm.com", "1234");
CALL CREATE_COUNT("Max", "Test", "maxi@gm.com", "1234");
UPDATE conta SET saldo = 20 WHERE id = 1;
CALL TRANSFER(1, 2, 10);
CALL TRANSFER(1, 2, 80);
CALL SET_SALDO(1,20.0);
SELECT * FROM conta 
ORDER BY id DESC;
