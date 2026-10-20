CREATE DATABASE DB_ESCOLA_JOIN;
drop database DB_ESCOLA_JOIN;
USE DB_ESCOLA_JOIN;

CREATE TABLE Alunos (
    cod INT PRIMARY KEY,
    nome VARCHAR(100),
    cidade VARCHAR(100)
);

-- Inserindo dados na tabela Alunos
INSERT INTO Alunos (cod, nome, cidade) VALUES
(1, 'Carlos', 'Sorocaba'),
(2, 'Beatriz', 'Itu'),
(3, 'Lucas', 'Votorantim');


-- Criando a tabela Matriculas
CREATE TABLE Matriculas (
    cod INT PRIMARY KEY,
    valor DECIMAL(10, 2),
    data DATE,
    cod_aluno INT,
    FOREIGN KEY (cod_aluno) REFERENCES Alunos(cod)
);

-- Inserindo dados na tabela Matriculas
INSERT INTO Matriculas (cod, valor, data, cod_aluno) VALUES
(1, 180.00, '2023-10-10', 1),
(2, 250.00, '2023-10-11', 2),
(3, 400.00, '2023-10-12', 1);

-- exercicios
-- ex 01

-- Inserindo mais dados na tabela Alunos
INSERT INTO Alunos (cod, nome, cidade) VALUES
(4, 'Matheus', 'Alumínio'),
(5, 'Kauan', 'Salto'),
(6, 'Flávio', 'Araçoiaba'),
(7, 'Pablo', 'Tatuí'),
(8, 'Cléber', 'São Paulo'),
(9, 'Manuel', 'Osasco'),
(10, 'Felipe', 'Barueri');

-- Inserindo mais dados na tabela Matriculas
INSERT INTO Matriculas (cod, valor, data, cod_aluno) VALUES
(4, 80.00, '2023-10-13', 4),
(5, 50.00, '2023-10-14', 4),
(6, 40.00, '2023-6-15', 6),
(7, 160.00, '2023-10-16', 7),
(8, 450.00, '2023-8-17', 5),
(9, 600.00, '2023-9-18', 6),
(10, 170.00, '2023-10-19', 10);

-- ex 02
select
alu.nome as nome_alu,
alu.cidade as cidade_aluno,
mat.valor as valor_mat
from Alunos as alu
inner join matriculas as mat
on alu.cod = mat.cod_aluno;

-- ex 03
select
alu.cod as cod_alu,
alu.nome as nome_alu,
alu.cidade as cidade_aluno,
mat.valor as valor_mat
from Alunos as alu
left join matriculas as mat
on alu.cod = mat.cod_aluno;

-- ex 04
select
mat.cod as cod_mat,
alu.nome as nome_alu,
alu.cidade as cidade_aluno,
mat.valor as valor_mat
from Alunos as alu
right join matriculas as mat
on alu.cod = mat.cod_aluno
order by mat.cod;

-- ex 05
select
alu.cod as cod_alu,
alu.nome as nome_alu,
alu.cidade as cidade_aluno,
mat.valor as valor_mat
from Alunos as alu
left join matriculas as mat
on alu.cod = mat.cod_aluno
where mat.cod is null
order by mat.cod;

-- ex 06
select
mat.cod as cod_mat,
alu.nome as nome_alu,
alu.cidade as cidade_aluno,
mat.valor as valor_mat
from Alunos as alu
right join matriculas as mat
on alu.cod = mat.cod_aluno
where mat.valor > 200
order by mat.cod;

-- ex 07

select
mat.cod as cod_mat,
alu.nome as nome_alu,
alu.cidade as cidade_aluno,
mat.valor as valor_mat
from Alunos as alu
right join matriculas as mat
on alu.cod = mat.cod_aluno
where mat.data like '2023-10%'
order by mat.cod;
