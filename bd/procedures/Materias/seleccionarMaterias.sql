drop procedure if exists seleccionarMaterias;
delimiter //
create procedure seleccionarMaterias(
	in materia_id int
)
begin 
	if materia_id = 0 then
		select * from materia;
	else
		select * from materia where id_materia = materia_id;
	end if;
end //
delimiter ;