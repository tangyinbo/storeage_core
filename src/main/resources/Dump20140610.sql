CREATE DATABASE  IF NOT EXISTS `store_sys` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `store_sys`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: store_sys
-- ------------------------------------------------------
-- Server version	5.6.17

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
-- Table structure for table `t_sys_priv`
--

DROP TABLE IF EXISTS `t_sys_priv`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_sys_priv` (
  `priv_id` int(11) NOT NULL,
  `permission` varchar(200) DEFAULT NULL COMMENT '权限标识符',
  `description` varchar(100) DEFAULT NULL COMMENT '权限描述',
  `stat` char(3) DEFAULT NULL COMMENT '状态'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_sys_priv`
--

LOCK TABLES `t_sys_priv` WRITE;
/*!40000 ALTER TABLE `t_sys_priv` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_sys_priv` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_sys_rolepriv`
--

DROP TABLE IF EXISTS `t_sys_rolepriv`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_sys_rolepriv` (
  `role_id` int(11) NOT NULL DEFAULT '0',
  `priv_id` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`role_id`,`priv_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_sys_rolepriv`
--

LOCK TABLES `t_sys_rolepriv` WRITE;
/*!40000 ALTER TABLE `t_sys_rolepriv` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_sys_rolepriv` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_sys_roles`
--

DROP TABLE IF EXISTS `t_sys_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_sys_roles` (
  `role_id` int(11) NOT NULL DEFAULT '0',
  `role` varchar(50) DEFAULT NULL COMMENT '角色名称',
  `description` varchar(100) DEFAULT NULL COMMENT '角色描述',
  `stat` char(3) DEFAULT NULL COMMENT '角色状态',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_sys_roles`
--

LOCK TABLES `t_sys_roles` WRITE;
/*!40000 ALTER TABLE `t_sys_roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_sys_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_sys_userrole`
--

DROP TABLE IF EXISTS `t_sys_userrole`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_sys_userrole` (
  `user_id` int(11) NOT NULL DEFAULT '0',
  `role_id` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_sys_userrole`
--

LOCK TABLES `t_sys_userrole` WRITE;
/*!40000 ALTER TABLE `t_sys_userrole` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_sys_userrole` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_sys_users`
--

DROP TABLE IF EXISTS `t_sys_users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_sys_users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `salt` varchar(200) DEFAULT NULL,
  `stat` char(3) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `IDX_SYS_USERS_ID` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_sys_users`
--

LOCK TABLES `t_sys_users` WRITE;
/*!40000 ALTER TABLE `t_sys_users` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_sys_users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-06-10 16:05:52
