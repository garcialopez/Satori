drop procedure if exists eliminarAcademia;
delimiter //
create procedure eliminarAcademia(
in id_academia1 int
 )
begin 
DELETE FROM academia WHERE id_academia = id_academia1;
end//  
delimiter ;