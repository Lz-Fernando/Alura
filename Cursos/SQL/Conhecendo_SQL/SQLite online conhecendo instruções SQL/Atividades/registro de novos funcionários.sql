CREATE TABLE tabelafuncionarios (
id int PRIMARY KEY,
  nome text,
  cargo text,
  departamento text,
  data_contratacao date,
  salario decimal (10, 2)
);

INSERT INTO tabelafuncionarios
(id,
 nome,
 cargo,
 departamento,
 data_contratacao,
 salario)
 VALUES
 (32, 'João Silva', 'Desenvolvedor de software', 'TI', '2023-10-24', 6000.00);
 
 SELECT * FROM tabelafuncionarios;