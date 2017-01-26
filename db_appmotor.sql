/*
SQLyog Enterprise - MySQL GUI v7.14 
MySQL - 5.5.5-10.1.16-MariaDB : Database - db_appmotor
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_appmotor` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `db_appmotor`;

/*Table structure for table `tabel_login` */

DROP TABLE IF EXISTS `tabel_login`;

CREATE TABLE `tabel_login` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(35) DEFAULT NULL,
  `password` varchar(35) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `tabel_login` */

insert  into `tabel_login`(`id`,`username`,`password`) values (1,'Admin','Admin'),(2,'Afif','Afif');

/*Table structure for table `tabel_motor` */

DROP TABLE IF EXISTS `tabel_motor`;

CREATE TABLE `tabel_motor` (
  `idMotor` int(11) NOT NULL AUTO_INCREMENT,
  `KodeMotor` varchar(5) DEFAULT NULL,
  `JenisMotor` varchar(30) DEFAULT NULL,
  `NamaMotor` varchar(30) DEFAULT NULL,
  `MerkMotor` varchar(30) DEFAULT NULL,
  `HargaMotor` int(11) DEFAULT NULL,
  `Stock` int(11) DEFAULT NULL,
  PRIMARY KEY (`idMotor`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `tabel_motor` */

insert  into `tabel_motor`(`idMotor`,`KodeMotor`,`JenisMotor`,`NamaMotor`,`MerkMotor`,`HargaMotor`,`Stock`) values (1,'KM001','Bebek','Jupiter z','Yamaha',6000000,1),(2,'KM002','Matic','Mio','Yamaha',6000000,1);

/*Table structure for table `tabel_pembeli` */

DROP TABLE IF EXISTS `tabel_pembeli`;

CREATE TABLE `tabel_pembeli` (
  `idPembeli` int(11) NOT NULL AUTO_INCREMENT,
  `KodePembeli` varchar(5) DEFAULT NULL,
  `NamaPembeli` varchar(50) DEFAULT NULL,
  `NomorTeleponPembeli` varchar(15) DEFAULT NULL,
  `AlamatPembeli` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idPembeli`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `tabel_pembeli` */

insert  into `tabel_pembeli`(`idPembeli`,`KodePembeli`,`NamaPembeli`,`NomorTeleponPembeli`,`AlamatPembeli`) values (1,'KP001','Fikri Ramadhan','813121212','Kedaton'),(3,'KP002','Afif','4084894','dsdasasdad'),(4,'KP003','Ican','84456456','asddsdssa'),(5,'KP004','Dadang','08789456456','Way Halim');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
