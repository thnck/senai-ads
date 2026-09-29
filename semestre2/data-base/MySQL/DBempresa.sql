-- ============================================================================
-- CREAÇÃO DO BANCO DE DADOS E TABELA
-- ============================================================================

CREATE DATABASE IF NOT EXISTS DBempresa;
USE DBempresa;

DROP TABLE IF EXISTS funcionarios;

CREATE TABLE funcionarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cargo VARCHAR(50),
    departamento VARCHAR(50),
    salario DECIMAL(10,2),
    data_admissao DATE,
    status VARCHAR(20) DEFAULT 'Ativo'
);

-- ============================================================================
-- INSERÇÃO DE 20 REGISTROS
-- ============================================================================

INSERT INTO funcionarios (nome, cargo, departamento, salario, data_admissao, status) VALUES
('Ana Silva', 'Desenvolvedor Frontend', 'TI', 4500.00, '2021-03-15', 'Ativo'),
('Carlos Eduardo', 'Desenvolvedor Backend', 'TI', 5500.00, '2019-06-10', 'Ativo'),
('Mariana Lima', 'Analista de RH', 'RH', 3800.00, '2020-01-20', 'Ativo'),
('Roberto Alves', 'Gerente de Projetos', 'TI', 8500.00, '2018-11-05', 'Ativo'),
('Fernanda Costa', 'Designer UX/UI', 'Marketing', NULL, '2022-04-01', 'Ativo'),
('Lucas Mendes', 'Analista Financeiro', 'Financeiro', 4200.00, '2021-08-12', 'Inativo'),
('Beatriz Rocha', 'Assistente Administrativo', 'RH', 2500.00, '2023-02-10', 'Ativo'),
('Gabriel Souza', 'Desenvolvedor Backend', 'TI', 5200.00, '2022-09-18', 'Ativo'),
('Patricia Gomes', 'Especialista em Marketing', 'Marketing', 4800.00, '2020-05-30', 'Ativo'),
('Diego Martins', 'Suporte Técnico', 'TI', 2800.00, '2023-01-15', NULL),
('Juliana Paes', 'Coordenadora de RH', 'RH', 6200.00, '2017-04-22', 'Ativo'),
('Marcelo Ribeiro', 'Analista Financeiro', 'Financeiro', NULL, '2022-11-01', 'Ativo'),
('Camila Rodrigues', 'Desenvolvedor Frontend', 'TI', 4600.00, '2021-10-05', 'Ativo'),
('Rafael Barbosa', 'Estagiário', 'TI', 1500.00, '2023-06-01', 'Ativo'),
('Larissa Dias', 'Estagiário', 'Marketing', 1500.00, '2023-07-15', 'Ativo'),
('Thiago Melo', 'Gerente Financeiro', 'Financeiro', 9000.00, '2016-02-18', 'Ativo'),
('Vanessa Nunes', 'Analista de Suporte', 'TI', 3100.00, '2019-12-01', 'Inativo'),
('Bruno Castro', 'Desenvolvedor Fullstack', 'TI', 6800.00, '2020-08-20', 'Ativo'),
('Amanda Faria', 'Assistente Financeiro', 'Financeiro', 2700.00, '2023-03-01', 'Ativo'),
('Rodrigo Teixeira', 'Diretor de Operações', 'Diretoria', 1500.00, '2015-01-10', 'Ativo');

-- 1. Alterar o salário do funcionário 'Carlos Eduardo' usando o NOME para 6000.00.

update funcionarios
set salario = 6000.00
where nome like 'Carlos Eduardo';

-- 2. Corrigir o salário do funcionário de ID 5 ('Fernanda Costa') que está NULO para 4000.00.

update funcionarios
set salario = 4000.00
where id like 5;

-- 3. Mudar o cargo e o departamento da 'Patricia Gomes' para 'Gerente de Marketing' no departamento 'Marketing'.

update funcionarios
set cargo = 'Gerente de Marketing', departamento = 'Marketing'
where nome like 'Patricia Gomes';

-- 4. Promover todos os 'Estagiário' para 'Assistente', alterando o cargo deles.

update funcionarios
set cargo = 'Assistente'
where cargo like 'Estágiario';

-- 5. UPDATE com IN: Atualizar o status para 'Inativo' dos funcionários com IDs 7, 10 e 14.

update funcionarios
set status = 'Inativo'
where id in (7,10,14);

-- 6. UPDATE com OR: Dar um aumento e alterar o salário para 5000.00 para quem é 'Desenvolvedor Frontend' OU 'Desenvolvedor Backend'.

update funcionarios 
set salario = '5000.00'
where cargo like 'Desenvolvedor Frontend' or cargo like 'Desenvolvedor Backend';

-- 7. UPDATE com IS NULL: Definir o salário padrão de 3000.00 para todos os funcionários onde o salário está NULO.

update funcionarios
set salario = '3000.00'
where salario is null;

-- 8. UPDATE com IS NOT NULL: Alterar o status para 'Confirmado' apenas para os funcionários que JÁ POSSUEM salário cadastrado.

update funcionarios
set status = 'Confirmado'
where salario is not null;

select * from funcionarios;

-- 9. Aumentar em 10% o salário de todos os funcionários do departamento de 'TI' (Dica: salario = salario * 1.10).

update funcionarios 
set salario = salario * 1.10
where departamento like 'TI';

-- 10. Atualizar o status para 'Pendente' onde o status atual está NULO (IS NULL).

update funcionarios
set status = 'Pendente'
where status is null;

-- 11. Deletar o registro do funcionário com ID 15.

delete from funcionarios
where id = 15;

-- 12. Deletar o funcionário buscando pelo NOME 'Lucas Mendes'.

delete from funcionarios
where nome = 'Lucas Mendes';

-- 13. Deletar todos os funcionários admitidos antes do ano de '2018' (data_admissao < '2018-01-01').

delete from funcionarios
where data_admissao < '2018-01-01';

-- 14. DELETE com IN: Remover os funcionários cujos cargos sejam 'Estagiário' ou 'Suporte Técnico' usando IN ('Estagiário', 'Suporte Técnico').

delete from funcionarios
where cargo in ('Estagiário', 'Suporte Técnico'); 

-- 15. DELETE com OR: Remove funcionários que pertencem ao departamento 'Marketing' OU que possuem salário menor que 2000.00.

delete from funcionarios
where departamento = 'Marketing' or salario < 2000.00;

-- 16. DELETE com IS NULL: Remove todos os registros onde o status é NULO.

delete from funcionarios
where status is null;

-- 17. DELETE com IS NOT NULL: Remove funcionários do departamento 'Financeiro' que POSSUEM salário cadastrado.

delete from funcionarios
where departamento = 'Financeiro' and salario is not null;

-- 18. Deletar todos os funcionários que possuem o status 'Inativo'.

delete from funcionarios
where status = 'Inativo';

-- 19. Deletar funcionários do departamento 'TI' que recebam salário menor que 3000.00.

delete from funcionarios
where departamento = 'TI' and salario < 3000.00;

-- 20. Deletar o funcionário com ID 20.

delete from funcionarios
where id = 20;