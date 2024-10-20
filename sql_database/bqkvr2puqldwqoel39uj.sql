-- phpMyAdmin SQL Dump
-- version 4.7.1
-- https://www.phpmyadmin.net/
--
-- Servidor: bqkvr2puqldwqoel39uj-mysql.services.clever-cloud.com:3306
-- Tiempo de generación: 20-10-2024 a las 02:32:51
-- Versión del servidor: 8.0.22-13
-- Versión de PHP: 7.0.33-0ubuntu0.16.04.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bqkvr2puqldwqoel39uj`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ambulance_serv`
--

CREATE TABLE `ambulance_serv` (
  `id_ambulance` int NOT NULL,
  `name_serv` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `adress_serv` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `cell_serv` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `pay_way` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `terms_condition` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bike_serv`
--

CREATE TABLE `bike_serv` (
  `id_bike` int NOT NULL,
  `name_serv` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `adress_serv` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `cell_serv` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `pay_way` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `terms_condition` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mechanics_serv`
--

CREATE TABLE `mechanics_serv` (
  `id_mechanics` int NOT NULL,
  `name_serv` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `adress_serv` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `cell_serv` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `pay_way` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `terms_condition` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Services`
--

CREATE TABLE `Services` (
  `id_serv` int NOT NULL,
  `name_serv` varchar(50) CHARACTER SET utf8 NOT NULL,
  `category_serv` varchar(50) CHARACTER SET utf8 NOT NULL,
  `fee_serv` varchar(50) CHARACTER SET utf8 NOT NULL,
  `terms_condition_serv` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user_db`
--

CREATE TABLE `user_db` (
  `id_user` int NOT NULL,
  `user_full_name` varchar(50) COLLATE utf8mb4_spanish_ci NOT NULL,
  `user_email` varchar(50) COLLATE utf8mb4_spanish_ci NOT NULL,
  `user_pNumber` bigint NOT NULL,
  `user_name` varchar(50) COLLATE utf8mb4_spanish_ci NOT NULL,
  `user_password` varchar(50) COLLATE utf8mb4_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `user_db`
--

INSERT INTO `user_db` (`id_user`, `user_full_name`, `user_email`, `user_pNumber`, `user_name`, `user_password`) VALUES
(1, 'Edizon Alexander Meza Leal', 'edimez14@gmail.com', 3209859286, 'edimez14', '123456789'),
(2, 'alexander leal', 'alexandermezaleal@gmail.com', 3209859286, 'alexander', '987654321');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ambulance_serv`
--
ALTER TABLE `ambulance_serv`
  ADD PRIMARY KEY (`id_ambulance`);

--
-- Indices de la tabla `bike_serv`
--
ALTER TABLE `bike_serv`
  ADD PRIMARY KEY (`id_bike`);

--
-- Indices de la tabla `mechanics_serv`
--
ALTER TABLE `mechanics_serv`
  ADD PRIMARY KEY (`id_mechanics`);

--
-- Indices de la tabla `Services`
--
ALTER TABLE `Services`
  ADD PRIMARY KEY (`id_serv`);

--
-- Indices de la tabla `user_db`
--
ALTER TABLE `user_db`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ambulance_serv`
--
ALTER TABLE `ambulance_serv`
  MODIFY `id_ambulance` int NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `bike_serv`
--
ALTER TABLE `bike_serv`
  MODIFY `id_bike` int NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `mechanics_serv`
--
ALTER TABLE `mechanics_serv`
  MODIFY `id_mechanics` int NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `Services`
--
ALTER TABLE `Services`
  MODIFY `id_serv` int NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `user_db`
--
ALTER TABLE `user_db`
  MODIFY `id_user` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `ambulance_serv`
--
ALTER TABLE `ambulance_serv`
  ADD CONSTRAINT `ambulance_serv_ibfk_1` FOREIGN KEY (`id_ambulance`) REFERENCES `Services` (`id_serv`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `bike_serv`
--
ALTER TABLE `bike_serv`
  ADD CONSTRAINT `bike_serv_ibfk_1` FOREIGN KEY (`id_bike`) REFERENCES `Services` (`id_serv`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `mechanics_serv`
--
ALTER TABLE `mechanics_serv`
  ADD CONSTRAINT `mechanics_serv_ibfk_1` FOREIGN KEY (`id_mechanics`) REFERENCES `Services` (`id_serv`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
