CREATE DATABASE TareaArellano;
use tareaarellano;
CREATE TABLE Tareas (
idTarea int primary key auto_increment,
NombreAsignatura varchar(100) Default Null,
Tarea  varchar(500) Default Null,
FechaEntrega date Default Null,
Entregada tinyint(4) Default Null
);


DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `SP_TAREA_ELIMINATE`(IN PId int)
BEGIN
DELETE FROM `tareaarellano`.`tareas`
WHERE id = Pid;
END$$
DELIMITER ;

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `SP_TAREA_GETALL`()
BEGIN
SELECT * FROM tareaarellano.tareas;
END$$
DELIMITER ;

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `SP_TAREA_GETINFO`(Pid int)
BEGIN
SELECT * FROM tareaarellano.tareas WHERE id = Pid; 
END$$
DELIMITER ;

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `SP_TAREA_TERMINADO`(IN Pid int)
BEGIN
update Tareas
set Entregada = 1 where id = Pid;
END$$
DELIMITER ;

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `SP_TAREA_UPDATE`(IN PId int, IN PNombreAsignatura varchar(100),IN PTarea  varchar(500),IN PFechaEntrega date)
BEGIN
update Tareas set
 NombreAsignatura = PNombreAsignatura,
Tarea = PTarea,
FechaEntrega = PFechaEntrega
where id = PId;
END$$
DELIMITER ;

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `SP_TAREAS_INSERT`( IN PNombreAsignatura varchar(100),IN PTarea  varchar(500),IN PFechaEntrega date)
BEGIN
INSERT INTO `tareaarellano`.`tareas`
(`NombreAsignatura`,
`Tarea`,
`FechaEntrega`)
VALUES
(
PNombreAsignatura,
PTarea,
PFechaEntrega);
END$$
DELIMITER ;


