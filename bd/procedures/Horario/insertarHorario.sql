use bd_lab;

drop procedure if exists insertarHorario;
delimiter //
create procedure insertarHorario( 
         in desde_horario TIME,
         in hasta_horario TIME
 )
 begin 
	 insert into horario (desde, hasta) values (desde_horario, hasta_horario);
end//  
delimiter ;