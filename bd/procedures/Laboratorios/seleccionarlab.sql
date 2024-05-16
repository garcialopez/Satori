use bd_lab;
drop procedure if exists seleccionarLab;

DELIMITER //
CREATE PROCEDURE seleccionarLab(IN laboratorio_id INT)
BEGIN
	if laboratorio_id = 0 THEN
    SELECT * FROM laboratorio;
    ELSE
		SELECT * FROM laboratorio WHERE id_laboratorio = laboratorio_id;
        END IF;
END //
DELIMITER ;
DELIMITER ;