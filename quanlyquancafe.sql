-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 02, 2021 at 03:54 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlyquancafe`
--
CREATE DATABASE IF NOT EXISTS `quanlyquancafe` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci;
USE `quanlyquancafe`;

-- --------------------------------------------------------

--
-- Table structure for table `chitiethoadonbanhang`
--

DROP TABLE IF EXISTS `chitiethoadonbanhang`;
CREATE TABLE IF NOT EXISTS `chitiethoadonbanhang` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `tensanpham` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `soluong` int(10) NOT NULL,
  `dongia` decimal(10,2) NOT NULL,
  `tongtien` decimal(10,2) NOT NULL,
  `hoadonbanhangid` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_hoadonbanhang` (`hoadonbanhangid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `chitiethoadonnhapnguyenlieu`
--

DROP TABLE IF EXISTS `chitiethoadonnhapnguyenlieu`;
CREATE TABLE IF NOT EXISTS `chitiethoadonnhapnguyenlieu` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `ten` varchar(50) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `soluong` int(10) NOT NULL,
  `dongia` decimal(10,2) NOT NULL,
  `tongtien` decimal(10,2) NOT NULL,
  `HoaDonNhapNguyenLieuid` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_HoaDonNhapNguyenLieu` (`HoaDonNhapNguyenLieuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `chitiethoadontrahang`
--

DROP TABLE IF EXISTS `chitiethoadontrahang`;
CREATE TABLE IF NOT EXISTS `chitiethoadontrahang` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `tensanpham` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `soluong` int(10) NOT NULL,
  `dongia` decimal(10,2) NOT NULL,
  `tongtien` decimal(10,2) NOT NULL,
  `hoadontrahangid` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_hoadontrahang` (`hoadontrahangid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `chitieukhac`
--

DROP TABLE IF EXISTS `chitieukhac`;
CREATE TABLE IF NOT EXISTS `chitieukhac` (
  `STT` int(10) NOT NULL AUTO_INCREMENT,
  `ten` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `soluong` int(10) DEFAULT NULL,
  `dongia` decimal(10,2) DEFAULT NULL,
  `tongtien` decimal(10,2) DEFAULT NULL,
  `note` text COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  PRIMARY KEY (`STT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `hoadonbanhang`
--

DROP TABLE IF EXISTS `hoadonbanhang`;
CREATE TABLE IF NOT EXISTS `hoadonbanhang` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `ngaytao` date NOT NULL,
  `tongtien` decimal(10,2) NOT NULL,
  `thanhtien` decimal(10,2) NOT NULL,
  `khachhangid` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_khachhang` (`khachhangid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `hoadonnhapnguyenlieu`
--

DROP TABLE IF EXISTS `hoadonnhapnguyenlieu`;
CREATE TABLE IF NOT EXISTS `hoadonnhapnguyenlieu` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `ngaytao` date NOT NULL,
  `tongtien` decimal(10,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `hoadontrahang`
--

DROP TABLE IF EXISTS `hoadontrahang`;
CREATE TABLE IF NOT EXISTS `hoadontrahang` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `ngaytao` date NOT NULL,
  `tongtien` decimal(10,2) NOT NULL,
  `thanhtien` decimal(10,2) NOT NULL,
  `hoadonbanhangid` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_hdbh` (`hoadonbanhangid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
CREATE TABLE IF NOT EXISTS `khachhang` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `ten` varchar(50) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `diaChi` text COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `sodienthoai` varchar(20) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `diemthuong` bigint(30) DEFAULT NULL,
  `loaiKHid` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_loaiKH` (`loaiKHid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `loaikh`
--

DROP TABLE IF EXISTS `loaikh`;
CREATE TABLE IF NOT EXISTS `loaikh` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `ten` varchar(50) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `giamgia` float(5,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `loainl`
--

DROP TABLE IF EXISTS `loainl`;
CREATE TABLE IF NOT EXISTS `loainl` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `loainv`
--

DROP TABLE IF EXISTS `loainv`;
CREATE TABLE IF NOT EXISTS `loainv` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `ten` varchar(30) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `loaisp`
--

DROP TABLE IF EXISTS `loaisp`;
CREATE TABLE IF NOT EXISTS `loaisp` (
  `id` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `ten` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `loaisp`
--

INSERT INTO `loaisp` (`id`, `ten`) VALUES
('CACAO', 'Cacao'),
('CAFE', 'C?? Ph??'),
('DAXAY', '???? Xay'),
('SINHTO', 'Sinh T???'),
('TRA', 'Tr??');

-- --------------------------------------------------------

--
-- Table structure for table `nguyenlieu`
--

DROP TABLE IF EXISTS `nguyenlieu`;
CREATE TABLE IF NOT EXISTS `nguyenlieu` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `ten` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `gia` decimal(10,2) NOT NULL,
  `soluong` int(10) NOT NULL,
  `ngayhethan` date NOT NULL,
  `loainguyenlieuid` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_loainguyenlieu` (`loainguyenlieuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `nhacungcap`
--

DROP TABLE IF EXISTS `nhacungcap`;
CREATE TABLE IF NOT EXISTS `nhacungcap` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `ten` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
CREATE TABLE IF NOT EXISTS `nhanvien` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `IDcard` varchar(20) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `ten` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `ngaysinh` date DEFAULT NULL,
  `gioitinh` char(1) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `email` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `password` varchar(20) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `loainvid` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`),
  KEY `fk_loainv` (`loainvid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `sanpham`
--

DROP TABLE IF EXISTS `sanpham`;
CREATE TABLE IF NOT EXISTS `sanpham` (
  `id` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `ten` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `giatien` decimal(10,2) NOT NULL,
  `mota` text COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `isHot` tinyint(1) DEFAULT NULL,
  `loaisanphamid` varchar(50) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_loaisanpham` (`loaisanphamid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `sanpham`
--

INSERT INTO `sanpham` (`id`, `ten`, `giatien`, `mota`, `isHot`, `loaisanphamid`) VALUES
('CACAOBOTBIEN', 'Cacao B???t Bi???n', '35000.00', NULL, 1, 'CACAO'),
('CACAOSUADA', ' Cacao S???a ????', '30000.00', NULL, 0, 'CACAO'),
('CAFEDAXAY', 'Cookies Cafe ???? Xay', '40000.00', NULL, 0, 'DAXAY'),
('CHOCOLATEDAXAY', 'Cookies Chocolate ???? Xay', '45000.00', NULL, 1, 'DAXAY'),
('COTDUADA', 'C?? Ph?? C???t D???a ???? ', '27000.00', NULL, 1, 'CAFE'),
('COTDUANONG', 'C?? Ph?? C???t D???a N??ng', '27000.00', NULL, 1, 'CAFE'),
('DENDA', 'C?? Ph?? ??en ????', '22000.00', NULL, 1, 'CAFE'),
('DENNONG', 'C?? Ph?? ??en N??ng', '22000.00', NULL, 0, 'CAFE'),
('MATCHADAXAY', 'Cookies Matcha ???? Xay', '50000.00', NULL, 0, 'DAXAY'),
('SINHTODAU', 'Sinh T??? D??u', '40000.00', NULL, 1, 'SINHTO'),
('SINHTOTHOM', 'Sinh T??? D???a', '35000.00', NULL, 1, 'SINHTO'),
('SINHTOXOAI', 'Sinh T??? Xo??i', '35000.00', NULL, 0, 'SINHTO'),
('SUADA', 'C?? Ph?? S???a ????', '25000.00', NULL, 1, 'CAFE'),
('TRAHOACUC', 'Tr?? Thanh Y??n Hoa C??c', '30000.00', NULL, 1, 'TRA'),
('TRALUCBAO', 'Tr?? L???c B???o', '30000.00', NULL, 0, 'TRA');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `chitiethoadonbanhang`
--
ALTER TABLE `chitiethoadonbanhang`
  ADD CONSTRAINT `fk_hoadonbanhang` FOREIGN KEY (`hoadonbanhangid`) REFERENCES `hoadonbanhang` (`id`);

--
-- Constraints for table `chitiethoadonnhapnguyenlieu`
--
ALTER TABLE `chitiethoadonnhapnguyenlieu`
  ADD CONSTRAINT `fk_HoaDonNhapNguyenLieu` FOREIGN KEY (`HoaDonNhapNguyenLieuid`) REFERENCES `hoadonnhapnguyenlieu` (`id`);

--
-- Constraints for table `chitiethoadontrahang`
--
ALTER TABLE `chitiethoadontrahang`
  ADD CONSTRAINT `fk_hoadontrahang` FOREIGN KEY (`hoadontrahangid`) REFERENCES `hoadontrahang` (`id`);

--
-- Constraints for table `hoadonbanhang`
--
ALTER TABLE `hoadonbanhang`
  ADD CONSTRAINT `fk_khachhang` FOREIGN KEY (`khachhangid`) REFERENCES `khachhang` (`id`);

--
-- Constraints for table `hoadontrahang`
--
ALTER TABLE `hoadontrahang`
  ADD CONSTRAINT `fk_hdbh` FOREIGN KEY (`hoadonbanhangid`) REFERENCES `hoadonbanhang` (`id`);

--
-- Constraints for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD CONSTRAINT `fk_loaiKH` FOREIGN KEY (`loaiKHid`) REFERENCES `loaikh` (`id`);

--
-- Constraints for table `nguyenlieu`
--
ALTER TABLE `nguyenlieu`
  ADD CONSTRAINT `fk_loainguyenlieu` FOREIGN KEY (`loainguyenlieuid`) REFERENCES `loainl` (`id`);

--
-- Constraints for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `fk_loainv` FOREIGN KEY (`loainvid`) REFERENCES `loainv` (`id`);

--
-- Constraints for table `sanpham`
--
ALTER TABLE `sanpham`
  ADD CONSTRAINT `fk_loaisanpham` FOREIGN KEY (`loaisanphamid`) REFERENCES `loaisp` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
