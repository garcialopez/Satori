USE bd_lab;
 drop procedure if exists eliminarHorario;
 delimiter //
 create procedure eliminarHorario(
 in id_horario1 int
 )
 begin 
 DELETE FROM horario WHERE id_horario = id_horario1;
 end//  
 delimiter ;