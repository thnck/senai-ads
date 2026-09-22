-- 1. Criação dos 20 Registros
CREATE DATABASE IF NOT EXISTS DBescola 
DEFAULT CHARACTER SET utf8mb4 
DEFAULT COLLATE utf8mb4_general_ci;

USE DBescola;

CREATE TABLE IF NOT EXISTS cursos (
    id int NOT NULL AUTO_INCREMENT,
    nome varchar(30) NOT NULL UNIQUE,
    descricao varchar(100),
    carga int,
    totalaulas int,
    ano year DEFAULT '2024',
    PRIMARY KEY (id)
) DEFAULT CHARSET = utf8mb4;



-- 2. Inserção dos 20 Registros

INSERT INTO cursos (nome, descricao, carga, totalaulas, ano) VALUES
('HTML5', 'Curso completo de HTML5 para iniciantes', 40, 37, '2014'),
('CSS3', 'Estilização avançada com CSS3 e Flexbox', 40, 30, '2015'),
('JavaScript', 'Lógica de programação e manipulação de DOM', 35, 25, '2015'),
('PHP', 'Desenvolvimento web back-end com PHP', 40, 20, '2016'),
('Java', 'Programação Orientada a Objetos com Java', 60, 40, '2016'),
('Python', 'Automação, dados e desenvolvimento com Python', 40, 30, '2018'),
('MySQL', 'Modelagem, criação e consultas em bancos de dados SQL', 30, 15, '2016'),
('Algoritmos', 'Lógica de programação fundamental', 20, 10, '2014'),
('Photoshop', 'Edição profissional de imagens e fotos', 15, 8, '2014'),
('Word', 'Processamento de textos do básico ao avançado', 10, 5, '2016'),
('Excel', 'Planilhas, fórmulas avançadas e dashboards', 40, 25, '2017'),
('PowerPoint', 'Criação de apresentações impactantes', 20, 12, '2017'),
('Hardware', 'Montagem e manutenção de computadores', 30, 12, '2018'),
('Redes', 'Infraestrutura, protocolos e roteamento de redes', 40, 22, '2018'),
('C++', 'Programação de alto desempenho em C++', 50, 35, '2019'),
('Node.js', 'Construção de APIs RESTful com JavaScript', 45, 28, '2020'),
('Git e GitHub', 'Controle de versão e trabalho em equipe', 15, 10, '2021'),
('Segurança Digital', 'Conceitos fundamentais de biossegurança e hacking ético', NULL, NULL, '2022'),
('Inteligência Artificial', 'Introdução ao Machine Learning e Prompt Engineering', NULL, 15, '2024'),
('DevOps', 'CI/CD, Docker e automação de deploys', 50, NULL, '2024');


-- selecao simples ============================

select * from cursos;

-- ============================================

-- selecao de colunas especificas =============

select nome, descricao, ano from cursos;

-- ============================================

-- selecao de ordenadas =============

select nome, descricao, ano 
from cursos
order by ano
asc;

-- ============================================


-- filtro like
select *
from cursos
where ano like '201%'
order by ano desc;

select *
from cursos
where nome like '201%'
order by ano asc;

select *
from cursos
where  carga>30 and totalaulas<=20;

select *
from cursos
where ano != '2016';


-- contagem total
select count(*) as total_cursos
from cursos;

select count(*) as tem_carga
from cursos
where carga is not null;

-- curso com maior carga

select max(carga) as maior_carga
from cursos;

select min(carga) as menor_carga
from cursos;

-- somar total de aulas

select sum(totalaulas) as soma_aulas
from cursos;

-- media de carga do curso
select avg(carga) as media_aulas
from cursos;

-- 

select ano, count(carga)
from cursos
group by ano
order by count(carga) asc;