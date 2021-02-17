-- criando Database
create database padoca;
-- usando DataBase
use padoca;
-- criando tabela
CREATE TABLE tipo_bolo (
  codigo mediumint(8) auto_increment,
  descricao varchar(50),
  disponivel boolean,
  amanhecido boolean,
  valor double(10,2),
  PRIMARY KEY (codigo)
);

-- populando table

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
