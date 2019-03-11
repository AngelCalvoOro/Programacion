-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 11-03-2019 a las 23:05:11
-- Versión del servidor: 5.6.13
-- Versión de PHP: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bsevento`
--
CREATE DATABASE IF NOT EXISTS `bsevento` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `bsevento`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `evento`
--

CREATE TABLE IF NOT EXISTS `evento` (
  `nombre` varchar(15) NOT NULL DEFAULT '',
  `lugar` varchar(15) NOT NULL,
  `fecha` date NOT NULL,
  `hInicio` time NOT NULL,
  `hFinal` time NOT NULL,
  `maxPersona` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `evento`
--

INSERT INTO `evento` (`nombre`, `lugar`, `fecha`, `hInicio`, `hFinal`, `maxPersona`) VALUES
('prueba1', 'Vitoria', '2019-03-20', '00:00:00', '01:00:00', 21),
('prueba2', 'Bilbao', '2019-03-29', '02:30:00', '04:30:00', 555),
('prueba3', 'Donosti', '2019-03-31', '05:30:00', '09:00:00', 10);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
