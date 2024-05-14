drop procedure if exists eliminarMateria;
delimiter //
create procedure eliminarMateria(
in id_materia1 int
)
begin 
DELETE FROM materia WHERE id_materia = id_materia1;
end //
delimiter ;