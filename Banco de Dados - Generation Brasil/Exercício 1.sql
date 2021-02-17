create database db_RH2;
use db_RH2;

create table tb_cargo( codigoCargo int auto_increment,
     nomeCargo varchar(30) not null,
	 qualificacao varchar(40),
     primary key (codigoCargo)
);

create table tb_funcionario( 
	codigoFuncionario int auto_increment,
	nomeFuncionario varchar(30) not null,
	idade int not null,
	telefone varchar(12),
	salario decimal (7,2) not null,
	codigoCargo int not null, primary key (codigoFuncionario),
	foreign key (codigoCargo) references tb_cargo (codigoCargo)
);

insert into tb_cargo (nomeCargo, qualificacao) values ("Supervisor", "Superior");
insert into tb_cargo (nomeCargo, qualificacao) values ("Gerente", "Superior");
select*from tb_cargo;
SELECT * FROM db_rh2.tb_cargo;
SELECT * FROM db_rh2.tb_funcionario;
insert into tb_funcionario (nomeFuncionario, idade, telefone, salario, codigoCargo) values ("Douglas Canha", 23, "01990076898", 4500, 4);
insert into tb_funcionario (nomeFuncionario, idade, telefone, salario, codigoCargo) values ("Roseane Clara", 48, "01923546781", 6500, 2);
insert into tb_funcionario (nomeFuncionario, idade, telefone, salario, codigoCargo) values ("Cleide", 45, "01998345620", 6500, 2);
insert into tb_funcionario (nomeFuncionario, idade, telefone, salario, codigoCargo) values ("Carlos Roberto", 33, "01901923874", 3500, 4);
insert into tb_funcionario (nomeFuncionario, idade, telefone, salario, codigoCargo) values ("Roberto Carlos", 25, "01901923874", 3500, 3);
insert into tb_funcionario (nomeFuncionario, idade, telefone, salario, codigoCargo) values ("Joyce Karine", 23, "01901923874", 7500,  1);
insert into tb_funcionario (nomeFuncionario, idade, telefone, salario, codigoCargo) values ("Ana Carolina", 30, "01909890789", 7500, 1);
insert into tb_funcionario (nomeFuncionario, idade, telefone, salario, codigoCargo) values ("Camila Cleane", 27, "01901923874", 3500, 3);
insert into tb_funcionario (nomeFuncionario, idade, telefone, salario, codigoCargo) values ("Lucas Gato", 19, "01919203452", 6500,  2);
insert into tb_funcionario (nomeFuncionario, idade, telefone, salario, codigoCargo) values ("Mateus", 29, "01976859430", 7500,  1);
select * from tb_funcionario inner join tb_cargo on tb_cargo.salario > 2000;
select * from tb_funcionario where salario > 2000;
select * from tb_funcionario where salario < 2000;
select*from tb_funcionario where nomeFuncionario like 'c%';
select * from tb_funcionario inner join tb_cargo on tb_cargo.nomeCargo = 'Gerente';
select * from tb_funcionario inner join tb_cargo on tb_cargo.codigoCargo = tb_funcionario.codigoCargo where nomeCargo = 'Gerente';
select * from tb_funcionario inner join tb_cargo on tb_cargo.codigoCargo = tb_funcionario.codigoCargo;
select * from tb_funcionario where salario >= 4000 and salario <= 7500;
select * from tb_funcionario where salario >= 6500 and salario <= 7500;
