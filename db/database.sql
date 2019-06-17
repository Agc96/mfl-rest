-- MySQL Script generated by MySQL Workbench
-- Mon Jun 17 13:28:50 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema MYFIRSTLOGIN
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema MYFIRSTLOGIN
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `MYFIRSTLOGIN` DEFAULT CHARACTER SET utf8 ;
USE `MYFIRSTLOGIN` ;

-- -----------------------------------------------------
-- Table `MYFIRSTLOGIN`.`MFL_APLICACION`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `MYFIRSTLOGIN`.`MFL_APLICACION` (
  `ID_APLICACION` INT NOT NULL AUTO_INCREMENT,
  `NOMBRE` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`ID_APLICACION`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `MYFIRSTLOGIN`.`MFL_USUARIO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `MYFIRSTLOGIN`.`MFL_USUARIO` (
  `ID_USUARIO` INT NOT NULL AUTO_INCREMENT,
  `NOMBRE_USUARIO` VARCHAR(50) NOT NULL,
  `HASH` VARCHAR(100) NOT NULL,
  `NOMBRE_COMPLETO` VARCHAR(100) NOT NULL,
  `CORREO` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`ID_USUARIO`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- EDIT: Otorgar permisos a la aplicación REST
-- -----------------------------------------------------
GRANT SELECT, INSERT, UPDATE, DELETE ON `MYFIRSTLOGIN`.* TO `webapp`@`localhost`;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
