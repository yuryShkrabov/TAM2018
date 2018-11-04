-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1
-- Время создания: Ноя 04 2018 г., 22:23
-- Версия сервера: 5.5.25
-- Версия PHP: 5.2.12

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- База данных: `db_test`
--

-- --------------------------------------------------------

--
-- Структура таблицы `vehicle`
--

CREATE TABLE IF NOT EXISTS `vehicle` (
  `vehicle_id` int(5) NOT NULL AUTO_INCREMENT,
  `usage` varchar(255) NOT NULL,
  `make` varchar(255) NOT NULL,
  `capacity` double NOT NULL,
  `fuelConsumption` double NOT NULL,
  `year` year(4) NOT NULL,
  `price` int(11) NOT NULL,
  PRIMARY KEY (`vehicle_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4001 ;

--
-- Дамп данных таблицы `vehicle`
--

INSERT INTO `vehicle` (`vehicle_id`, `usage`, `make`, `capacity`, `fuelConsumption`, `year`, `price`) VALUES
(2000, 'TAXI', 'Volga', 3.5, 5.5, 2018, 15350),
(3000, 'rent', 'GreatWall', 6, 11.5, 2016, 12155),
(4000, 'Rent', 'Gilly', 2, 6.2, 2015, 6350);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
