USE bd_lab;

DROP PROCEDURE IF EXISTS insertarMaterias;

DELIMITER //

CREATE PROCEDURE insertarMaterias(
   IN claveDoc VARCHAR(50),
   IN nombreDoc VARCHAR(50),
   IN id_academia1 INT
)
BEGIN
    INSERT INTO materia (clave, nombre, id_academiaf)
    VALUES (claveDoc, nombreDoc, id_academia1);
END //

DELIMITER ;
