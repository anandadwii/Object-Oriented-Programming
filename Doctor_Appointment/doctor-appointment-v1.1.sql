-- MariaDB dump 10.18  Distrib 10.5.8-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: doctor-appointment
-- ------------------------------------------------------
-- Server version	10.5.8-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `pasien`
--

DROP TABLE IF EXISTS `pasien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pasien` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(30) DEFAULT NULL,
  `Password` varchar(30) DEFAULT NULL,
  `Nama` varchar(50) DEFAULT NULL,
  `Umur` varchar(100) DEFAULT NULL,
  `Tanggal_lahir` date DEFAULT NULL,
  `Alamat` varchar(60) DEFAULT NULL,
  `Telepon` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pasien`
--

LOCK TABLES `pasien` WRITE;
/*!40000 ALTER TABLE `pasien` DISABLE KEYS */;
INSERT INTO `pasien` VALUES (14,'sukocorjmn','root','rajiman sukoco','test','2000-10-08','pondok','23441123411'),(15,'sukocorjmn','root','rajiman sukoco','test','2000-10-08','pondok','23441123411'),(16,'sukocorjmn','root','rajiman sukoco','test','2000-10-08','pondok','23441123411'),(17,'wahtzittooya','bikinibottom','what zit tooya','100','2012-12-20','pondok','0000123'),(18,'jkwdd','root','Joko Widodo','test','2020-12-16','Istana Kepresidenan ','1111111'),(19,'orionkishi','root','orion kishi','test','2000-10-08','bind','09284717274'),(46,'mamangkarti','cashmoney','kartinese','21','2000-06-09','traphouse','777'),(47,'teriyakiboyz','dripgang','Budianto','28','1999-01-01','99124545','Tebet');
/*!40000 ALTER TABLE `pasien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservasi`
--

DROP TABLE IF EXISTS `reservasi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reservasi` (
  `Urutan` int(12) NOT NULL AUTO_INCREMENT,
  `Dokter` varchar(100) DEFAULT NULL,
  `Hari` varchar(100) DEFAULT NULL,
  `Waktu` varchar(100) DEFAULT NULL,
  `UsernamePasien` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Urutan`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservasi`
--

LOCK TABLES `reservasi` WRITE;
/*!40000 ALTER TABLE `reservasi` DISABLE KEYS */;
INSERT INTO `reservasi` VALUES (1,'drg. Bernard Mahfouz, SpKG','2021-01-20','15.00-17.00','pasien'),(2,'drg. Bernard Mahfouz, SpKG','2021-01-20','15.00-17.00','mamangkarti'),(3,'drg. Bernard Mahfouz, SpKG','2021-01-19','15.00-17.00','teriyakiboyz'),(5,'drg. Bernard Mahfouz, SpKG','2021-01-19','15.00-17.00','test'),(8,'drg. Bernard Mahfouz, SpKG','2021-01-19','15.00-17.00','jkwdd');
/*!40000 ALTER TABLE `reservasi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `suster`
--

DROP TABLE IF EXISTS `suster`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `suster` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `Username` varchar(100) DEFAULT NULL,
  `Password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suster`
--

LOCK TABLES `suster` WRITE;
/*!40000 ALTER TABLE `suster` DISABLE KEYS */;
INSERT INTO `suster` VALUES (1,'doaibu','panjangumur');
/*!40000 ALTER TABLE `suster` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'doctor-appointment'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-07  5:56:41
