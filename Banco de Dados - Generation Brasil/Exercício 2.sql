create database db_ecommerce2;
use db_ecommerce2;

create table tb_categoria(
	 codigo int auto_increment,
     categoria varchar(30) not null,
     marca varchar(30),
     tipo varchar(30),
     primary key (codigo)
 );
 
 select*from tb_categoria;
 
 create table tb_produto(
  codigoProduto int auto_increment,
     nomeModelo varchar(30) not null,
     quantidade int not null, 
     cor varchar(15),
     preco decimal (7,2) not null,
     codigo int not null,
     primary key (codigoProduto),
     foreign key (codigo) references tb_categoria (codigo)
 );
 
insert into tb_produto(nomeModelo, quantidade, cor, preco, codigo) values("Galaxy J5", 8 , "Preto - Branco", 1700 ,1);
insert into tb_produto(nomeModelo, quantidade, cor, preco, codigo) values("Galaxy A21S", 12, "Preto - Branco", 2000 ,1);
insert into tb_produto(nomeModelo, quantidade, cor, preco, codigo) values("Galaxy J5 PRO", 7 , "Preto - Branco", 1900 ,1);

insert into tb_produto(nomeModelo, quantidade, cor, preco, codigo) values("iPod Touch Plus!", 4, "Preto - Branco", 3100 ,2);
insert into tb_produto(nomeModelo, quantidade, cor, preco, codigo) values("iPod Touch PRO", 1, "Preto - Branco", 2800 ,2);
insert into tb_produto(nomeModelo, quantidade, cor, preco, codigo) values("iPod Touch", 2, "Preto - Branco", 2300 ,2);

insert into tb_produto(nomeModelo, quantidade, cor, preco, codigo) values("Headset Warrior PRO", 9 , "Preto - Branco", 90 ,3);
insert into tb_produto(nomeModelo, quantidade, cor, preco, codigo) values("Headset Warrior Plus!", 11, "Preto - Branco", 135 ,3);
insert into tb_produto(nomeModelo, quantidade, cor, preco, codigo) values("Headset Warrior", 13 , "Preto - Branco", 190 ,3);

 insert into tb_produto(nomeModelo, quantidade, cor, preco, codigo) values("Mouse s/ fio", 3 , "Preto - Branco", 100 ,4);
insert into tb_produto(nomeModelo, quantidade, cor, preco, codigo) values("Mouse Gamer", 4 , "Preto - Branco", 659 ,4);
insert into tb_produto(nomeModelo, quantidade, cor, preco, codigo) values("Mouse Básico", 1 , "Preto - Branco", 35 ,4);


insert into tb_produto(nomeModelo, quantidade, cor, preco, codigo) values("Teclado Kraken", 11 , "Preto - Branco", 1000 ,5);
insert into tb_produto(nomeModelo, quantidade, cor, preco, codigo) values("Teclado Chroma Gunmetal", 14 , "Preto - Branco", 899 ,5);
insert into tb_produto(nomeModelo, quantidade, cor, preco, codigo) values("Teclado Blackwidow", 9 , "Preto - Branco", 799 ,5);

select*from tb_produto;

select*from tb_produto where preco > 2000;
select*from tb_produto where preco > 1000 and preco < 2000;
select*from tb_produto where nomeModelo like 'c%';

select tb_produto.nomeModelo, tb_produto.preco, tb_categoria.marca from tb_produto inner join tb_categoria on tb_categoria.codigo = tb_produto.codigo where tb_categoria.codigo = 3;
