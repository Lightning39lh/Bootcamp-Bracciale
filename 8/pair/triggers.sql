Create Trigger sellers before delete on stock FOR EACH ROW
    insert into selled(nombre, cantidad) values (OLD.nombre,OLD.cantidad);