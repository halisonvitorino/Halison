CREATE TABLE `db_usuario`.`contato` (
  `idcontato` INT NOT NULL AUTO_INCREMENT,
  `tel_fixo` VARCHAR(45) NULL,
  `tel_celular` VARCHAR(45) NULL,
  `tel_contato` VARCHAR(45) NULL,
  `id_usuario` VARCHAR(45) NULL,
  PRIMARY KEY (`idcontato`));
  
  use db_usuario;
  
ALTER TABLE `db_usuario`.`usuario` 
CHANGE COLUMN `idusuario` `idusuario` INT(11) NOT NULL AUTO_INCREMENT;
  
  insert into db_usuario.usuario (nome, sobrenome, email, cpf, genero) values
  ('halison', 'vitorino', 'halison@gmail', '79114236545', 'masculino');  
  
  insert into db_usuario.contato (tel_fixo, tel_celular, tel_contato, id_usuario) values
  (33766536, 992265658, 92261417, 1);   
  
  select * from contato;
  select * from usuario;
  
  select * from usuario inner join contato where idusuario = id_usuario;