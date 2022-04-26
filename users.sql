-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 26, 2022 at 03:00 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.3.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `users`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `employeeid` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `nic` varchar(30) NOT NULL,
  `email` varchar(20) NOT NULL,
  `age` int(11) NOT NULL,
  `phone` int(11) NOT NULL,
  `type` varchar(15) NOT NULL,
  `address` text NOT NULL,
  `gender` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`employeeid`, `name`, `nic`, `email`, `age`, `phone`, `type`, `address`, `gender`) VALUES
(1, 'kumara', '265142187V', 'kumara@gmail.com', 40, 775124, 'employee', 'Wackwella rd, Galle', 'Male'),
(2, 'Namal', '286511906V', 'namal@gmail.com', 29, 654987, 'manager', 'Kaluthara rd, Matara', 'Male'),
(3, 'Amali', '562411097V', 'amali@gmail.com', 28, 876234, 'administor', 'Malabe rd, Colombo', 'Female');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `payment_Id` int(11) NOT NULL,
  `customer_Id` int(11) NOT NULL,
  `date` varchar(20) NOT NULL,
  `paymentType` varchar(30) NOT NULL,
  `amount` int(11) NOT NULL,
  `employeeID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`payment_Id`, `customer_Id`, `date`, `paymentType`, `amount`, `employeeID`) VALUES
(20, 8, '2020-01-14', 'card', 2000, 2),
(21, 9, '2020-06-20', 'cheque', 2100, 3),
(22, 10, '2021-01-14', 'cheque', 1000, 3);

-- --------------------------------------------------------

--
-- Table structure for table `performance`
--

CREATE TABLE `performance` (
  `Year` int(11) NOT NULL,
  `manufAmnt` bigint(20) NOT NULL,
  `consAmnt` bigint(20) NOT NULL,
  `storedAmnt` bigint(20) NOT NULL,
  `totSales` double NOT NULL,
  `totCost` double NOT NULL,
  `totProfit` double NOT NULL,
  `avgGen` bigint(20) NOT NULL,
  `avgCons` bigint(20) NOT NULL,
  `employID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `performance`
--

INSERT INTO `performance` (`Year`, `manufAmnt`, `consAmnt`, `storedAmnt`, `totSales`, `totCost`, `totProfit`, `avgGen`, `avgCons`, `employID`) VALUES
(2020, 7000, 5400, 400, 68000, 60000, 8000, 74030, 70000, 1),
(2021, 69000, 63000, 800, 72000, 68000, 4000, 69930, 75000, 1),
(2022, 69999, 60000, 800, 79000, 69000, 10000, 90000, 84000, 3);

-- --------------------------------------------------------

--
-- Table structure for table `person`
--

CREATE TABLE `person` (
  `cusID` int(11) NOT NULL,
  `cusAccountNo` varchar(30) NOT NULL,
  `cusAddress` text NOT NULL,
  `cusBankAccNo` varchar(30) NOT NULL,
  `cusEmail` varchar(30) NOT NULL,
  `cusNIC` varchar(30) NOT NULL,
  `cusName` varchar(50) NOT NULL,
  `cusPhone` varchar(20) NOT NULL,
  `cusPassword` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `person`
--

INSERT INTO `person` (`cusID`, `cusAccountNo`, `cusAddress`, `cusBankAccNo`, `cusEmail`, `cusNIC`, `cusName`, `cusPhone`, `cusPassword`) VALUES
(8, '58930A', 'Wackwella rd, Galle', '640-329-50-86', 'kavi@gmail.com', '493372115V', 'Kavi', '+94763918624', 'kavi123!'),
(9, '11223A', 'Ahangama rd, Galle', '487-289-5189', 'mana@gmail.com', '785372115V', 'Mana', '+94762814590', '67Mana**'),
(10, '33333A', 'Dikwella rd, Matara', '517-222-5899', 'manay@gmail.com', '874933026V', 'Samal', '+94850814590', 'sama49?$');

-- --------------------------------------------------------

--
-- Table structure for table `tb_consum`
--

CREATE TABLE `tb_consum` (
  `id` int(10) NOT NULL,
  `date` int(10) NOT NULL,
  `units` int(30) NOT NULL,
  `cus_id` int(11) NOT NULL,
  `employeeid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_consum`
--

INSERT INTO `tb_consum` (`id`, `date`, `units`, `cus_id`, `employeeid`) VALUES
(1, 20220105, 10, 8, 1),
(2, 20220205, 15, 9, 3),
(3, 20220305, 20, 8, 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`employeeid`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`payment_Id`),
  ADD KEY `custmor` (`customer_Id`),
  ADD KEY `test` (`employeeID`);

--
-- Indexes for table `performance`
--
ALTER TABLE `performance`
  ADD PRIMARY KEY (`Year`),
  ADD KEY `empl` (`employID`);

--
-- Indexes for table `person`
--
ALTER TABLE `person`
  ADD PRIMARY KEY (`cusID`);

--
-- Indexes for table `tb_consum`
--
ALTER TABLE `tb_consum`
  ADD PRIMARY KEY (`id`),
  ADD KEY `custm` (`cus_id`),
  ADD KEY `empy` (`employeeid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `employeeid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `payment_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `performance`
--
ALTER TABLE `performance`
  MODIFY `Year` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2023;

--
-- AUTO_INCREMENT for table `person`
--
ALTER TABLE `person`
  MODIFY `cusID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `tb_consum`
--
ALTER TABLE `tb_consum`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `payment`
--
ALTER TABLE `payment`
  ADD CONSTRAINT `custmor` FOREIGN KEY (`customer_Id`) REFERENCES `person` (`cusID`),
  ADD CONSTRAINT `test` FOREIGN KEY (`employeeID`) REFERENCES `employee` (`employeeid`);

--
-- Constraints for table `performance`
--
ALTER TABLE `performance`
  ADD CONSTRAINT `empl` FOREIGN KEY (`employID`) REFERENCES `employee` (`employeeid`);

--
-- Constraints for table `tb_consum`
--
ALTER TABLE `tb_consum`
  ADD CONSTRAINT `custm` FOREIGN KEY (`cus_id`) REFERENCES `person` (`cusID`),
  ADD CONSTRAINT `empy` FOREIGN KEY (`employeeid`) REFERENCES `employee` (`employeeid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
