create table tb_formas_pag(
	codigo bigint (5) auto_increment,
    descricao varchar (50) not null,
    
    primary key (codigo)
)


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
)

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