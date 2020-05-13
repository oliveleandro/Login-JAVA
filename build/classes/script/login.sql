create database projeto;

use projeto;

CREATE TABLE usuario (
login varchar(50) NOT NULL primary key,
senha blob NOT NULL
);

/* A chave da criptografia e fatec */
insert into usuario (login, senha) values ('admin', AES_ENCRYPT('12345','fatec'));

select * from usuario