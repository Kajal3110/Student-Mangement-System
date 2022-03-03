-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: studentmanagement
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `registration`
--

DROP TABLE IF EXISTS `registration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `registration` (
  `rid` int NOT NULL AUTO_INCREMENT,
  `s_id` int NOT NULL,
  `coursefee` double NOT NULL,
  `registration_type` varchar(20) NOT NULL,
  `rdate` datetime NOT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=1602039 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registration`
--

LOCK TABLES `registration` WRITE;
/*!40000 ALTER TABLE `registration` DISABLE KEYS */;
INSERT INTO `registration` VALUES (1602031,74991,30000,'core java','2022-01-05 03:14:07'),(1602032,74992,35000,'Python','2022-02-04 05:14:07'),(1602033,74993,40000,'C++','2022-06-08 08:14:07'),(1602034,74994,30000,'Angularjs','2022-04-06 05:10:07'),(1602035,74881,33000,'Reactjs','2022-05-05 03:15:07'),(1602036,74882,58000,'Data Science','2022-06-05 03:15:07'),(1602037,74883,44000,'Machine learning','2022-08-06 08:10:07'),(1602038,74884,39000,'Full stack developer','2022-06-01 07:11:07');
/*!40000 ALTER TABLE `registration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `sid` varchar(10) DEFAULT NULL,
  `sname` varchar(100) DEFAULT NULL,
  `saddress` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES ('s104','komal',NULL),('s100','dev','patna'),('s100','dev','patna'),('s101','kumkum','delhi'),('s102','sunny','gujrat'),('s107','payal','bbsr'),('s108','shruti','odisha'),('s109','shurbhi','bihar'),('s110','kajal','jharkhand');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student1`
--

DROP TABLE IF EXISTS `student1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student1` (
  `sid` varchar(10) DEFAULT NULL,
  `sname` varchar(100) DEFAULT NULL,
  `saddress` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student1`
--

LOCK TABLES `student1` WRITE;
/*!40000 ALTER TABLE `student1` DISABLE KEYS */;
/*!40000 ALTER TABLE `student1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_information`
--

DROP TABLE IF EXISTS `student_information`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student_information` (
  `sid` int NOT NULL,
  `fname` varchar(50) NOT NULL,
  `lname` varchar(50) NOT NULL,
  `class` varchar(20) NOT NULL,
  `age` int NOT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_information`
--

LOCK TABLES `student_information` WRITE;
/*!40000 ALTER TABLE `student_information` DISABLE KEYS */;
/*!40000 ALTER TABLE `student_information` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentdetails`
--

DROP TABLE IF EXISTS `studentdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studentdetails` (
  `EnrollmentNumber` int NOT NULL,
  `Batch` varchar(50) NOT NULL,
  `Enrollment` varchar(100) NOT NULL,
  `Department` varchar(100) NOT NULL,
  `TypeOfStudent` varchar(100) DEFAULT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`EnrollmentNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentdetails`
--

LOCK TABLES `studentdetails` WRITE;
/*!40000 ALTER TABLE `studentdetails` DISABLE KEYS */;
INSERT INTO `studentdetails` VALUES (4440,'SS01','50000','Btech','Full stack developer','Kaju@1234');
/*!40000 ALTER TABLE `studentdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentmanagement_information`
--

DROP TABLE IF EXISTS `studentmanagement_information`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studentmanagement_information` (
  `s_id` int NOT NULL,
  `s_name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentmanagement_information`
--

LOCK TABLES `studentmanagement_information` WRITE;
/*!40000 ALTER TABLE `studentmanagement_information` DISABLE KEYS */;
INSERT INTO `studentmanagement_information` VALUES (121,'Rahul singh','1212'),(122,'Aman singh','1213'),(123,'Ravi singh','1214'),(124,'Abhishek singh','1252'),(125,'Shubham kumar','1215'),(126,'Ananaya sen','1216'),(127,'Susmita jhaa','1216'),(128,'Sherya dubey','1217'),(129,'Sagar prasad','1218'),(1201,'Pragati sihna','1219'),(1202,'Ekta shina','1220'),(1203,'Sherya singh','1221');
/*!40000 ALTER TABLE `studentmanagement_information` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentmanagement_user`
--

DROP TABLE IF EXISTS `studentmanagement_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studentmanagement_user` (
  `student_id` int NOT NULL,
  `student_name` varchar(50) NOT NULL,
  `student_address` varchar(100) NOT NULL,
  `course_fee` double DEFAULT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentmanagement_user`
--

LOCK TABLES `studentmanagement_user` WRITE;
/*!40000 ALTER TABLE `studentmanagement_user` DISABLE KEYS */;
INSERT INTO `studentmanagement_user` VALUES (111,'Monali shah','Kolkata',30000,'23564'),(112,'Sanjaya singh','Noida',35000,'123456'),(114,'Kajal shah','Bangalore',40000,'123456'),(115,'Purnima Lal','Pune',34000,'123556'),(116,'Shalini thakur','Patna',38000,'Kaju@3131'),(117,'Kapil sharma','UP',32000,'12444'),(118,'Rajest sharma','Punjab',25000,'12555'),(119,'Pinky agarwal','Mumbai',48000,'12666'),(1110,'Medha patel','Ranchi',50000,'12777');
/*!40000 ALTER TABLE `studentmanagement_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-02 14:58:29
