/*create database padoca;
use padoca;


create table tb_comanda(
	codigoComanda bigint auto_increment not null,
    descricao varchar(255),
    codigoPao bigint not null, 
    codigoBolo bigint not null,
    codigoPagamento bigint not null,
    codigoBebida bigint not null,
    codigoCliente bigint not null,
    primary key (codigoComanda),
    foreign key (codigoPao) references tipo_paes (codigo),
    foreign key (codigoBolo) references tipo_bolo (codigo),
    foreign key (codigoPagamento) references tb_formas_pag (codigo),
    foreign key (codigoBebida) references tipo_bebida (codigo),
    foreign key (codigoCliente) references tb_cliente (codigo)
);

CREATE TABLE tipo_bolo (
	codigo bigint auto_increment,
	descricao varchar(50),
	disponivel boolean,
	amanhecido boolean,
	valor double(10,2),
	PRIMARY KEY (codigo)
);

INSERT INTO tipo_bolo (descricao,disponivel,amanhecido,valor) VALUES ("Chocolate",true,false,18.97);
INSERT INTO tipo_bolo (descricao,disponivel,amanhecido,valor) VALUES ("Cenoura",false,false,16.63);
INSERT INTO tipo_bolo (descricao,disponivel,amanhecido,valor) VALUES ("Aipim",false,true,14.46);
INSERT INTO tipo_bolo (descricao,disponivel,amanhecido,valor) VALUES ("Formigueiro",false,true,18.67);
INSERT INTO tipo_bolo (descricao,disponivel,amanhecido,valor) VALUES ("Limão",false,true,15.16);
INSERT INTO tipo_bolo (descricao,disponivel,amanhecido,valor) VALUES ("Laranja",false,false,17.68);
INSERT INTO tipo_bolo (descricao,disponivel,amanhecido,valor) VALUES ("Fuba",true,false,16.14);
INSERT INTO tipo_bolo (descricao,disponivel,amanhecido,valor) VALUES ("Brigadeiro",false,false,14.62);
INSERT INTO tipo_bolo (descricao,disponivel,amanhecido,valor) VALUES ("Morango",false,true,12.64);
INSERT INTO tipo_bolo (descricao,disponivel,amanhecido,valor) VALUES ("Fubá cremoso",true,false,16.71);
INSERT INTO tipo_bolo (descricao,disponivel,amanhecido,valor) VALUES ("Chesecake",true,true,19.40);
INSERT INTO tipo_bolo (descricao,disponivel,amanhecido,valor) VALUES ("Cupcake",false,false,13.11);
INSERT INTO tipo_bolo (descricao,disponivel,amanhecido,valor) VALUES ("Bolo de rolo",true,false,12.82);
INSERT INTO tipo_bolo (descricao,disponivel,amanhecido,valor) VALUES ("Bolo sol",true,true,19.19);
INSERT INTO tipo_bolo (descricao,disponivel,amanhecido,valor) VALUES ("Bolo red velvet",false,true,19.43);
INSERT INTO tipo_bolo (descricao,disponivel,amanhecido,valor) VALUES ("Bolo pulmam",true,true,13.82);
INSERT INTO tipo_bolo (descricao,disponivel,amanhecido,valor) VALUES ("bolo de milho cremoso",true,true,19.13);
INSERT INTO tipo_bolo (descricao,disponivel,amanhecido,valor) VALUES ("Bolo de arroz",false,false,14.54);
INSERT INTO tipo_bolo (descricao,disponivel,amanhecido,valor) VALUES ("Bolo de tapioca",true,true,19.17);
INSERT INTO tipo_bolo (descricao,disponivel,amanhecido,valor) VALUES ("Bolo vegano",false,true,14.48);
INSERT INTO tipo_bolo (descricao,disponivel,amanhecido,valor) VALUES ("Bolo de banana",true,false,18.76);




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


create table tb_formas_pag(
	codigo bigint (5) auto_increment,
    descricao varchar (50) not null,
    
    primary key (codigo)
);


insert into tb_formas_pag (descricao) values ("Dinheiro");
insert into tb_formas_pag (descricao) values ("Cartão");
insert into tb_formas_pag (descricao) values ("Cheques");
insert into tb_formas_pag (descricao) values ("PIX");
insert into tb_formas_pag (descricao) values ("Pic-pay");
insert into tb_formas_pag (descricao) values ("Ame Digital");
insert into tb_formas_pag (descricao) values ("MP - Mercado Pago");
insert into tb_formas_pag (descricao) values ("Transferência bancária");
insert into tb_formas_pag (descricao) values ("Square");
insert into tb_formas_pag (descricao) values ("Paypal");
insert into tb_formas_pag (descricao) values ("TokPag ");
insert into tb_formas_pag (descricao) values ("NFC");



create table tipo_bebida(
	codigo bigint (5) auto_increment,
    descricao varchar (50),
    disponivel boolean,
    valor decimal (10,2),
    
    primary key (codigo)
);

insert into tipo_bebida (descricao, disponivel, valor)
values ("Coca-cola", true, 8.99);
insert into tipo_bebida (descricao, disponivel, valor)
values ("Pepsi", true, 9.99);
insert into tipo_bebida (descricao, disponivel, valor)
values ("Suco DelVale", true, 10.99);
insert into tipo_bebida (descricao, disponivel, valor)
values ("Suco de laranja natural", true, 5.99);
insert into tipo_bebida (descricao, disponivel, valor)
values ("Guarana Antartica", true, 9.99);
insert into tipo_bebida (descricao, disponivel, valor)
values ("Absinto", true, 90.99);
insert into tipo_bebida (descricao, disponivel, valor)
values ("Whisky", true, 180.99);
insert into tipo_bebida (descricao, disponivel, valor)
values ("Brahma - 200ml", true, 16.99);
insert into tipo_bebida (descricao, disponivel, valor)
values ("Skol - 200ml", true, 16.99);
insert into tipo_bebida (descricao, disponivel, valor)
values ("Atartica - 200ml", true, 16.99);
insert into tipo_bebida (descricao, disponivel, valor)
values ("Vinho", true, 490.99);
insert into tipo_bebida (descricao, disponivel, valor)
values ("Tequila", true, 90.99);
insert into tipo_bebida (descricao, disponivel, valor)
values ("Licor", true, 90.99);
insert into tipo_bebida (descricao, disponivel, valor)
values ("Champanhe", true, 10999.99);
insert into tipo_bebida (descricao, disponivel, valor)
values ("Saquê", false, 50.99);
insert into tipo_bebida (descricao, disponivel, valor)
values ("Conhaquê", true, 89.99);
insert into tipo_bebida (descricao, disponivel, valor)
values ("Rum", true, 34.99);
insert into tipo_bebida (descricao, disponivel, valor)
values ("Gim", true, 50.99);
insert into tipo_bebida (descricao, disponivel, valor)
values ("Tequila", true, 40.99);
insert into tipo_bebida (descricao, disponivel, valor)
values ("Toddynho", false, 8.99);

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

use padoca;
select*from tb_comanda   
select*from tipo_bolo 
select*from tipo_paes 
select*from tb_formas_pag
select*from tb_cliente

insert into tb_comanda(descricao, codigoPao, codigoBolo, codigoPagamento, codigoBebida, codigoCliente) values ("Cliente", 1, 1, 1, 1, 1);

select tipo_bolo.descricao, tb_comanda.codigoBolo, tipo_bolo.valor from tb_comanda inner join tipo_bolo on tipo_bolo.codigo = tb_comanda.codigoBolo

insert into tb_comanda(descricao, codigoPao, codigoBolo, codigoPagamento, codigoBebida, codigoCliente) values ("Entrega", 2, 2, 2, 2, 2);

insert into tb_comanda(descricao, codigoPao, codigoBolo, codigoPagamento, codigoBebida, codigoCliente) values ("Retirada", 3, 3, 3, 3, 3);

insert into tb_comanda(descricao, codigoPao, codigoBolo, codigoPagamento, codigoBebida, codigoCliente) values ("Entrega", 4, 4, 4, 4, 4);

insert into tb_comanda(descricao, codigoPao, codigoBolo, codigoPagamento, codigoBebida, codigoCliente) values ("Retirada", 5, 5, 5, 5, 2);

*/






