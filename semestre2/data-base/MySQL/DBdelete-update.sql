update cursos
set carga = 50
where nome = 'HTML5';

select * from cursos;

update cursos
set carga = 60
where nome in('HTML5', 'CSS3', 'JavaScript');

-- alterar duas colunas de um determinado registro

update cursos
set carga = 40, totalaulas = 25
where id = 18;
select * from cursos where id=18;

select * from cursos;

delete from cursos
where id in (8,3,4);

delete from cursos
where ano < '2015';

delete from cursos
where ano < '2016' and descricao is not null;
