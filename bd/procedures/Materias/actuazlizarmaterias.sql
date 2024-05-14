DROP PROCEDURE IF EXISTS actualizarMateria;
DELIMITER //
CREATE PROCEDURE actualizarMateria(
    IN id_materia1 INT,
    IN clave1 VARCHAR(45),
    IN nombre1 VARCHAR(45),
    IN id_academia1 INT
)
BEGIN
    UPDATE materia SET clave = clave1, nombre = nombre1, id_academiaf = id_academia1 
    WHERE id_materia = id_materia1;
END//
DELIMITER ;


