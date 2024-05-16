use bd_lab;
drop procedure if exists actualizarLab;

DELIMITER //
CREATE PROCEDURE actualizarLab(
	IN id_laboratorio1 INT,
    IN nombre1 VARCHAR(45)
)
BEGIN
UPDATE laboratorio
SET
nombre = nombre1
WHERE id_laboratorio = id_laboratorio1;
END//