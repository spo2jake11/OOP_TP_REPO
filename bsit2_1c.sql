-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 23, 2023 at 01:37 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bsit2.1c`
--

-- --------------------------------------------------------

--
-- Table structure for table `reservation_db`
--

CREATE TABLE `reservation_db` (
  `ID` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `seat_taken` int(10) NOT NULL,
  `reserve_date` datetime NOT NULL,
  `reserve_time` time NOT NULL,
  `payment_mode` varchar(25) NOT NULL,
  `reserve_code` int(11) NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `reservation_db`
--

INSERT INTO `reservation_db` (`ID`, `name`, `email`, `seat_taken`, `reserve_date`, `reserve_time`, `payment_mode`, `reserve_code`, `created_at`, `updated_at`) VALUES
(23, '', '', 0, '0000-00-00 00:00:00', '08:00:00', 'Mode of payment', 449195812, '2023-11-22 20:57:24', '2023-11-22 20:57:24'),
(24, '', '', 0, '0000-00-00 00:00:00', '08:00:00', 'Mode of payment', 309590091, '2023-11-22 20:58:39', '2023-11-22 20:58:39'),
(25, 'asdasdasd', 'spo2jake11@gmail.com', 0, '2023-11-22 00:00:00', '08:00:00', 'Mode of payment', 31227036, '2023-11-22 21:02:10', '2023-11-22 21:02:10'),
(26, 'jake Villa', 'spo2jake11@gmail.com', 1, '2023-11-23 00:00:00', '15:00:00', 'Cash', 98181317, '2023-11-22 21:06:49', '2023-11-22 21:06:49'),
(27, 'jake Villa', 'spo2jake11@gmail.com', 1, '2023-11-30 00:00:00', '18:00:00', 'Cash', 191561470, '2023-11-22 21:27:04', '2023-11-22 21:27:04');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `reservation_db`
--
ALTER TABLE `reservation_db`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `reservation_db`
--
ALTER TABLE `reservation_db`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
