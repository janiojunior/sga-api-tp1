-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

 insert into estado (nome, sigla, regiao) values('Tocantins', 'TO', 3);
 insert into estado (nome, sigla, regiao) values('Goiás', 'GO', 1);
 insert into estado (nome, sigla, regiao) values('São Paulo', 'SP', 4);

insert into municipio (nome, id_estado) values('Palmas', 1);
insert into municipio (nome, id_estado) values('Araguaína', 1);
insert into municipio (nome, id_estado) values('Guripi', 1);

insert into aluno (nome, id_municipio) values('Joao', 1);
insert into aluno (nome, id_municipio) values('Maria', 2);
insert into aluno (nome, id_municipio) values('Pedro', 3);



