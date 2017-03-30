CREATE DATABASE  IF NOT EXISTS `ipcount-core` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `ipcount-core`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: ipcount-core
-- ------------------------------------------------------
-- Server version	5.5.9

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `clients`
--

DROP TABLE IF EXISTS `clients`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clients` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hosts` char(32) NOT NULL DEFAULT 'localhost',
  `ipaddress` char(15) NOT NULL DEFAULT '0.0.0.0',
  `mac` char(17) NOT NULL DEFAULT '00:00:00:00:00:00',
  `rule` int(8) NOT NULL DEFAULT '0',
  `i` char(8) NOT NULL,
  `status` int(1) NOT NULL DEFAULT '1',
  `tplane` int(2) NOT NULL,
  `name` char(255) NOT NULL DEFAULT '',
  `phone` char(64) NOT NULL DEFAULT '',
  `sms` char(16) NOT NULL DEFAULT '',
  `address` char(255) NOT NULL DEFAULT '',
  `streetname` char(64) NOT NULL DEFAULT '',
  `housenumber` char(16) NOT NULL DEFAULT '',
  `flatnumber` char(16) NOT NULL DEFAULT '',
  `mail` char(64) NOT NULL DEFAULT 'email@example.com',
  `password` char(16) NOT NULL,
  `balance` double(10,2) NOT NULL DEFAULT '0.00',
  `speedin` int(2) NOT NULL DEFAULT '1',
  `speedout` int(2) NOT NULL DEFAULT '1',
  `speedloc` int(2) NOT NULL DEFAULT '1',
  `date` date NOT NULL DEFAULT '1970-01-01',
  `ndog` int(8) NOT NULL,
  `groupc` int(4) NOT NULL DEFAULT '0',
  `statusp` int(1) NOT NULL DEFAULT '1',
  `macr` int(1) NOT NULL DEFAULT '0',
  `ruler` int(1) NOT NULL DEFAULT '0',
  `speedinr` int(1) NOT NULL DEFAULT '0',
  `speedoutr` int(1) NOT NULL DEFAULT '0',
  `speedlocr` int(1) NOT NULL DEFAULT '0',
  `tools` char(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
