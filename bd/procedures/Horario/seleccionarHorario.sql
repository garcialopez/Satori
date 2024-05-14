USE bd_lab;
drop procedure if exists seleccionarHorario;
delimiter //
create procedure seleccionarHorario(
	in horario_id int
)
begin 
	if horario_id = 0 then
		select * from horario;
	else
		select * from horario where id_horario = horario_id;
	end if;
end//
delimiter ;