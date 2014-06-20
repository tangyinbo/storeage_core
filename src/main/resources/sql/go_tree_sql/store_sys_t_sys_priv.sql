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
  `priv_id` int(11) NOT NULL AUTO_INCREMENT,
  `permission` varchar(200) DEFAULT NULL COMMENT '权限标识符',
  `description` varchar(100) DEFAULT NULL COMMENT '权限描述',
  `stat` char(3) DEFAULT NULL COMMENT '状态',
  `parent_priv` int(11) DEFAULT NULL,
  `priv_url` varchar(200) NOT NULL,
  `type` varchar(5) NOT NULL,
  PRIMARY KEY (`priv_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_sys_priv`
--

LOCK TABLES `t_sys_priv` WRITE;
/*!40000 ALTER TABLE `t_sys_priv` DISABLE KEYS */;
INSERT INTO `t_sys_priv` VALUES (0,'system:manager','系统管理','S0A',1,'/system/system/manager','menu'),(1,'system:*','根目录','S0A',NULL,'/system','menu'),(12,'system:user:all','用户管理','S0A',0,'/system/user/all','menu'),(13,'system:user:list','用户管理列表','S0A',12,'/storeage_core/user/list.jsp','menu'),(14,'system:user:create','添加用户','S0A',13,'/user/create','func'),(15,'system:user:edit','修改','S0A',13,'/system/user/edit','func'),(16,'system:priv:all','权限管理','S0A',0,'/system/priv/all','menu'),(17,'system:priv:create','添加权限','S0A',19,'/system/priv/create','func'),(18,'system:priv:edit','修改','S0A',19,'/system/priv/edit','func'),(19,'system:priv:list','权限列表','S0A',16,'/storeage_core/priv/list.jsp','menu'),(20,'system:priv:privtree','privList','S0A',16,'/storeage_core/priv/privtree.jsp','');
/*!40000 ALTER TABLE `t_sys_priv` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-06-20 17:23:18
