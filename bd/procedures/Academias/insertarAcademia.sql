use bd_lab;
drop procedure if exists insertarAcademia;
DELIMITER //
CREATE PROCEDURE insertarAcademia(
    IN nombre_academia VARCHAR(45)
)
BEGIN
    INSERT INTO academia (nombre) VALUES (nombre_academia);
END//
DELIMITER ;
