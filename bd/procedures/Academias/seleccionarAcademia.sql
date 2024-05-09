use bd_lab;
drop procedure if exists seleccionarAcademia;
DELIMITER //
CREATE PROCEDURE seleccionarAcademia(
    IN academia_id INT
)
BEGIN
    IF academia_id = 0 THEN
        SELECT * FROM academia;
    ELSE
        SELECT * FROM academia WHERE id_academia = academia_id;
    END IF;
END //
DELIMITER ;
