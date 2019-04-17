-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema ex_db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema ex_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ex_db` DEFAULT CHARACTER SET utf8 ;
USE `ex_db` ;

-- -----------------------------------------------------
-- Table `ex_db`.`customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ex_db`.`customer` (
  `customer_id` INT NOT NULL,
  `firstname` VARCHAR(45) NULL,
  `lastname` VARCHAR(45) NULL,
  `register_date` DATE NULL,
  `birth_date` DATE NULL,
  `address` VARCHAR(255) NULL,
  `zipcode` VARCHAR(5) NULL,
  `city` VARCHAR(45) NULL,
  `phone_number` VARCHAR(20) NULL,
  PRIMARY KEY (`customer_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ex_db`.`PURCHASE_ORDER`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ex_db`.`PURCHASE_ORDER` (
  `order_id` INT NOT NULL,
  `date` DATE NULL,
  `customer_id` INT NULL,
  PRIMARY KEY (`order_id`),
  INDEX `fk_PURCHASE_ORDER_customer_idx` (`customer_id` ASC),
  CONSTRAINT `fk_PURCHASE_ORDER_customer`
    FOREIGN KEY (`customer_id`)
    REFERENCES `ex_db`.`customer` (`customer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ex_db`.`product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ex_db`.`product` (
  `product_id` INT NOT NULL,
  `product_category_id` INT NULL,
  `name` VARCHAR(45) NULL,
  `description` VARCHAR(255) NULL,
  `price` DECIMAL(2,5) NULL,
  `available_stock` INT NULL,
  PRIMARY KEY (`product_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ex_db`.`product_has_PURCHASE_ORDER`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ex_db`.`product_has_PURCHASE_ORDER` (
  `product_id` INT NOT NULL,
  `order_id` INT NOT NULL,
  PRIMARY KEY (`product_id`, `order_id`),
  INDEX `fk_product_has_PURCHASE_ORDER_PURCHASE_ORDER1_idx` (`order_id` ASC),
  INDEX `fk_product_has_PURCHASE_ORDER_product1_idx` (`product_id` ASC),
  CONSTRAINT `fk_product_has_PURCHASE_ORDER_product1`
    FOREIGN KEY (`product_id`)
    REFERENCES `ex_db`.`product` (`product_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_product_has_PURCHASE_ORDER_PURCHASE_ORDER1`
    FOREIGN KEY (`order_id`)
    REFERENCES `ex_db`.`PURCHASE_ORDER` (`order_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ex_db`.`product_category`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ex_db`.`product_category` (
  `product_category_id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `description` VARCHAR(255) NULL,
  PRIMARY KEY (`product_category_id`),
  CONSTRAINT `fk_product_category_product1`
    FOREIGN KEY (`product_category_id`)
    REFERENCES `ex_db`.`product` (`product_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
