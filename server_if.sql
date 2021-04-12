-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 12, 2021 at 01:31 AM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 7.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `test_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `server_if`
--

CREATE TABLE `server_if` (
  `id` int(11) NOT NULL,
  `userid` int(11) NOT NULL,
  `ts` varchar(100) NOT NULL,
  `lat_long` varchar(100) NOT NULL,
  `noun` varchar(100) NOT NULL,
  `verb` varchar(100) NOT NULL,
  `time_spent` varchar(100) NOT NULL,
  `properties` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `server_if`
--

INSERT INTO `server_if` (`id`, `userid`, `ts`, `lat_long`, `noun`, `verb`, `time_spent`, `properties`) VALUES
(1, 13, '342340315145250', '19.07,72.87', 'bill', 'post', '23', 'test5'),
(2, 15, '342340315145250', '19.07,72.87', 'bill', 'post', '23', 'test5'),
(3, 15, '342340315145250', '19.07,72.87', 'bill', 'post', '23', 'test5'),
(4, 15, '342340315145250', '19.07,72.87', 'bill', 'post', '23', 'test5');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `server_if`
--
ALTER TABLE `server_if`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `server_if`
--
ALTER TABLE `server_if`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
