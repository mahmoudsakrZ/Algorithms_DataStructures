CREATE DATABASE  IF NOT EXISTS `ecs_dev_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `ecs_dev_db`;
-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ecs_dev_db
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `activations`
--

DROP TABLE IF EXISTS `activations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `activations` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `activations_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `activations`
--

LOCK TABLES `activations` WRITE;
/*!40000 ALTER TABLE `activations` DISABLE KEYS */;
INSERT INTO `activations` VALUES (1,'e68532fc9a0a999e58e326958cc0cb0c3b421c5e24afb7dcc2e4566c3fde14ac',NULL,'2019-01-24 12:14:26','2019-01-31 09:09:14'),(2,'185718658f93b297d48cb2ec56cdedebcf5c1b8af56dedeca5e135983c060409',NULL,'2019-01-26 08:43:23','2019-01-31 11:50:38'),(3,'b26eb8f619ff3fe90c7c0ae0943ca8ca515212f6bc6f3195e6ad39e23014187e',12,'2019-01-29 19:50:36','2019-01-29 19:50:36'),(4,'32f2737b406d47217564b0552525b9b90e628588b0af73e1a58766a39ad1bd83',13,'2019-01-30 06:54:24','2019-01-30 06:54:24'),(5,'d72c4cf958d687b22a37e8577f6f8bf27023d7457a793ceb844c5eaa6e271de1',17,'2019-01-30 07:03:52','2019-01-30 07:03:52'),(6,'c8b805f0f50e2e91dfdc54de530e1de3faa072deef8132e597217bd9050248af',18,'2019-01-30 07:13:20','2019-01-30 07:13:20'),(7,'cd88d91e2e1443ff3f1bd118d88dac2bc4a33fd187de316fe599be0365c07f98',19,'2019-01-30 07:37:51','2019-01-30 07:37:51'),(8,'11dcc8c5db167e7d95d6c5c0f2f52929a4920ef7f92bd0a56322e7a079f0d946',10,'2019-01-31 09:09:14','2019-01-31 09:09:14'),(9,'4e2a7c5dde79237a179e7ff556a2c9af8e6a6574fef2f3c341956eea42fc15d5',11,'2019-01-31 11:50:37','2019-01-31 11:50:38'),(10,'416cd482b6d1eb10a18b0feefeef5dd46370879c066c7011d3d5f6fd53a0f4ab',NULL,'2019-01-31 12:01:37','2019-01-31 12:01:37'),(11,'fee021db012dec9d029d9a1da987eba7710255c77d51432de701bb2f196d8c5c',NULL,'2019-01-31 12:04:32','2019-01-31 12:04:32'),(12,'f71d1ce776f568ade9e0bb5190006adc99209e6ca86bcbbc12f8acc74183d2c0',NULL,'2019-01-31 12:12:48','2019-01-31 12:12:48');
/*!40000 ALTER TABLE `activations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bots`
--

DROP TABLE IF EXISTS `bots`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `bots` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `bot_id` varchar(255) NOT NULL,
  `access_token` text NOT NULL,
  `owner_id` int(11) NOT NULL,
  `is_welcome_bot` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `is_activated` tinyint(1) DEFAULT '1',
  `deleted_at` datetime DEFAULT NULL,
  `error` int(11) DEFAULT '0',
  `region` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `bot_id` (`bot_id`),
  KEY `owner_id` (`owner_id`),
  CONSTRAINT `bots_ibfk_1` FOREIGN KEY (`owner_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bots`
--

LOCK TABLES `bots` WRITE;
/*!40000 ALTER TABLE `bots` DISABLE KEYS */;
INSERT INTO `bots` VALUES (1,'user1bot','4531kjl43j2lkndshfdsjhlj4k','353kj-l23j1flkndshf-dsjhlj4k',1,0,'2019-01-23 15:49:38','2019-01-23 15:49:38',1,NULL,0,NULL),(2,'user2bot','453kjl43j2lkndshfdsjhlj4k','353kj-l23j4flkndshf-dsjhlj4k',2,0,'2019-01-23 15:49:38','2019-01-23 15:49:38',1,NULL,0,NULL),(3,'user3bot','453kjl43j3lkndshfdsjhlj4k','353kj-l43j4flkndshf-dsjhlj4k',3,0,'2019-01-23 15:49:38','2019-01-23 15:49:38',1,NULL,0,NULL),(4,'user4bot','453kjl43j4lkndshfdsjhlj4k','453kj-l43j4flkndshf-dsjhlj4k',4,0,'2019-01-23 15:49:38','2019-01-23 15:49:38',1,NULL,0,NULL),(5,'user5bot','453kjl43j5lkndshfdsjhlj4k','453kj-l43j5flkndshf-dsjhlj4k',5,0,'2019-01-23 15:49:38','2019-01-23 15:49:38',1,NULL,0,NULL),(6,'user6bot','453kjl43j6lkndshfdsjhlj4k','453kj-l43j6flkndshf-dsjhlj4k',6,0,'2019-01-23 15:49:38','2019-01-23 15:49:38',1,NULL,0,NULL),(7,'user7bot','453kjl43jflkndshfdsjhlj4k','453kj-l43jflkndshf-dsjhlj4k',7,0,'2019-01-23 15:49:38','2019-01-23 15:49:38',1,NULL,0,NULL),(8,'user7bot2','453kxjl43jflkndshfdsjhlj4k','453kj-l43xjflkndshf-dsjhlj4k',7,0,'2019-01-23 15:49:38','2019-01-23 15:49:38',1,NULL,0,NULL),(9,'user8bot','453kxj8l43jflkndshfdsjhlj4k','453kj-l43xjfl8kndshf-dsjhlj4k',8,0,'2019-01-23 15:49:38','2019-01-23 15:49:38',1,NULL,0,NULL),(10,'user9bot','453kxjl43jflkndshfd9jhlj4k','453kj-l439jflkndshf-dsjhlj4k',9,0,'2019-01-23 15:49:38','2019-01-23 15:49:38',1,NULL,0,NULL);
/*!40000 ALTER TABLE `bots` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `campaigns`
--

DROP TABLE IF EXISTS `campaigns`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `campaigns` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `date_from` datetime NOT NULL,
  `date_to` datetime NOT NULL,
  `bot_id` int(11) NOT NULL,
  `owner_id` int(11) NOT NULL,
  `triggered_cycle` int(11) DEFAULT NULL,
  `description` varchar(255) NOT NULL DEFAULT '',
  `did_trigger` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `is_activated` tinyint(1) DEFAULT '1',
  `trigger_count` int(11) DEFAULT '0',
  `time_from` time DEFAULT '00:00:00',
  `time_to` time DEFAULT '00:00:00',
  PRIMARY KEY (`id`),
  KEY `bot_id` (`bot_id`),
  KEY `owner_id` (`owner_id`),
  CONSTRAINT `campaigns_ibfk_1` FOREIGN KEY (`bot_id`) REFERENCES `bots` (`id`),
  CONSTRAINT `campaigns_ibfk_2` FOREIGN KEY (`owner_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `campaigns`
