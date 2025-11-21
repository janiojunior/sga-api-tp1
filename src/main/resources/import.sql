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


INSERT INTO plano (nome, max_alunos, max_professores, preco_mensal, desconto_anual) VALUES
('Plano Iniciante', 50, 2, 99.90, 5.00),
('Plano Intermediário', 100, 3, 149.90, 7.50),
('Plano Avançado', 200, 5, 199.90, 10.00),
('Plano Premium', 300, 8, 249.90, 12.00),
('Plano Academia Pequena', 80, 4, 129.90, 8.00),
('Plano Academia Média', 150, 6, 179.90, 10.00),
('Plano Academia Grande', 400, 10, 299.90, 15.00),
('Plano Profissional', 500, 12, 349.90, 18.00),
('Plano Elite', 800, 15, 499.90, 20.00),
('Plano Ilimitado', 9999, 50, 999.90, 25.00);


insert into usuario(nome, login, senha, perfil) values ('Jânio', 'janio', '+RMra81+PVL2HQWuh7xAkSohHzzzq62hw4zuaEpFHXbE0+pX+fzwOpTqmmuDA19zusgadv4fnMnHqLd2S32aXQ==', 1);
insert into usuario(nome, login, senha, perfil) values ('Leandra', 'leandra', '+RMra81+PVL2HQWuh7xAkSohHzzzq62hw4zuaEpFHXbE0+pX+fzwOpTqmmuDA19zusgadv4fnMnHqLd2S32aXQ==', 2);