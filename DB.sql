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

INSERT INTO conta(nome_titular, sobrenome_titular, email, senha) 
VALUES("Maximiliano", "Gómez", "max@gm.com", "1234");

SELECT * FROM conta; -- WHERE email = "maxi@gmail.com" AND senha = @senha;

-- DELETE FROM conta WHERE id = null;