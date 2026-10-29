create database egames2026;
use egames2026;

create table times(
	id_time int auto_increment primary key,
    nome_time varchar(50) not null,
    jogo varchar(50) not null
);

create table jogadores(
	id_jogador int auto_increment primary key,
    nickname varchar(50),
    id_time int not null,
    foreign key (id_time) references times(id_time)
);

create table partidas(
	id_partida int auto_increment primary key,
    id_time int not null,
    mapa varchar(50) not null,
    pontos int default 0,
    foreign key (id_time) references times(id_time)
);

insert into times(nome_time, jogo) values
('Loud', 'Valorant'),
('Furia','CS:GO'),
('Pain Gaming','LoL'),
('Red Canids','Valorant');

insert into jogadores(nickname, id_time) values
('Aspas',1),
('Less',1),
('Fallen',2),
('tinowns',3),
('Aegis', 4);

insert into partidas(id_time,mapa,pontos) values
(1,'Ascent',13),
(1,'Blind',11),
(2,'Mirage',16),
(3,'Summoner Rift',1);

select
jogadores.nickname,
times.nome_time,
partidas.mapa,
partidas.pontos	
from jogadores
inner join times on jogadores.id_time = times.id_time
inner join partidas on 	partidas.id_time = times.id_time;