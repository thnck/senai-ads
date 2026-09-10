create database if not exists biblio;
	
    use biblio;
    
    create table Livro(
    id int primary key auto_increment,
    titulo varchar(100) not null,
    autor varchar(100),
    ano_publicacao int
    );
    
    create table emprestimo(
    id int primary key auto_increment,
    nome_aluno varchar(100) not null,
    id_livro int,
    foreign key (id_livro) references Livro(id)
    );
    
    -- inserindo dados na tabela
    
    insert into Livro(titulo, autor, ano_publicacao)
    values('Dom  Casmurro', 'Machado de Assis', 1899);
    
    insert into Livro(titulo, autor, ano_publicacao)
    values('O Pequeno Principe', 'Antoine de Saint-Exupery', 1943);
    
    insert into Livro(titulo, autor, ano_publicacao)
    values('Harry Potter', 'JK Rowling', 1997);
    
    show tables;
    
    desc livro;
    
    insert into Livro(titulo)
    values('Diario de um Banana');
    
    select * from Livro;
    
    select titulo from Livro;
    
    alter table Livro
    add column data_emprestimo date;
    
    insert into emprestimo(nome_aluno, id_livro, data_emprestimo)
    values('Jose',1,'2025-05-23');
    
     insert into emprestimo(nome_aluno, id_livro, data_emprestimo)
	 values('Maria',2,'2025-07-02');
     
     insert into emprestimo(nome_aluno, id_livro, data_emprestimo)
	 values('Maria',2,'2025-07-02');
     
     insert into Livro(titulo, autor, ano_publicacao)
	 values('A Revolução dos Bichos', 'JK Rowling', 1997);
     
     insert into Livro(titulo, autor, ano_publicacao) values
('A Revolução dos Bichos','George Orwel',1945),
('O Senhor dos Aneis','J. R. R. Tolken',1954),
('Memorias Postumas de Bras Cubas','Machado de Assis',1981),
('Capitães de Areia','Jorge Amado',1937),
('Vidas Secas','Graciliano Ramos',1945);


insert into Livro(titulo, autor, ano_publicacao) values
('O Alquimista','Paulo Coelho',1988),
('A Metamorfose','Franz Kafka',1915),
('O Principe','Nicolau Maquiavel',1532);

insert into emprestimo(nome_aluno, id_livro, data_emprestimo)
    values('Jose',1,'2025-05-23'),
    values('Jose',1,'2025-05-23'),
    values('Jose',1,'2025-05-23'),
    values('Jose',1,'2025-05-23'),
    values('Jose',1,'2025-05-23'),
    values('Jose',1,'2025-05-23'),
    values('Jose',1,'2025-05-23'),
    
