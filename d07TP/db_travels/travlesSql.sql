-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: travels
-- ------------------------------------------------------
-- Server version	5.5.5-10.6.5-MariaDB
drop database if exists travels;
create database travels;
use travels;
/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categories`
--

DROP TABLE IF EXISTS `categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `categories` (
  `categorie_id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(100) NOT NULL,
  PRIMARY KEY (`categorie_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categories`
--

LOCK TABLES `categories` WRITE;
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` VALUES (1,'vacances-estivales'),(2,'vacances d\'hiver'),(3,'vacances-urbaines'),(4,'toute l\'annee');
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `destinations`
--

DROP TABLE IF EXISTS `destinations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `destinations` (
  `destination_id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(100) NOT NULL,
  `adresse` varchar(100) NOT NULL,
  `cout` decimal(10,0) NOT NULL,
  `description` text NOT NULL,
  `rating` decimal(10,0) DEFAULT NULL,
  `ville_id` int(11) NOT NULL,
  `categorie` int(11) NOT NULL,
  `nomImage` mediumtext NOT NULL,
  `typeImage` smallint(6) NOT NULL,
  PRIMARY KEY (`destination_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `destinations`
--

LOCK TABLES `destinations` WRITE;
/*!40000 ALTER TABLE `destinations` DISABLE KEYS */;
INSERT INTO `destinations` VALUES (1,'Australie','adkfljdf',200,'dldjldf',5,4,1,'australie0',1),(2,'Greece','adkfljdf',200,'dldjldf',5,4,1,'greece0',1),(3,'Maldive','adkfljdf',200,'dldjldf',5,4,1,'maldive0',1),(4,'Maroc','adkfljdf',200,'dldjldf',5,4,1,'maroc0',1),(5,'New York','adkfljdf',200,'dldjldf',5,4,1,'newyork0',1),(6,'Quebec','adkfljdf',200,'dldjldf',5,4,1,'quebec0',2),(7,'San Francisco','adkfljdf',200,'dldjldf',5,4,1,'san francisco0',2),(8,'Suisse','adkfljdf',200,'dldjldf',5,4,1,'suisse0',2),(9,'Thailand','adkfljdf',200,'dldjldf',5,4,1,'thailand0',2),(10,'Tunisie','adkfljdf',200,'dldjldf',5,4,1,'tunisie0',2),(11,'Australie','adkfljdf',200,'dldjldf',5,4,1,'australie1',2),(12,'Greece','adkfljdf',200,'dldjldf',5,4,1,'greece1',3),(13,'Maldive','adkfljdf',200,'dldjldf',5,4,1,'maldive1',3),(14,'Maroc','adkfljdf',200,'dldjldf',5,4,1,'maroc1',3),(15,'Australie','adkfljdf',200,'dldjldf',5,4,1,'maroc2',3),(16,'Australie','adkfljdf',200,'dldjldf',5,4,1,'newyork1',3),(17,'Australie','adkfljdf',200,'dldjldf',5,4,1,'quebec1',3),(18,'Australie','adkfljdf',200,'dldjldf',5,4,1,'suisse1',3),(19,'Australie','adkfljdf',200,'dldjldf',5,4,1,'thailand1',3),(20,'Australie','adkfljdf',200,'dldjldf',5,4,1,'tunisie1',3);
/*!40000 ALTER TABLE `destinations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pays`
--

DROP TABLE IF EXISTS `pays`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `pays` (
  `pays_id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(100) NOT NULL,
  PRIMARY KEY (`pays_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pays`
--

LOCK TABLES `pays` WRITE;
/*!40000 ALTER TABLE `pays` DISABLE KEYS */;
INSERT INTO `pays` VALUES (1,'Canada'),(2,'Suisse'),(3,'Tunisie'),(4,'Maroc'),(5,'Maldives'),(6,'Grece'),(7,'Australie'),(8,'Thailand'),(9,'Etats-Unis');
/*!40000 ALTER TABLE `pays` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservations`
--

DROP TABLE IF EXISTS `reservations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `reservations` (
  `reservation_id` int(11) NOT NULL AUTO_INCREMENT,
  `destination_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `date_reservation` date NOT NULL,
  PRIMARY KEY (`reservation_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservations`
--

LOCK TABLES `reservations` WRITE;
/*!40000 ALTER TABLE `reservations` DISABLE KEYS */;
/*!40000 ALTER TABLE `reservations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `type_ref`
--

DROP TABLE IF EXISTS `type_ref`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `type_ref` (
  `id` smallint(6) NOT NULL AUTO_INCREMENT,
  `nom` mediumtext NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `type_ref`
--

LOCK TABLES `type_ref` WRITE;
/*!40000 ALTER TABLE `type_ref` DISABLE KEYS */;
INSERT INTO `type_ref` VALUES (1,'Caroussel'),(2,'Best deals'),(3,'Destinations');
/*!40000 ALTER TABLE `type_ref` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(100) NOT NULL,
  `pwd` varchar(100) NOT NULL,
  `nom` varchar(100) NOT NULL,
  `prenom` varchar(100) NOT NULL,
  `date_naissance` date NOT NULL,
  `date_creation` date NOT NULL,
  `telephone` varchar(100) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `villes`
--

DROP TABLE IF EXISTS `villes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `villes` (
  `ville_id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(100) NOT NULL,
  `pays_id` int(11) NOT NULL,
  PRIMARY KEY (`ville_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `villes`
--

LOCK TABLES `villes` WRITE;
/*!40000 ALTER TABLE `villes` DISABLE KEYS */;
INSERT INTO `villes` VALUES (1,'Quebec',1),(2,'Zermatt',2),(3,'Tunis',3),(4,'Marrakech',4),(5,'Santorini',6),(6,'Sydney',7),(7,'Bangkok',8),(8,'Male',5),(9,'New-York',9),(10,'San-francisco',9);
/*!40000 ALTER TABLE `villes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'travels'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-15 12:17:47
