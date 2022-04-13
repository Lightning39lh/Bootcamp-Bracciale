

CREATE TABLE IF NOT EXISTS `almacen`.`stock` (
  `idstock` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `cantidad` INT NULL,
  PRIMARY KEY (`idstock`))
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `almacen`.`selled` (
  `idselled` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `cantidad` VARCHAR(45) NULL,
  PRIMARY KEY (`idselled`))
ENGINE = InnoDB;


Create Trigger sellers before delete on stock
begin
	insert into selled(nombre, cantidad) values (nombre,cantidad);
End
