create database db_pleague;
use db_pleague;
drop database db_pleague;

create table Times(
id_time int primary key auto_increment,
nome_time varchar(60),
titulos_pdinglesa int default 0,
titulos_pleague int default 0
);

create table Posicoes(
id_posicao int primary key auto_increment,
sigla_posicao varchar(60),
nome_posicao varchar(60)
);

create table Jogadores(
id_jogador int primary key auto_increment,
nome_jogador varchar(60) not null,
id_posicao int ,
id_time int,
email varchar(60) null, 
foreign key (id_posicao) references Posicoes(id_posicao),
foreign key (id_time) references Times(id_time)
);

insert into Times(nome_time, titulos_pdinglesa, titulos_pleague) values 
('Arsenal',14,4),
('Aston Villa',7, null),
('Chelsea',6,5),
('Everton',9, null),
('Liverpool',20,2),
('Manchester City',10,8),
('Manchester United',20,13),
('Newcastle',4, null),
('Sunderland',6, null),
('Tottenham',2, null);

insert into Posicoes (sigla_posicao, nome_posicao) values
('GOL', 'Goleiro'),
('ZAG','Zagueiro'),
('LE', 'Lateral Esquerdo'),
('LD', 'Lateral Direito'),
('VOL','Volante'),
('MC', 'Meio-Campista Central'),
('MEI', 'Meia-Armador'),
('ME', 'Meia Esquerdo'),
('MD', 'Meia Direito'),
('PE', 'Ponta Esquerdo'),
('PD', 'Ponta Direito'),
('CA', 'Centroavante');

insert into Jogadores (nome_jogador, id_posicao, id_time, email) values
('Gabriel Magalhães', 2, 1, 'gabriel@mail.com'),
('Oleksandr Zinchenko',3, null, null),
('Zion Suzuki', 1, 2, 'suzuukii@mail.com'),
('Estêvão William', 11, 3 , null),
('Cole Palmer',7,3, 'coldpalmer@mail.com'),
('Jordan Pickford',1,4, 'pickford1@mail.com'),
('Bradley Barcola',10,5, null),
('Jadon Sancho',11, null, null),
('Erling Haaland',12,6, 'haaland@mail.com'),
('Joško Gvardiol',3,6, null),
('Bruno Fernandes',6,7, 'fernandesbruno@mail.com'),
('Nico González',5,8, null),
('Granit Xhaka', 9, 9, 'gxhaka@mail.com'),
('Richarlison' ,12, 10, 'richarlison@mail.com'),
('Pedro Porro', 4,10, 'porropedro0@mail.com');	

-- 1
select 
	j.nome_jogador,
    t.nome_time
from Times t
inner join Jogadores j
on t.id_time = j.id_time;

-- 2
select 
	j.nome_jogador,
    t.nome_time,
    t.titulos_pdinglesa,
    t.titulos_pleague,
    p.sigla_posicao
from Jogadores j
inner join Times t
on t.id_time = j.id_time
inner join Posicoes p
on p.id_posicao = j.id_posicao;

-- 3
select 
	j.nome_jogador,
    t.nome_time,
    p.sigla_posicao
from Jogadores j
inner join Times t
on t.id_time = j.id_time
inner join Posicoes p
on p.id_posicao = j.id_posicao;

-- 4
select 
	j.nome_jogador,
    j.email,
    t.nome_time
from Jogadores j
inner join Times t
on t.id_time = j.id_time;

-- 5
select 
	j.nome_jogador,
    t.nome_time,
    p.nome_posicao
from Jogadores j
inner join Times t
on t.id_time = j.id_time
inner join Posicoes p
on p.id_posicao = j.id_posicao;

-- 6
select 
	j.nome_jogador,
    t.nome_time
from Times t
inner join Jogadores j
on t.id_time = j.id_time
inner join Posicoes p
on p.id_posicao = j.id_posicao
where sigla_posicao = 'GOL';

-- 7
select 
	j.nome_jogador,
    t.nome_time
from Times t
right join Jogadores j
on t.id_time = j.id_time;

-- 8
select 
	j.nome_jogador,
    j.email,
    t.nome_time
from Times t
right join Jogadores j
on t.id_time = j.id_time;

-- 9
select 
    t.nome_time,
	j.nome_jogador
from Times t
inner join Jogadores j
on t.id_time = j.id_time;

-- 10
select 
	j.nome_jogador,
    t.nome_time,
    p.sigla_posicao
from Times t
right join Jogadores j
on t.id_time = j.id_time
left join Posicoes p
on p.id_posicao = j.id_posicao;

-- 11
select 
	j.nome_jogador,
    p.sigla_posicao
from Posicoes p
left join Jogadores j
on p.id_posicao = j.id_posicao;

-- 12
select 
nome_time,
titulos_pdinglesa,
titulos_pleague
from Times;

-- 13
select 
nome_time,
nome_jogador
from Times t
right join Jogadores j
on t.id_time = j.id_time;

-- 14
select 
nome_time,
nome_jogador,
titulos_pdinglesa,
titulos_pleague
from Times t
right join Jogadores j
on t.id_time = j.id_time
right join Posicoes p
on p.id_posicao = j.id_posicao;

-- 15

-- 16

-- 17

-- 18

-- 19

-- 20

