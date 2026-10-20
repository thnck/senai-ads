CREATE DATABASE IF NOT EXISTS aula_joins;
USE aula_joins;

DROP TABLE IF EXISTS Departamentos;
DROP TABLE IF EXISTS Funcionarios;

CREATE TABLE Funcionarios (
    COD           CHAR(3) PRIMARY KEY,
    NOME          VARCHAR(60) NOT NULL,
    ESPECIALIDADE VARCHAR(80) NOT NULL
);

CREATE TABLE Departamentos (
    COD      CHAR(3) PRIMARY KEY,
    NOME     VARCHAR(80) NOT NULL,
    COD_FUNC CHAR(3) NULL
);

INSERT INTO Funcionarios (COD, NOME, ESPECIALIDADE) VALUES
('001', 'JOSÉ',   'ENGENHEIRO'),
('002', 'JOÃO',   'MESTRE DE OBRAS'),
('003', 'MARIA',  'CONTABILISTA'),
('004', 'ANA',    'ANALISTA DE SISTEMAS'),
('005', 'PEDRO',  'TÉCNICO EM REDES'),
('006', 'LUCAS',  'DESIGNER'),
('007', 'BEATRIZ','ADMINISTRADORA');


INSERT INTO Departamentos (COD, NOME, COD_FUNC) VALUES
('001', 'RH',            '001'),
('002', 'ADMINISTRAÇÃO', '001'),
('003', 'COMPRAS',       '003'),
('004', 'TECNOLOGIA',    '005'),
('005', 'MARKETING',     NULL),
('006', 'PESQUISA',      '999'),
('007', 'FINANCEIRO',    '007');

select * from Funcionarios;

select 
	Func.cod as cod_func,
	Func.nome as nome_func,
	Dep.cod as cod_dep,
	Dep.nome as nome_dep
from Funcionarios as func
left join Departamentos Dep
on Func.cod = Dep.Cod_func
where Dep.cod is null
order by Func.cod, Dep.cod;