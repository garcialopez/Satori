USE bd_lab;
drop procedure if exists actualizarHorario;
delimiter //
create procedure actualizarHorario(
in id_horario1 int, 
in desde1 TIME,
  in hasta1 TIME
 )
 begin 
 UPDATE horario
 SET
 desde = desde1, hasta = hasta1 WHERE id_horario = id_horario1;
 end//  
 delimiter ;