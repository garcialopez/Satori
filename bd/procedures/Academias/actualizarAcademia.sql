use bd_lab;
drop procedure if exists actualizarAcademia;
DELIMITER //
CREATE PROCEDURE actualizarAcademia(
	IN id_academia1 INT,
    IN nombre1 VARCHAR(45)
)
BEGIN

UPDATE academia
SET
nombre = nombre1
WHERE id_academia = id_academia1;

    
END//
DELIMITER ;