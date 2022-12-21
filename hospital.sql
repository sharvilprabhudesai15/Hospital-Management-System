-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 02, 2022 at 07:01 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital`
--

-- --------------------------------------------------------

--
-- Table structure for table `addadmitpatient`
--

CREATE TABLE `addadmitpatient` (
  `uniqueID` varchar(10) NOT NULL,
  `AdmitDate` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `addadmitpatient`
--

INSERT INTO `addadmitpatient` (`uniqueID`, `AdmitDate`) VALUES
('1', '02-12-2022');

-- --------------------------------------------------------

--
-- Table structure for table `addalladmit`
--

CREATE TABLE `addalladmit` (
  `uniqueID` varchar(10) NOT NULL,
  `AdmitDate` varchar(10) NOT NULL,
  `DischargeDate` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `addalladmit`
--

INSERT INTO `addalladmit` (`uniqueID`, `AdmitDate`, `DischargeDate`) VALUES
('1', '02-12-2022', '02-12-2022');

-- --------------------------------------------------------

--
-- Table structure for table `add_patient`
--

CREATE TABLE `add_patient` (
  `uniqueID` varchar(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `phone` int(10) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `email` varchar(40) NOT NULL,
  `disease` varchar(40) NOT NULL,
  `appointment_no` varchar(10) NOT NULL,
  `doctor_id` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `add_patient`
--

INSERT INTO `add_patient` (`uniqueID`, `name`, `phone`, `gender`, `email`, `disease`, `appointment_no`, `doctor_id`) VALUES
('1', 'aa', 22, 's', 'aa', 's', 'aa', '1'),
('3', 'qq', 22, 'q', 'q', 'q', 'q', '1');

-- --------------------------------------------------------

--
-- Table structure for table `doctor_record`
--

CREATE TABLE `doctor_record` (
  `doctor_id` varchar(10) NOT NULL,
  `doctor_name` varchar(50) NOT NULL,
  `doctor_specialization` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor_record`
--

INSERT INTO `doctor_record` (`doctor_id`, `doctor_name`, `doctor_specialization`) VALUES
('1', 'mm', 'nnn');

-- --------------------------------------------------------

--
-- Table structure for table `medicine_record`
--

CREATE TABLE `medicine_record` (
  `medicineId` varchar(10) NOT NULL,
  `medicineName` varchar(20) NOT NULL,
  `medicinePrice` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE `registration` (
  `name` varchar(15) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `email` varchar(10) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`name`, `phone`, `gender`, `email`, `username`, `password`) VALUES
('kk', '8888', 'ggg', 'mmm', 'system', 'system');

-- --------------------------------------------------------

--
-- Table structure for table `user_login`
--

CREATE TABLE `user_login` (
  `username` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_login`
--

INSERT INTO `user_login` (`username`, `password`) VALUES
('system', 'system');

-- --------------------------------------------------------

--
-- Stand-in structure for view `view1`
-- (See below for the actual view)
--
CREATE TABLE `view1` (
`medicineID` varchar(10)
,`medicineName` varchar(20)
);

-- --------------------------------------------------------

--
-- Structure for view `view1`
--
DROP TABLE IF EXISTS `view1`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view1`  AS SELECT `medicine_record`.`medicineId` AS `medicineID`, `medicine_record`.`medicineName` AS `medicineName` FROM `medicine_record``medicine_record`  ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `addadmitpatient`
--
ALTER TABLE `addadmitpatient`
  ADD PRIMARY KEY (`uniqueID`);

--
-- Indexes for table `addalladmit`
--
ALTER TABLE `addalladmit`
  ADD PRIMARY KEY (`uniqueID`);

--
-- Indexes for table `add_patient`
--
ALTER TABLE `add_patient`
  ADD PRIMARY KEY (`uniqueID`);

--
-- Indexes for table `doctor_record`
--
ALTER TABLE `doctor_record`
  ADD PRIMARY KEY (`doctor_id`);

--
-- Indexes for table `medicine_record`
--
ALTER TABLE `medicine_record`
  ADD PRIMARY KEY (`medicineId`);

--
-- Indexes for table `user_login`
--
ALTER TABLE `user_login`
  ADD PRIMARY KEY (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
