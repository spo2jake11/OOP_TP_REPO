-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 06, 2024 at 12:50 AM
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
-- Table structure for table `menu_db`
--

CREATE TABLE `menu_db` (
  `ID` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `detail` varchar(255) NOT NULL,
  `category` varchar(255) NOT NULL,
  `price` int(11) NOT NULL,
  `image` varchar(255) NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `menu_db`
--

INSERT INTO `menu_db` (`ID`, `name`, `detail`, `category`, `price`, `image`, `created_at`, `updated_at`) VALUES
(1, '1231', '123123', 'comboBoxChanged', 123, 'Nothing', '2024-01-05 22:11:21', '2024-01-05 22:11:21'),
(2, '123123', '12312', 'Item 1', 2131, 'Nothing', '2024-01-05 22:13:33', '2024-01-05 22:13:33'),
(3, 'hotdog', 'malaki at mataba', 'Item 2', 142, 'Nothing', '2024-01-05 22:38:41', '2024-01-05 22:38:41');

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
  `status` varchar(25) NOT NULL,
  `payment_mode` varchar(25) NOT NULL,
  `reserve_code` int(11) NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `reservation_db`
--

INSERT INTO `reservation_db` (`ID`, `name`, `email`, `seat_taken`, `reserve_date`, `reserve_time`, `status`, `payment_mode`, `reserve_code`, `created_at`, `updated_at`) VALUES
(23, '', '', 0, '0000-00-00 00:00:00', '08:00:00', '', 'Mode of payment', 449195812, '2023-11-22 20:57:24', '2023-11-22 20:57:24'),
(24, '', '', 0, '0000-00-00 00:00:00', '08:00:00', '', 'Mode of payment', 309590091, '2023-11-22 20:58:39', '2023-11-22 20:58:39'),
(25, 'asdasdasd', 'spo2jake11@gmail.com', 0, '2023-11-22 00:00:00', '08:00:00', '', 'Mode of payment', 31227036, '2023-11-22 21:02:10', '2023-11-22 21:02:10'),
(26, 'jake Villa', 'spo2jake11@gmail.com', 1, '2023-11-23 00:00:00', '15:00:00', '', 'Cash', 98181317, '2023-11-22 21:06:49', '2023-11-22 21:06:49'),
(27, 'jake Villa', 'spo2jake11@gmail.com', 1, '2023-11-30 00:00:00', '18:00:00', '', 'Cash', 191561470, '2023-11-22 21:27:04', '2023-11-22 21:27:04'),
(28, 'jake Villa', 'spo2jake11@gmail.com', 1, '2023-12-13 00:00:00', '15:00:00', 'Waiting', 'Cash', 170560469, '2023-12-25 13:40:34', '2023-12-25 13:40:34'),
(29, '', '', 1, '0000-00-00 00:00:00', '15:00:00', 'Waiting', 'Cash', 903576824, '2023-12-25 14:06:08', '2023-12-25 14:06:08'),
(30, 'lkashdlkads', 'spo2jake11@gmail.com', 1, '2023-12-13 00:00:00', '15:00:00', 'Waiting', 'Cash', 437617893, '2023-12-25 15:36:18', '2023-12-25 15:36:18'),
(31, 'Jake Vahah', 'hahahaha@gmail.com', 8, '2023-12-26 00:00:00', '16:00:00', 'Waiting', 'Credit', 123656074, '2023-12-25 20:49:49', '2023-12-25 20:49:49'),
(32, 'Jake Vahah', 'hahahaha@gmail.com', 9, '2023-12-29 00:00:00', '15:00:00', 'Waiting', 'Cash', 385949860, '2023-12-27 18:17:15', '2023-12-27 18:17:15'),
(33, 'Jake Vahah', 'hahahaha@gmail.com', 9, '2023-12-28 00:00:00', '18:00:00', 'Waiting', 'Cash', 656498306, '2023-12-27 18:44:00', '2023-12-27 18:44:00'),
(34, 'Jake Vahah', 'spo2jake11@gmail.com', 7, '2023-12-29 00:00:00', '15:00:00', 'Waiting', 'Cash', 797056086, '2023-12-28 13:12:08', '2023-12-28 13:12:08'),
(35, 'Jake Villanueva', 'spo2jake11@gmail.com', 3, '2023-12-30 00:00:00', '16:00:00', 'Waiting', 'Cash', 374014606, '2023-12-28 18:05:23', '2023-12-28 18:05:23'),
(36, 'Jake Villanueva', 'spo2jake11@gmail.com', 3, '2023-12-30 00:00:00', '16:00:00', 'Waiting', 'Cash', 831330930, '2023-12-28 18:05:25', '2023-12-28 18:05:25'),
(37, 'Jake Villanueva', 'spo2jake11@gmail.com', 3, '2023-12-30 00:00:00', '16:00:00', 'Waiting', 'Cash', 628925851, '2023-12-28 18:05:50', '2023-12-28 18:05:50'),
(38, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-31 00:00:00', '16:00:00', 'Waiting', 'Cash', 944679430, '2023-12-28 18:08:20', '2023-12-28 18:08:20'),
(39, 'Jake Villanueva', 'spo2jake11@gmail.com', 2, '2023-12-31 00:00:00', '15:00:00', 'Waiting', 'Credit', 647347778, '2023-12-28 18:15:43', '2023-12-28 18:15:43'),
(40, 'Jake Villanueva', 'spo2jake11@gmail.com', 2, '2023-12-31 00:00:00', '15:00:00', 'Waiting', 'Credit', 302849330, '2023-12-28 18:26:16', '2023-12-28 18:26:16'),
(41, 'Jake Villanueva', 'spo2jake11@gmail.com', 2, '2023-12-31 00:00:00', '15:00:00', 'Waiting', 'Credit', 581788462, '2023-12-28 18:27:04', '2023-12-28 18:27:04'),
(42, 'Jake Villanueva', 'spo2jake11@gmail.com', 2, '2023-12-31 00:00:00', '15:00:00', 'Waiting', 'Credit', 380908674, '2023-12-28 18:28:56', '2023-12-28 18:28:56'),
(43, 'Jake Villanueva', 'spo2jake11@gmail.com', 2, '2023-12-31 00:00:00', '15:00:00', 'Waiting', 'Credit', 824849800, '2023-12-28 18:29:33', '2023-12-28 18:29:33'),
(44, 'Jake Villanueva', 'spo2jake11@gmail.com', 2, '2023-12-31 00:00:00', '15:00:00', 'Waiting', 'Credit', 223358532, '2023-12-28 18:29:58', '2023-12-28 18:29:58'),
(45, 'Jake Villanueva', 'spo2jake11@gmail.com', 2, '2023-12-31 00:00:00', '15:00:00', 'Waiting', 'Credit', 127600423, '2023-12-28 18:32:40', '2023-12-28 18:32:40'),
(46, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-29 00:00:00', '15:00:00', 'Waiting', 'Credit', 21951138, '2023-12-28 18:40:00', '2023-12-28 18:40:00'),
(47, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-29 00:00:00', '15:00:00', 'Waiting', 'Credit', 928290146, '2023-12-28 18:41:07', '2023-12-28 18:41:07'),
(48, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-29 00:00:00', '15:00:00', 'Waiting', 'Credit', 342229944, '2023-12-28 18:43:16', '2023-12-28 18:43:16'),
(49, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-29 00:00:00', '15:00:00', 'Waiting', 'Credit', 797626934, '2023-12-28 18:44:09', '2023-12-28 18:44:09'),
(50, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-29 00:00:00', '15:00:00', 'Waiting', 'Credit', 993107908, '2023-12-28 18:45:28', '2023-12-28 18:45:28'),
(51, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-29 00:00:00', '15:00:00', 'Waiting', 'Credit', 585977499, '2023-12-28 18:46:45', '2023-12-28 18:46:45'),
(52, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-29 00:00:00', '15:00:00', 'Waiting', 'Credit', 767979418, '2023-12-28 18:48:40', '2023-12-28 18:48:40'),
(53, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-29 00:00:00', '15:00:00', 'Waiting', 'Credit', 837025521, '2023-12-28 18:49:56', '2023-12-28 18:49:56'),
(54, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-29 00:00:00', '15:00:00', 'Waiting', 'Credit', 20734626, '2023-12-28 18:50:13', '2023-12-28 18:50:13'),
(55, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-29 00:00:00', '15:00:00', 'Waiting', 'Credit', 582926598, '2023-12-28 18:54:06', '2023-12-28 18:54:06'),
(56, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-29 00:00:00', '15:00:00', 'Waiting', 'Credit', 117495793, '2023-12-28 19:28:06', '2023-12-28 19:28:06'),
(57, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-29 00:00:00', '15:00:00', 'Waiting', 'Credit', 787544803, '2023-12-28 19:29:43', '2023-12-28 19:29:43'),
(58, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-29 00:00:00', '15:00:00', 'Waiting', 'Credit', 213544077, '2023-12-28 19:30:00', '2023-12-28 19:30:00'),
(59, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-29 00:00:00', '15:00:00', 'Waiting', 'Credit', 333618796, '2023-12-28 19:30:35', '2023-12-28 19:30:35'),
(60, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-29 00:00:00', '15:00:00', 'Waiting', 'Credit', 25639746, '2023-12-28 19:32:29', '2023-12-28 19:32:29'),
(61, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-29 00:00:00', '15:00:00', 'Waiting', 'Credit', 475794341, '2023-12-28 19:33:38', '2023-12-28 19:33:38'),
(62, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-29 00:00:00', '15:00:00', 'Waiting', 'Credit', 955893363, '2023-12-28 19:33:51', '2023-12-28 19:33:51'),
(63, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-29 00:00:00', '15:00:00', 'Waiting', 'Credit', 954544041, '2023-12-28 19:40:08', '2023-12-28 19:40:08'),
(64, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-29 00:00:00', '15:00:00', 'Waiting', 'Credit', 82612023, '2023-12-28 19:42:02', '2023-12-28 19:42:02'),
(65, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-29 00:00:00', '15:00:00', 'Waiting', 'Credit', 197161101, '2023-12-28 19:50:42', '2023-12-28 19:50:42'),
(66, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-31 00:00:00', '15:00:00', 'Waiting', 'Cash', 544272319, '2023-12-28 20:31:56', '2023-12-28 20:31:56'),
(67, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-31 00:00:00', '15:00:00', 'Waiting', 'Cash', 816392801, '2023-12-28 20:33:00', '2023-12-28 20:33:00'),
(68, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-31 00:00:00', '15:00:00', 'Waiting', 'Cash', 916626655, '2023-12-28 20:34:18', '2023-12-28 20:34:18'),
(69, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-31 00:00:00', '15:00:00', 'Waiting', 'Cash', 634939316, '2023-12-28 20:35:34', '2023-12-28 20:35:34'),
(70, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-31 00:00:00', '15:00:00', 'Waiting', 'Cash', 423820207, '2023-12-28 20:36:51', '2023-12-28 20:36:51'),
(71, 'Jake Villanueva', 'spo2jake11@gmail.com', 1, '2023-12-31 00:00:00', '15:00:00', 'Waiting', 'Cash', 321324059, '2023-12-28 20:37:41', '2023-12-28 20:37:41'),
(72, 'Jake Vahah', 'spo2jake11@gmail.com', 4, '2024-01-01 00:00:00', '15:00:00', 'Waiting', 'Credit', 693340290, '2023-12-28 20:37:58', '2023-12-28 20:37:58'),
(73, 'John Doe', 'spo2jake11@gmail.com', 7, '2024-01-05 00:00:00', '15:00:00', 'Waiting', 'Cash', 821117140, '2023-12-28 20:40:43', '2023-12-28 20:40:43');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `menu_db`
--
ALTER TABLE `menu_db`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `reservation_db`
--
ALTER TABLE `reservation_db`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `menu_db`
--
ALTER TABLE `menu_db`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `reservation_db`
--
ALTER TABLE `reservation_db`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=74;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
