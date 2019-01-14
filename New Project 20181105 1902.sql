-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.45-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema simsv2
--

CREATE DATABASE IF NOT EXISTS simsv2;
USE simsv2;

--
-- Definition of table `course`
--

DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `cid` int(10) unsigned NOT NULL auto_increment,
  `course_name` varchar(45) default 'J2EE-r36-M',
  `course_hours` int(10) unsigned default '900',
  `fees` double default '80000',
  `batch_name` varchar(45) default 'ESAD',
  `module` int(10) unsigned default NULL,
  `schedule` varchar(45) default 'Morning',
  PRIMARY KEY  USING BTREE (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course`
--

/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` (`cid`,`course_name`,`course_hours`,`fees`,`batch_name`,`module`,`schedule`) VALUES 
 (1,'J2EE',940,250000,'TCLD-r36-A/01',555,'EVENING'),
 (2,'ESAD',900,150000,'TCLD-r36-A/01',8,'MORNING'),
 (3,'GAVE',900,150000,'TCLD-r36-A/01',8,'MORNING'),
 (4,'C#',900,150000,'TCLD-r36-A/01',12,'EVENING'),
 (5,'WPDF',900,150000,'TCLD-r36-A/01',10,'MORNING'),
 (6,'NT',900,150000,'TCLD-r36-A/01',12,'EVENING'),
 (7,'J2EE',555,250000,'TCLD-r36-A/01',11,'EVENING'),
 (8,'J2EE',940,250000,'TCLD-r36-A/01',10,'EVENING');
/*!40000 ALTER TABLE `course` ENABLE KEYS */;


--
-- Definition of table `regisreation`
--

DROP TABLE IF EXISTS `regisreation`;
CREATE TABLE `regisreation` (
  `regid` int(10) unsigned NOT NULL auto_increment,
  `first-name` varchar(45) default 'Sabbir',
  `last-name` varchar(45) default 'ALAM',
  `gender` varchar(45) default 'M',
  `email` varchar(45) default 'samble@gmail.com',
  `course_name` varchar(45) default 'ESAD',
  `phone` varchar(45) default '+8801xxxxxxxx',
  `address` varchar(45) default 'Dhaka,BD',
  PRIMARY KEY  USING BTREE (`regid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `regisreation`
--

/*!40000 ALTER TABLE `regisreation` DISABLE KEYS */;
INSERT INTO `regisreation` (`regid`,`first-name`,`last-name`,`gender`,`email`,`course_name`,`phone`,`address`) VALUES 
 (1,'sabbir','behan','M','sa@gmail.com','J2ee','+8801XXXXXXXXX','Dhaka-BD'),
 (2,'asdsd','edrter','F','sa@gmail.com','WPDF','+8801XXXXXXXXX','Dhaka-BD'),
 (3,'dfdfd','ererer','M','sa@gmail.com','NT','+8801XXXXXXXXX','Dhaka-BD'),
 (4,'gggggggggggg','ersad','F','sa@gmail.com','J2EE','+8801XXXXXXXXX','Dhaka-BD'),
 (5,'iiiiiiiiii','xdx','M','sa@gmail.com','J2EE','+8801XXXXXXXXX','Dhaka-BD'),
 (6,'oooooooooooo','dfdf','F','sa@gmail.com','J2EE','+8801XXXXXXXXX','Dhaka-BD'),
 (7,'ppppppppppp','dffdf','F','sa@gmail.com','J2EE','+8801XXXXXXXXX','Dhaka-BD'),
 (8,'Sadmin','ggg','F','sa@gmail.com','J2EE','+8801XXXXXXXXX','Dhaka-BD'),
 (9,'KANAK','gggggggggg','F','sa@gmail.com','J2EE','+8801XXXXXXXXX','Dhaka-BD'),
 (10,'JAMAK','fffffffffffff','F','sa@gmail.com','J2EE','+8801XXXXXXXXX','Dhaka-BD');
/*!40000 ALTER TABLE `regisreation` ENABLE KEYS */;


--
-- Definition of table `role`
--

DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `roleid` int(10) unsigned NOT NULL auto_increment,
  `role-name` varchar(45) NOT NULL default 'admin',
  PRIMARY KEY  USING BTREE (`roleid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `role`
--

/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` (`roleid`,`role-name`) VALUES 
 (1,'admin'),
 (2,'seo'),
 (3,'teacher'),
 (4,'student');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;


--
-- Definition of table `schedule`
--

DROP TABLE IF EXISTS `schedule`;
CREATE TABLE `schedule` (
  `schid` int(10) unsigned NOT NULL auto_increment,
  `schedule-name` varchar(45) default 'morning',
  PRIMARY KEY  USING BTREE (`schid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `schedule`
--

/*!40000 ALTER TABLE `schedule` DISABLE KEYS */;
INSERT INTO `schedule` (`schid`,`schedule-name`) VALUES 
 (1,'MORNING'),
 (2,'EVENING'),
 (3,'NIGHT');
/*!40000 ALTER TABLE `schedule` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(10) unsigned NOT NULL auto_increment,
  `username` varchar(45) default 'sabbir',
  `uemail` varchar(45) default 'abc@gmail.com',
  `upassword` varchar(45) default '123',
  `uroleid` int(10) unsigned default '1',
  PRIMARY KEY  USING BTREE (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`uid`,`username`,`uemail`,`upassword`,`uroleid`) VALUES 
 (2,'admin','admin@gmail.com','1234',1),
 (6,'sxsxa','axzazxa','1234',3),
 (7,'sabbir','dd@gm.cr','1234',2),
 (8,'aaa','aaa','aaa',2);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
