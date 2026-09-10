create database if not exists db_loja_online;

use db_loja_online;

create table cliente(
id int primary key auto_increment,
nome varchar(100) not null,
email varchar(100) unique,
telefone varchar(20)
);

create table produto(
id int primary key auto_increment,
nome varchar(100) not null,
preco decimal(10,2) unique,
estoque int default 0
);

create table compra(
id int primary key auto_increment,
id_cliente int not null,
data_compra date not null,
foreign key (id_cliente) references cliente (id)
);

create table carrinho(
id int primary key auto_increment,
id_compra int not null,
id_produto int not null,
valor_unitario decimal(10,2) not null,
foreign key (id_compra) references compra(id),
foreign key (id_produto) references produto(id)
);

insert into cliente(nome,email,telefone)values
('Maria', 'maria@exemplo.com', '(99)99999-9999'),
('Joao', 'joao@exemplo.com', '(11)99999-9999'),
('Ana', 'ana@exemplo.com', '(22)99999-9999');

insert into produto(nome,preco,estoque)values
('Mouse',120,50),
('Teclado',100,70),
('Fone',20,500),
('Monitor',500,10);

insert into compra(id_cliente,data_compra)values
(1,'2026-01-01'),
(2,'2026-01-02'),
(3,'2026-01-03');

alter table carrinho add column quantidade int not null; 

insert into carrinho(id_compra, id_produto,quantidade,valor_unitario)values
(1,1,2,120),
(1,2,10,100),
(2,3,100,20),
(3,4,9,500);
