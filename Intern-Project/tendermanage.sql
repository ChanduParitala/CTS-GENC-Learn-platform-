--
-- Table structure for table `bidder`
--
drop database if exists tendermanage;

Create database tendermanage;
use tendermanage;
commit;


DROP TABLE IF EXISTS `bidder`;

CREATE TABLE `bidder` (
  `bid` varchar(15) NOT NULL,
  `vid` varchar(15) DEFAULT NULL,
  `tid` varchar(15) DEFAULT NULL,
  `bidamount` int DEFAULT NULL,
  `deadline` date DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`bid`)
) 

--
-- Dumping data for table `bidder`
--

LOCK TABLES `bidder` WRITE;
/*!40000 ALTER TABLE `bidder` DISABLE KEYS */;
INSERT INTO `bidder` VALUES ('B20190725022953','V20190725022813','T20190725022124',51000,'2019-07-19','Pending'),('B20190725023010','V20190725022813','T20190725022124',52000,'2019-07-19','Accepted'),('B20190725023248','V20190725022813','T20190725022416',100001,'2019-09-14','Rejected'),('B20190725023512','V20190725023446','T20190725022416',200000,'2019-09-14','Accepted'),('B20190725024125','V20190725023446','T20190725022601',5000001,'2019-07-28','Rejected'),('B20190725024243','V20190725022813','T20190725022601',6000000,'2019-07-28','Accepted'),('B20190725101444','V20190725100730','T20190725101322',1500000,'2019-07-19','Rejected'),('B20190725101519','V20190725023446','T20190725101239',150005,'2019-07-19','Rejected'),('B20190725101525','V20190725023446','T20190725101239',150050,'2019-07-19','Rejected'),('B20190725101554','V20190725022813','T20190725101322',160000,'2019-07-19','Accepted');
/*!40000 ALTER TABLE `bidder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notice`
--

DROP TABLE IF EXISTS `notice`;

CREATE TABLE `notice` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(35) DEFAULT NULL,
  `info` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`id`)
) 


--
-- Dumping data for table `notice`
--

LOCK TABLES `notice` WRITE;
/*!40000 ALTER TABLE `notice` DISABLE KEYS */;
INSERT INTO `notice` VALUES (2,'Gandhi Setu Construction','Construction is going to be started tommorow'),(3,'KOLKATA-HALDIA BRIDGE CONTRUCTION','ASSINGNED ENGINEER NEED TO REPORT AT THE CONSTRUCTION SITE BY TOMMOROW');
/*!40000 ALTER TABLE `notice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tender`
--

DROP TABLE IF EXISTS `tender`;

CREATE TABLE `tender` (
  `tid` varchar(15) NOT NULL,
  `tname` varchar(40) DEFAULT NULL,
  `ttype` varchar(20) DEFAULT NULL,
  `tprice` int DEFAULT NULL,
  `tdesc` varchar(300) DEFAULT NULL,
  `tdeadline` date DEFAULT NULL,
  `tloc` varchar(70) DEFAULT NULL,
  PRIMARY KEY (`tid`)
) 


--
-- Dumping data for table `tender`
--

LOCK TABLES `tender` WRITE;
/*!40000 ALTER TABLE `tender` DISABLE KEYS */;
INSERT INTO `tender` VALUES ('T20190725022124','Gandhi Setu Highway','maintainence',50000,'lkjhgfd','2019-07-19','Patna, Bihar'),('T20190725022416','MEGA CITY CONNECTING ROAD CONTRUCTION','construction',100000,'mega city road contruction','2019-09-14','Delhi'),('T20190725022601','KOKATA HALDIA BRIDGE CONTRUCTION','construction',5000000,'bridge contruction from kolkata to haldia','2019-07-28','KOLATA-HALDIA'),('T20190725101239','Game Development','software',150000,'We are going to start a project on game development using GPS specification. Interested condidates are required to bid as soon as possible','2019-07-19','Banglore, India'),('T20190725101322','Game Development','software',150000,'We are going to start a project on game development using GPS specification. Interested condidates are required to bid as soon as possible','2019-07-19','Banglore, India');
/*!40000 ALTER TABLE `tender` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tenderstatus`
--



 
DROP TABLE IF EXISTS `tenderstatus`;

CREATE TABLE `tenderstatus` (
  `tid` varchar(15) NOT NULL,
  `bid` varchar(15) DEFAULT NULL,
  `status` varchar(15) NOT NULL,
  `vid` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`tid`)
) 


--
-- Dumping data for table `tenderstatus`
--

LOCK TABLES `tenderstatus` WRITE;
/*!40000 ALTER TABLE `tenderstatus` DISABLE KEYS */;
INSERT INTO `tenderstatus` VALUES ('T20190725022124','B20190725023010','Assigned','V20190725022813'),('T20190725022416','B20190725023512','Assigned','V20190725023446'),('T20190725022601','B20190725024243','Assigned','V20190725022813'),('T20190725101322','B20190725101554','Assigned','V20190725022813');
/*!40000 ALTER TABLE `tenderstatus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendor`
--

DROP TABLE IF EXISTS `vendor`;

CREATE TABLE `vendor` (
  `vid` varchar(30) NOT NULL,
  `firstname` varchar(30) NOT NULL,
  `lastname` varchar(30) DEFAULT NULL,
  `dob` varchar(30) DEFAULT NULL,
  `gender` varchar(40) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `contact` varchar(30) DEFAULT NULL,
  `category` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`vid`)
) 

--
-- Dumping data for table `vendor`
--



LOCK TABLES `vendor` WRITE;
/*!40000 ALTER TABLE `vendor` DISABLE KEYS */;
/*!40000 ALTER TABLE `vendor` ENABLE KEYS */;
UNLOCK TABLES;

use tendermanage;

select * from `vendor`;