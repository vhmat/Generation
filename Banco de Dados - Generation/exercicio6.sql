/* create database petshop;
use petshop;

create table animal(
	codigo int auto_increment,
    nome varchar(30),
    peso int not null,
    raca varchar(25) not null,
    porte varchar(10) not null,
    primary key (codigo)
);

select * from animal

insert into animal (nome, peso, raca, porte) Values ("Yoshi", 10, "Lhasa Apso", "Pequeno");
insert into animal (nome, peso, raca, porte) Values ("Laila", 10, "Lhasa Apso", "Pequeno");
insert into animal (nome, peso, raca, porte) Values ("Julie", 15, "Vira Lata", "Médio");
insert into animal (nome, peso, raca, porte) Values ("Joaquim", 4, "Pastor Alemão", "Grande");
insert into animal (nome, peso, raca, porte) Values ("Nino", 8, "Yorkshire", "Pequeno");
insert into animal (nome, peso, raca, porte) Values ("Duque", 20, "Aquita", "Grande");
insert into animal (nome, peso, raca, porte) Values ("Bethoven", 25, "Poodle", "Pequeno");
insert into animal (nome, peso, raca, porte) Values ("Bob", 28, "Lhasa Apso", "Pequeno");
insert into animal (nome, peso, raca, porte) Values ("Latonha", 6, "PUG", "Pequeno");
insert into animal (nome, peso, raca, porte) Values ("Thor", 5, "Vira Lata", "Médio");
insert into animal (nome, peso, raca, porte) Values ("Meggie", 7, "Poodle", "Pequeno");
insert into animal (nome, peso, raca, porte) Values ("Kali", 27, "Vira Lata", "Médio");
insert into animal (nome, peso, raca, porte) Values ("Arwen", 30, "Poodle", "Pequeno");
insert into animal (nome, peso, raca, porte) Values ("Dallas", 3, "PUG", "Pequeno");
insert into animal (nome, peso, raca, porte) Values ("Snoopy", 9, "Golden Retrievier", "Grande");
insert into animal (nome, peso, raca, porte) Values ("Scooby Doo", 3, "Yorkshire", "Pequeno");
insert into animal (nome, peso, raca, porte) Values ("Bidu", 9, "Golden Retrievier", "Grande");
insert into animal (nome, peso, raca, porte) Values ("Pitoco", 12, "Yorkshire", "Pequeno");

select * from animal where nome like "b%"

select * from animal where peso > 20

delete from animal where codigo = 3

*/





