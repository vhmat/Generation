/*create database locadora;
use locadora; 

create table filme(
	codigo int auto_increment,
    nome varchar(50) not null,
    categoria varchar(50) not null,
    classificacaoIndicatica char(7) not null, 
    quantidadeDisponivel int not null,
    primary key (codigo)
);

UTILIZANDO ALTERAÇÃO DE UMA COLUNA alter table filme change classificacaoIndicatica classificacaoIndicativa char(7)

insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("Lawrence da Arábia", "Drama", "18 anos", 2);
insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("Uma Odisseia no Espaço", "Ficção", "16 anos", 3);
insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("Cidadão Kane", "Comédia Romântica", "14 anos", 3);
insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("O Poderoso Chefão", "Natal", "12 anos", 3);
insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("Andrei Rublev", "Terror", "10 anos", 4);

insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("Os Sete Samurais", "Drama", "18 anos", 4);
insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("O Sétimo Selo", "Ficção", "16 anos", 4);
insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("O Anjo Exterminador", "Comédia Romântica", "14 anos", 4);
insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("A Doce Vida", "Natal", "12 anos", 5);
insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("Blade Runner, O Caçador de Androides", "Terror", "10 anos", 5);

insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("Ladrões de Bicicleta", "Drama", "18 anos", 6);
insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("Laranja Mecânica", "Ficção", "16 anos", 6);
insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("Apocalypse Now", "Comédia Romântica", "14 anos", 2);
insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("O Leopardo", "Natal", "12 anos", 2);
insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("Janela Indiscreta", "Terror", "10 anos", 1);

insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("Cantando na Chuva", "Drama", "18 anos", 2);
insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("Metrópolis", "Ficção", "16 anos", 3);
insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("Aurora", "Comédia Romântica", "14 anos", 3);
insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("O Terceiro Homem", "Natal", "12 anos", 6);
insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("A Regra do Jogo", "Terror", "10 anos", 8);

insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("Amadeus", "Drama", "18 anos", 1);
insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("Rastros de Ódio", "Ficção", "16 anos", 1);
insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("Encouraçado Potemkin", "Comédia Romântica", "14 anos", 1);
insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("Era Uma Vez em Tóquio", "Natal", "12 anos", 1);
insert into filme(nome, categoria, classificacaoIndicativa, quantidadeDisponivel) Values ("Olympia", "Terror", "10 anos", 1);

select*from filme

select*from filme where nome like "s%"

select*from filme where categoria = "Terror"

alter table filme add column disponibilidade boolean not null

ALTER TABLE filme DROP COLUMN disponibilidade;
*/

