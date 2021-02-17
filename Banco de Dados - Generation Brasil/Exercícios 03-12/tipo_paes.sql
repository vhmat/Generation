create database padoca;

use padoca;

create table tipo_paes (
codigo bigint auto_increment,
descricao varchar (70),
disponivel boolean,
valor decimal (10,2),

primary key (codigo)

);
insert into tipo_paes (descricao, disponivel, valor) values ("PÃO FRANCES", true, 5.9);
insert into tipo_paes  (descricao, disponivel, valor) values ("PÃO ITALIANO", true, 15.00);
insert into tipo_paes (descricao, disponivel, valor) values ("PÃO DE LEITE", false, 2.10);
insert into tipo_paes (descricao, disponivel, valor) values ("PÃO AUSTRALIANO", true ,8.90);
insert into tipo_paes (descricao, disponivel, valor) values ("PÃO CASEIRO", false ,10.00);
insert into tipo_paes (descricao, disponivel, valor) values ("PÃO PRETO", true, 23.90);
insert into tipo_paes (descricao, disponivel, valor) values ("PÃO CARTEIRA", true, 15.10);
insert into tipo_paes (descricao, disponivel, valor) values ("PÃO INTEGRAL", true , 10.80);
insert into tipo_paes (descricao, disponivel, valor) values ("PÃO MIL GRÃOS", false , 20.00);
insert into tipo_paes (descricao, disponivel, valor) values ("PÃO DE BRIOCHE", true , 10.80);
insert into tipo_paes (descricao, disponivel, valor) values ("PÃO DE CIBATA", false, 7.80);
insert into tipo_paes (descricao, disponivel, valor) values ("PÃO FOCACCIA", true , 25.00);
insert into tipo_paes (descricao, disponivel, valor) values ("PÃO DE CENTEIO",false ,28.90);
insert into tipo_paes (descricao, disponivel, valor) values ("PÃO BAQUETE",true , 6.0);
insert into tipo_paes (descricao, disponivel, valor) values ("PÃO SIRIO",true ,6.50);

select * from tipo_paes
