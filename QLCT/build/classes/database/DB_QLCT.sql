
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';


CREATE SCHEMA IF NOT EXISTS `qlct` DEFAULT CHARACTER SET utf8 ;

CREATE SCHEMA IF NOT EXISTS `qlct` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `mydb` ;

CREATE TABLE IF NOT EXISTS `qlct`.`user` (
  `idUser` INT NOT NULL AUTO_INCREMENT,
  `taikhoan` VARCHAR(45) NULL,
  `matkhau` VARCHAR(45) NULL,
  PRIMARY KEY (`idUser`))
ENGINE = InnoDB;

USE `qlct` ;

CREATE TABLE IF NOT EXISTS `qlct`.`player` (
  `idPlayer` INT NOT NULL AUTO_INCREMENT,
  `playername` VARCHAR(50) NOT NULL,
  `year` DATETIME NULL DEFAULT NULL,
  `sex` VARCHAR(45) NOT NULL,
  `clothersnumber` VARCHAR(45) NULL DEFAULT NULL,
  `nationality` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(10) NULL DEFAULT NULL,
  `email` VARCHAR(100) NULL DEFAULT NULL,
  `salaly` VARCHAR(45) NULL DEFAULT NULL,
  `password` VARCHAR(45) NOT NULL,
  `role` INT NULL DEFAULT NULL,
  PRIMARY KEY (`idPlayer`))
ENGINE = InnoDB
AUTO_INCREMENT = 8
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
