CREATE DATABASE Cinelitas;
use Cinelitas;

CREATE TABLE `salas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sala` varchar(50) NOT NULL,
  `capacidad` int(11) NOT NULL,
  `numero_sala` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

INSERT INTO `salas` VALUES (1,'Regular','200',1),(2,'Regular','200',2),(3,'Regular','200',3),(4,'IMAX','250',4),(5,'VIP','100',5),(6,'VIP','100',6),(7,'4DX','80',7);

CREATE TABLE `peliculas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `costo` varchar(45) NOT NULL,
  `fecha` varchar(45) NOT NULL,
  `salas_id` int(11) NOT NULL,
  PRIMARY KEY (`id`,`salas_id`),
  KEY `fk_peliculas_salasx` (`salas_id`),
  CONSTRAINT `fk_peliculas_salas` FOREIGN KEY (`salas_id`) REFERENCES `salas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ;

INSERT INTO `peliculas` VALUES (1,'Avatar','₡7000','15/3/2023','4');
INSERT INTO `peliculas` VALUES (2,'The Super Mario Bros. Movie','₡8000','5/4/2023','7');
INSERT INTO `peliculas` VALUES (3,'Scream 6','₡7000','12/3/2023','5');
INSERT INTO `peliculas` VALUES (4,'The Whale','₡4000','10/3/2023','1');