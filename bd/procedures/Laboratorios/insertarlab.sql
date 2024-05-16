use bd_lab;
drop procedure if exists insertarLab;
DELIMITER //
CREATE PROCEDURE insertarLab(
    IN nombre VARCHAR(45)
)
BEGIN
	INSERT INTO laboratorio (nombre) VALUES (nombre);
    END//
DELIMITER ;