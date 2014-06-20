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
-- Table structure for table `t_sys_users`
--

DROP TABLE IF EXISTS `t_sys_users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_sys_users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `salt` varchar(200) DEFAULT NULL,
  `stat` char(3) DEFAULT NULL,
  `real_name` varchar(45) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `sex` varchar(6) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  KEY `IDX_SYS_USERS_ID` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_sys_users`
--

LOCK TABLES `t_sys_users` WRITE;
/*!40000 ALTER TABLE `t_sys_users` DISABLE KEYS */;
INSERT INTO `t_sys_users` VALUES (1,'zhang','394c4a39b50ae56661bfdf390c98845a','885271e2bb7d4f4811aae920cca893d1','S0A',NULL,NULL,NULL,NULL,NULL,NULL),(2,'li','2b2bde2b25f20519b4aceb2833e11461','6883dba0e3c3f4ba39e291cb5c9fc8a4','S0A',NULL,NULL,NULL,NULL,NULL,NULL),(3,'wu','49feff59b1573240e81b8c3d5f06eb88','61ae3d350ce65d9943ddad263dd35074','S0A',NULL,NULL,NULL,NULL,NULL,NULL),(4,'wang','7a6550ca85060b819b170e49f185e6de','061f84c894d5c68e8ec942449d94d6c2','S0X',NULL,NULL,NULL,NULL,NULL,NULL),(5,'wujianyuan5','e2b9b68f112144ca237c4092d09c5fad','89f7d46612d9e55ec206ef8c5fa92d8b','S0A',NULL,NULL,NULL,NULL,NULL,NULL),(7,'tangyinbo','790bbac9fa6a827e4dc16a4fa1cb08e4','d6ee3382f5f489a78cf895c65c3695dd','S0A','唐银波','tangyinboit@163.com','13431686027',NULL,12,'this is the first user that create by system'),(8,'tom','ca365a07a2f707fd0eeb1e9ff61f69d6','5be486b516a004ecc3dcc519a78f525d','S0A','tom','tom@email.com','13399999999',NULL,13,'hehe'),(9,'beike','f349258efe2e506e0c8a61e580b4373f','906088ddbc1379f4cd45e8afe4b83c71','S0A','beike','beike@163.com','1888888888',NULL,15,'15'),(10,'xiaoming','f293e7e26b3bdaad510c7f129a48bcab','5b04d6f61b2a814faa458a9a49aabcc6','S0A','xiaoming','xiaoming@qq.com','19900999999',NULL,19,'19'),(11,'wenwen','141c9809468c5933efd0eb535cfc4828','8add5a561ecb24e53fae9cd948be78d8','S0A','wenwen','wenwen','1555555555',NULL,65,'65'),(12,'liangfei','c764d8677ee9e2ddf0b412ac1fce2e98','d522e0ad3f6d7ac7f7891cb4455a2d3d','S0A','良妃','liangfei@qq.com','15555555555',NULL,56,'12'),(13,'admin','f99a2262f1e1d9f920d2efcf84126140','8b628223067a0d4a357cca75da5a279e','S0A','123','tangyinboit@163.com','13431686027',NULL,55,'55'),(14,'tantan','828f189dece4da109048b7b84a2715bf','7ae1375ed587dfd4eb76930a690a380c','S0A','tantan','tantan@163.com','1555555555','male/',NULL,'tantan'),(15,'nini','6a21a56dc4be3a3ee87fa31003194770','452c8f8d1a137d3b1625c9da185561f6','S0A','nini','nini@gmail.com','1222222','female',14,'nini');
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

-- Dump completed on 2014-06-20 17:23:18
