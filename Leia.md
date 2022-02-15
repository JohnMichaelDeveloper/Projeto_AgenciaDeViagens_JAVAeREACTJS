# Projeto_AgenciaDeViagens_JAVAeREACTJS

<h3>Projeto React_Agencia JLK - John Michael</H3>
https://github.com/JohnMichaelDeveloper/ProjetoReactJLK.git

Para o banco de dados

/*crie o banco de dados db_agenciajlk*/
CREATE SCHEMA db_agenciajlk;

/*crie as tabelas*/
Use db_agenciajlk;

CREATE TABLE cadastros (
	id int not null primary key auto_increment,
    nome varchar(40),
    cpf char(11),
    nascimento date,
    login varchar(20),
    senha varchar(12),
    tipoDeConta varchar(13)

);



CREATE TABLE pacotes (
	idPacotes int not null primary key auto_increment,
    nome varchar(200),
    origem varchar(200),
    destino varchar(200),
    saida date,
    retorno date,
    preco_Unt decimal(10,2),
    inform_add varchar(500)

);

CREATE TABLE compras (
	idCompras int not null primary key auto_increment,
    qtd_pessoas int not null,
    diarias varchar(20),
    data_da_compra date,
    valor_da_compra decimal(10,2),    
    forma_de_pagamento varchar(100),
    idPacotes int not null,
    id int not null,
    constraint fk_cadastros foreign key(id) references cadastros(id),
    constraint fj_pacotes foreign key(idPacotes) references pacotes(idPacotes)
    );

CREATE TABLE atendimento (
	idAtend int not null primary key auto_increment,
    nome varchar(100),
    email varchar(200),
    data_do_atend date,
    duvida varchar(200),    
    satisfacao int
);

/*Verifique se foi realmente criado o banco de dados e suas tabelas*/

/*inserir informações*/
SELECT * FROM cadastros;
 INSERT INTO cadastros(nome, cpf, nascimento, login, senha, tipoDeConta) values('Michael','10944335782','2022-06-21','chapeu','123','administrador');
