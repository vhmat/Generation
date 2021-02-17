create database padoca;

-- Database named padoca just created

use padoca; 

-- Using database 

CREATE TABLE tb_cliente (
	codigo bigint auto_increment,
    nome varchar(255) not NULL,
    cpf char(11) not NULL,
    celular char(12),
    endereco varchar(255),
    numero int,
    cep char(8),   
    
    primary key (codigo)
);

insert into tb_cliente(nome, cpf, celular, endereco, numero, cep) 
	values ("Cliente", "33333333390", "099999999999", "Rua dos Esmeros", 8, "13133333");  
insert into tb_cliente(nome, cpf, celular, endereco, numero, cep) 
	values ("Lucas Gato", "33333333391", "099999999998", "Rua das Esmeraldas", 7, "13133334");
insert into tb_cliente(nome, cpf, celular, endereco, numero, cep) 
	values ("Bruno Santos", "33333333380", "099999999997", "Rua das Esmeraldinas", 6, "13133335");
insert into tb_cliente(nome, cpf, celular, endereco, numero, cep) 
	values ("Ana Cruz", "33333333370", "099999999996", "Rua das Esmeraldas negras", 5, "13133336");