--

LOCK TABLES `campaigns` WRITE;
/*!40000 ALTER TABLE `campaigns` DISABLE KEYS */;
/*!40000 ALTER TABLE `campaigns` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `campaigns_ids`
--

DROP TABLE IF EXISTS `campaigns_ids`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `campaigns_ids` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bot_id` int(11) DEFAULT NULL,
  `campaign_id` int(11) NOT NULL,
  `trigger_id` varchar(255) NOT NULL,
  `payload_count` int(11) DEFAULT '0',
  `status` int(11) DEFAULT '0',
  `sent_first_date` datetime DEFAULT NULL,
  `sent_last_date` datetime DEFAULT NULL,
  `sent_count` int(11) DEFAULT '0',
  `delivered_first_date` datetime DEFAULT NULL,
  `delivered_last_date` datetime DEFAULT NULL,
  `delivered_count` int(11) DEFAULT NULL,
  `read_first_date` datetime DEFAULT NULL,
  `read_last_date` datetime DEFAULT NULL,
  `read_count` int(11) DEFAULT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `bot_id` (`bot_id`),
  KEY `campaign_id` (`campaign_id`),
  CONSTRAINT `campaigns_ids_ibfk_1` FOREIGN KEY (`bot_id`) REFERENCES `bots` (`id`),
  CONSTRAINT `campaigns_ids_ibfk_2` FOREIGN KEY (`campaign_id`) REFERENCES `campaigns` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `campaigns_ids`
--

LOCK TABLES `campaigns_ids` WRITE;
/*!40000 ALTER TABLE `campaigns_ids` DISABLE KEYS */;
/*!40000 ALTER TABLE `campaigns_ids` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `campaigns_msisdns`
--

DROP TABLE IF EXISTS `campaigns_msisdns`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `campaigns_msisdns` (
  `campaign_id` int(11) NOT NULL,
  `msisdn_id` int(11) NOT NULL,
  `triggered` tinyint(1) DEFAULT '0',
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `status` varchar(255) DEFAULT '',
  `sent` tinyint(1) DEFAULT '0',
  `delivered` tinyint(1) DEFAULT '0',
  `read` tinyint(1) DEFAULT '0',
  `error` tinyint(1) DEFAULT '0',
  `sent_date` datetime DEFAULT NULL,
  `delivered_date` datetime DEFAULT NULL,
  `read_date` datetime DEFAULT NULL,
  `error_date` datetime DEFAULT NULL,
  PRIMARY KEY (`campaign_id`,`msisdn_id`),
  KEY `msisdn_id` (`msisdn_id`),
  CONSTRAINT `campaigns_msisdns_ibfk_1` FOREIGN KEY (`campaign_id`) REFERENCES `campaigns` (`id`),
  CONSTRAINT `campaigns_msisdns_ibfk_2` FOREIGN KEY (`msisdn_id`) REFERENCES `msisdns` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `campaigns_msisdns`
--

LOCK TABLES `campaigns_msisdns` WRITE;
/*!40000 ALTER TABLE `campaigns_msisdns` DISABLE KEYS */;
/*!40000 ALTER TABLE `campaigns_msisdns` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `delegates_bots`
--

DROP TABLE IF EXISTS `delegates_bots`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `delegates_bots` (
  `bot_id` int(11) NOT NULL,
  `delegate_id` int(11) NOT NULL,
  `valid_until` datetime DEFAULT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`bot_id`,`delegate_id`),
  KEY `delegate_id` (`delegate_id`),
  CONSTRAINT `delegates_bots_ibfk_1` FOREIGN KEY (`bot_id`) REFERENCES `bots` (`id`),
  CONSTRAINT `delegates_bots_ibfk_2` FOREIGN KEY (`delegate_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delegates_bots`
--

LOCK TABLES `delegates_bots` WRITE;
/*!40000 ALTER TABLE `delegates_bots` DISABLE KEYS */;
/*!40000 ALTER TABLE `delegates_bots` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departments`
--

DROP TABLE IF EXISTS `departments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `departments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departments`
--

LOCK TABLES `departments` WRITE;
/*!40000 ALTER TABLE `departments` DISABLE KEYS */;
INSERT INTO `departments` VALUES (1,'Department A','a nice department A','2019-01-23 15:49:38','2019-01-31 12:14:35'),(2,'Departmant B','a nicer department','2019-01-23 15:49:38','2019-01-31 11:58:10'),(3,'Department C','blalal','2019-01-29 08:44:46','2019-01-31 12:14:35');
/*!40000 ALTER TABLE `departments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `msisdns`
--

DROP TABLE IF EXISTS `msisdns`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `msisdns` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rbm_enabled` tinyint(1) NOT NULL DEFAULT '0',
  `number` varchar(255) NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `richcard_standalone` tinyint(1) DEFAULT '0',
  `action_dial` tinyint(1) DEFAULT '0',
  `action_create_calendar_event` tinyint(1) DEFAULT '0',
  `action_open_url` tinyint(1) DEFAULT '0',
  `action_share_location` tinyint(1) DEFAULT '0',
  `action_view_location` tinyint(1) DEFAULT '0',
  `richcard_carousel` tinyint(1) DEFAULT '0',
  `payments_v1` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `number` (`number`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `msisdns`
--

LOCK TABLES `msisdns` WRITE;
/*!40000 ALTER TABLE `msisdns` DISABLE KEYS */;
INSERT INTO `msisdns` VALUES (1,0,'0100544687','2019-01-23 15:49:38','2019-01-23 15:49:38',0,0,0,0,0,0,0,0),(2,0,'01004676687','2019-01-23 15:49:38','2019-01-23 15:49:38',0,0,0,0,0,0,0,0),(3,0,'01204398846','2019-01-23 15:49:38','2019-01-23 15:49:38',0,0,0,0,0,0,0,0),(4,0,'01104396587','2019-01-23 15:49:38','2019-01-23 15:49:38',0,0,0,0,0,0,0,0);
/*!40000 ALTER TABLE `msisdns` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `password_resets`
--

DROP TABLE IF EXISTS `password_resets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `password_resets` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `save_code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `password_resets_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `password_resets`
--

LOCK TABLES `password_resets` WRITE;
/*!40000 ALTER TABLE `password_resets` DISABLE KEYS */;
/*!40000 ALTER TABLE `password_resets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sequelizemeta`
--

DROP TABLE IF EXISTS `sequelizemeta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `sequelizemeta` (
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`name`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sequelizemeta`
--

LOCK TABLES `sequelizemeta` WRITE;
/*!40000 ALTER TABLE `sequelizemeta` DISABLE KEYS */;
INSERT INTO `sequelizemeta` VALUES ('20180806061627-create-department.js'),('20180807082943-create-user.js'),('20180807083328-create-bot.js'),('20180813141218-create-delegates-bots.js'),('20180828130152-create-activation.js'),('20180902194540-create-msisdn.js'),('20180912120752-create-campaign.js'),('20180912165002-create-campaigns-msisdns.js'),('20181002134915-alter-access-token.js'),('20181008134425-add-bot-is-activated.js'),('20181009095213-add-bot-deleted-at.js'),('20181017095142-add-msisdn-features.js'),('20181029111647-create-campaigns-ids.js'),('20181029142958-add-campaign-msisdn-data.js'),('20181112105744-add-campaigns-is-activated.js'),('20181127101550-add-bot-error.js'),('20181204121544-add-campaign-columns.js'),('20181211120004-add-campaign-time.js'),('20181212085833-add-campaign-msisdn-dates.js'),('20181218094108-add-user-info.js'),('20181222135553-add-bot-region.js'),('20181222163933-password-resets.js'),('20181225121351-add-resets-save-code.js'),('20181230130840-add-user-phone.js');
/*!40000 ALTER TABLE `sequelizemeta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `is_activated` enum('Unactivated','pending_invitation','pending_action','activated','blocked') DEFAULT 'Unactivated',
  `department_id` int(11) DEFAULT NULL,
  `user_type` enum('admin','department_manager','campaign_manager') DEFAULT 'campaign_manager',
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `bot_id` varchar(255) DEFAULT '0',
  `bot_name` varchar(255) DEFAULT NULL,
  `bots_access_token` text,
  `mobile_number` varchar(255) DEFAULT NULL,
  `firstname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `mobile_country` varchar(255) DEFAULT '',
  `verified_mobile` tinyint(1) DEFAULT '0',
  `mobile_challenge_id` varchar(255) DEFAULT '',
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `username` (`username`),
  KEY `department_id` (`department_id`),
  CONSTRAINT `users_ibfk_1` FOREIGN KEY (`department_id`) REFERENCES `departments` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin@bots.com','$2b$10$/pzd99AGS54UzYpaEOxrLu2j.NKCCcO6r.to1UHSSg2mFLHniIiWe','admin','activated',NULL,'admin','2019-01-23 15:49:37','2019-01-23 15:49:37','0',NULL,NULL,NULL,NULL,NULL,'',0,''),(2,'admin2@bots.com','$2b$10$/pzd99AGS54UzYpaEOxrLu2j.NKCCcO6r.to1UHSSg2mFLHniIiWe','admin2','activated',NULL,'admin','2019-01-23 15:49:37','2019-01-23 15:49:37','0',NULL,NULL,NULL,NULL,NULL,'',0,''),(3,'depmanagerA@bots.com','$2b$10$/pzd99AGS54UzYpaEOxrLu2j.NKCCcO6r.to1UHSSg2mFLHniIiWe','depmanagerA','activated',1,'department_manager','2019-01-23 15:49:38','2019-01-23 15:49:38','0',NULL,NULL,NULL,NULL,NULL,'',0,''),(4,'depmanagerB@bots.com','$2b$10$/pzd99AGS54UzYpaEOxrLu2j.NKCCcO6r.to1UHSSg2mFLHniIiWe','depmanagerB','activated',1,'department_manager','2019-01-23 15:49:38','2019-01-23 15:49:38','0',NULL,NULL,NULL,NULL,NULL,'',0,''),(5,'depmanagerC@bots.com','$2b$10$/pzd99AGS54UzYpaEOxrLu2j.NKCCcO6r.to1UHSSg2mFLHniIiWe','depmanagerC','Unactivated',3,'department_manager','2019-01-23 15:49:38','2019-01-29 19:46:34','0',NULL,NULL,NULL,'dep','manager','',0,''),(6,'campmanagerA@bots.com','$2b$10$/pzd99AGS54UzYpaEOxrLu2j.NKCCcO6r.to1UHSSg2mFLHniIiWe','campmanagerA','activated',1,'campaign_manager','2019-01-23 15:49:38','2019-01-23 15:49:38','0',NULL,NULL,NULL,NULL,NULL,'',0,''),(7,'campmanagerB@bots.com','$2b$10$/pzd99AGS54UzYpaEOxrLu2j.NKCCcO6r.to1UHSSg2mFLHniIiWe','campmanagerB','activated',1,'campaign_manager','2019-01-23 15:49:38','2019-01-23 15:49:38','0',NULL,NULL,NULL,NULL,NULL,'',0,''),(8,'campmanagerC@bots.com','$2b$10$/pzd99AGS54UzYpaEOxrLu2j.NKCCcO6r.to1UHSSg2mFLHniIiWe','campmanagerC','activated',2,'campaign_manager','2019-01-23 15:49:38','2019-01-23 15:49:38','0',NULL,NULL,NULL,NULL,NULL,'',0,''),(9,'campmanagerD@bots.com','$2b$10$/pzd99AGS54UzYpaEOxrLu2j.NKCCcO6r.to1UHSSg2mFLHniIiWe','campmanagerD','activated',2,'campaign_manager','2019-01-23 15:49:38','2019-01-23 15:49:38','0',NULL,NULL,NULL,NULL,NULL,'',0,''),(10,'omaar@gmail.com','$2b$10$AT9Qml6qsP73Lr9dji5tVebdQUswwzixrsvGHsTGu4YNxBM9aYmk2','omarfesal4296','pending_invitation',2,'campaign_manager','2019-01-24 12:14:25','2019-01-31 11:56:22','0',NULL,NULL,NULL,'omar','ahmed','',0,''),(11,'ahmed@gmail.com','$2b$10$9/jkszroe.7FccRArTivEex3ntd2AExberZ9P98pjS.UNBtyVk1Ee','ahmed_ali_123','pending_invitation',1,'campaign_manager','2019-01-26 08:43:22','2019-01-31 11:57:04','0',NULL,NULL,NULL,'ahmed','Ali','',0,''),(12,'omar296@gmail.com','$2b$10$A3lFw8MCVyGKCS5l4/QyHObL.qtHCZaAvYPzD4MVAvwrE3CDihFD2','omar296','pending_invitation',1,'campaign_manager','2019-01-29 19:50:36','2019-01-29 19:56:05','0',NULL,NULL,NULL,'omar','fisal','',0,''),(13,'saraAli@gmail.com','$2b$10$2juRs8k/K1dQiRBQ0sMAoOLf9HfHzkNvaRi2eB9I.Irsc1rG1w4nu','SaraAli','pending_invitation',3,'campaign_manager','2019-01-30 06:54:24','2019-01-31 12:14:35','0',NULL,NULL,NULL,'Sara','ALI','',0,''),(14,'omar96@gmail.com','$2b$10$WNdi/UsKCAnyqrDCSI3lYu.QpAj4Hv0Rre7IynhXAs7uXskxqDxG2','weqwe','pending_invitation',1,'campaign_manager','2019-01-30 06:57:16','2019-01-30 06:57:16','0',NULL,NULL,NULL,'omar','fisal','',0,''),(15,'omarfessdal4296@gmail.com','$2b$10$r2CrZ1RiyZ3P5ckkWCsk3uez9qXmuLY5yIN0mlsMyovBHy.goDI1S','Hamo','pending_invitation',1,'campaign_manager','2019-01-30 07:00:33','2019-01-30 07:00:33','0',NULL,NULL,NULL,'omar','fisal','',0,''),(16,'omarfesal4296@gmail.com','$2b$10$1pPNYR1OVPCexeh1.jzKx.zR/yXCJuttkh50Vfvd9xMNRZNwNYA5a','ASDSAD','pending_invitation',1,'campaign_manager','2019-01-30 07:02:44','2019-01-30 07:02:44','0',NULL,NULL,NULL,'omar','fisal','',0,''),(17,'OBBAA@gmail.com','$2b$10$m1swPxPON8I92auOS3YO3OyV2EddoXE6vT99YgIrrLnXRUQ3CT0FO','OOBA','pending_invitation',3,'campaign_manager','2019-01-30 07:03:52','2019-01-31 11:58:10','0',NULL,NULL,NULL,'omar','fisal','',0,''),(18,'CCCC@gmail.com','$2b$10$nKqLUoTksjzAlNkrDOKagOmLyKy3aqlZQSNWEkkPSBNC77qpFqSNa','CCCC','pending_invitation',2,'campaign_manager','2019-01-30 07:13:19','2019-01-30 07:13:19','0',NULL,NULL,NULL,'omar','fisal','',0,''),(19,'MOAZ@gmail.com','$2b$10$uDNlJTkWenUVW6Dt0HtkAOoFYSqwVypIvt91HezeLCk1IEj9WFVAC','MOAZ','pending_invitation',1,'campaign_manager','2019-01-30 07:37:50','2019-01-31 11:58:44','0',NULL,NULL,NULL,'MOAZ','ALI','',0,''),(20,'admiASDASDAn@bASDots.com','$2a$10$9h0NtaH2kw9UrCwv5MZia.7zOAhsIRKnTBaDnqsUrxM2JxOusepda','DSA','pending_invitation',1,'department_manager','2019-01-31 12:01:36','2019-01-31 12:01:36','0',NULL,NULL,NULL,'ASD','SD','',0,''),(21,'ahmedFESAL@gmail.com','$2a$10$SNna60y6kAt0xUHhyLOpb.bJJAZae46Y7j2lo4S72bBVqofj.3E2C','ahmedFesalGG','pending_invitation',1,'campaign_manager','2019-01-31 12:04:32','2019-01-31 12:04:32','0',NULL,NULL,NULL,'ahmed','fesal','',0,''),(22,'ZAKI@gmail.com','$2a$10$0pWMHO8uvSlYsPOqCnkoWeWlA92vvdy95XT5rPEPYBSHv/GVD2pwS','Zaki','pending_invitation',1,'campaign_manager','2019-01-31 12:12:47','2019-01-31 12:12:47','0',NULL,NULL,NULL,'ZAKI','ALI','',0,'');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-02-10 14:57:15
