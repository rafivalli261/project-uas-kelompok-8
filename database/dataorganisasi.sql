-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 12, 2022 at 04:35 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dataorganisasi`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `jabatan` enum('Admin','Kadiv') NOT NULL,
  `idDivisi` int(5) NOT NULL,
  `foto` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`, `jabatan`, `idDivisi`, `foto`) VALUES
('Aditya Erlangga', '123456', 'Kadiv', 1, 'Aditya Erlangga.png'),
('Anthonio Akbar', 'anthon123', 'Kadiv', 3, 'Anthonio Akbar.png'),
('Iklima Mardiana', 'iklima123', 'Kadiv', 4, 'd.png'),
('Muhammad Rafi Valliansyah', 'rafi123', 'Kadiv', 2, 'Muhammad Rafi Valliansyah.png'),
('Muzakki Abdillah', 'muzakki123', 'Kadiv', 5, 'Muzakki Abdillah.png'),
('Nagita Slavina', 'gigi122', 'Kadiv', 6, 'Nagita Slavina.jpg'),
('Rafi Ahmad', 'rafi123', 'Kadiv', 7, 'Rafi Ahmad.png');

-- --------------------------------------------------------

--
-- Table structure for table `divisi`
--

CREATE TABLE `divisi` (
  `idDivisi` int(10) NOT NULL,
  `namaDivisi` varchar(50) NOT NULL,
  `deskripsi` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `divisi`
--

INSERT INTO `divisi` (`idDivisi`, `namaDivisi`, `deskripsi`) VALUES
(0, 'Organisasi', 'Hanya mengikuti Organisasi'),
(1, 'Divisi Pengembangan Organisasi', 'Divisi ini bagus sekali'),
(2, 'DPMB', 'YUWGEFWQ WEFHW'),
(3, 'DIVKOM', 'SFSF RGVSVG'),
(4, 'DIVDIKLAT', 'AFEF DBDG'),
(5, 'DIVROH', 'KKDJD KSDJD KDSJD'),
(6, 'DIVADSOSPOL', 'JSAJS KJSAKSJ KJASAJS KJSAJS SASKAS AKSLAKS KLAKSAS KLAKSK KALKSAKS LAKSLASK LKSALKAS '),
(7, 'ekobis', 'asas');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `NIM` varchar(20) NOT NULL,
  `idDivisi` int(10) DEFAULT NULL,
  `idOrganisasi` int(10) DEFAULT NULL,
  `nama` varchar(50) NOT NULL,
  `kelas` char(5) NOT NULL,
  `angkatan` varchar(10) NOT NULL,
  `foto` varchar(100) NOT NULL,
  `ketuaDivisi` tinyint(1) NOT NULL,
  `ketuaOrganisasi` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`NIM`, `idDivisi`, `idOrganisasi`, `nama`, `kelas`, `angkatan`, `foto`, `ketuaDivisi`, `ketuaOrganisasi`) VALUES
('09', 3, 4, 'kl', 'a', '21', '09.png', 0, 0),
('098765', 6, 1, 'Febry', 'C2', '2020', '098765.png', 0, 1),
('1', 6, 0, 'daki', 'as', '21', '1.png', 0, 0),
('2008678', 7, 3, 'Ghiyats', 'B', '2020', '2008678.png', 0, 1),
('212121', 1, 0, 'iklima', 'A', '2020', 'asas', 0, 0),
('22', 6, 0, 'ds', 's', '21', '22.png', 1, 0),
('47856', 6, 3, 'Indah', 'C2', '2021', '47856.png', 0, 0),
('5634', 3, 0, 'Maudy Ayunda', 'C1', '2020', '5634.png', 0, 0),
('5676', 1, 0, 'saha', 'a', '21', '5676.png', 0, 0),
('6253', 2, 0, 'Jihan Salsabila', 'A', '2020', '6253.png', 0, 0),
('6666', 6, 0, 'Indah Dewi', 'A', '2021', '6666.png', 0, 0),
('6712', 1, 1, 'Mizel', 'B', '2020', '6712.png', 0, 0),
('67584', 4, 2, 'Nisa', 'B', '2021', '67584.png', 0, 0),
('77', 4, 0, 'as', 'a', '34', '77.png', 0, 0),
('786', 4, 0, 'Dewi Sandra', 'B', '2021', '786.png', 0, 0),
('789', 0, 1, 'MIzel', '', '2020', '789.png', 0, 0),
('7890', 5, 2, 'Naila', 'B', '2021', '7890.png', 0, 1),
('8769', 0, 4, 'kldks', 'a', '21', '8769.png', 0, 0),
('8888', 5, 0, 'Aurel Hermansyah', 'C2', '2021', '8888.png', 0, 0),
('88888', 2, 4, 'Isit', 'a', '21', '88888.png', 0, 1),
('90', 4, 0, 's', 's', 'a', '90.png', 0, 0),
('999999', 7, 0, 'Rizky Febian', 'A', '2020', '999999.png', 0, 0),
('sasa', 1, 1, 'aa', 'wer', '21', 'sasa.png', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `organisasi`
--

CREATE TABLE `organisasi` (
  `idOrganisasi` int(10) NOT NULL,
  `namaOrganisasi` varchar(50) NOT NULL,
  `fotoOrganisasi` varchar(50) NOT NULL,
  `deskripsiOrganisasi` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `organisasi`
--

INSERT INTO `organisasi` (`idOrganisasi`, `namaOrganisasi`, `fotoOrganisasi`, `deskripsiOrganisasi`) VALUES
(0, 'Tidak mengikuti Organisasi', 'Tidak mengikuti Organisasi', 'Tidak mengikuti Organisasi'),
(1, 'Clubink', 'faefafcasc', 'sejbhsehbkskjvbs'),
(2, 'OSTRIC', '', 'DASDADD'),
(3, 'KEMAKOM FC', 'EAFGSWG', 'WRGSRGSG'),
(4, 'English Club', 'svsrse', 'egfss');

-- --------------------------------------------------------

--
-- Table structure for table `proker`
--

CREATE TABLE `proker` (
  `idProker` int(30) NOT NULL,
  `idDivisi` int(10) NOT NULL,
  `namaProker` varchar(100) NOT NULL,
  `deskripsiProker` varchar(500) NOT NULL,
  `tanggalProker` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `proker`
--

INSERT INTO `proker` (`idProker`, `idDivisi`, `namaProker`, `deskripsiProker`, `tanggalProker`) VALUES
(1, 1, 'BMAIL', 'EGW GW WEGVSD SFDVSD', '2022-05-04'),
(2, 1, 'Interface', 'r rewsdszgfs sfse', '2022-05-03'),
(3, 1, 'sgsgr', 'ssgs', '2022-05-24'),
(4, 1, 'RAM ', 'RAM merupakan proker DPO', '2022-08-10'),
(5, 1, 'PLASA', 'Plasa adalah bla bla bla', '2022-06-09'),
(6, 2, 'Funmatch', 'Funmatch adalah bla bla bla', '2022-05-16'),
(7, 2, 'BeautyClass', 'beauty is cantik', '2022-06-07'),
(11, 3, 'Wisuda', 'wisuda diadakan 3 gelombang', '2022-06-22'),
(16, 4, 'IMPROVE', 'Sosialisasi MBKM dan Lomba', '2022-06-11'),
(21, 5, 'QURMA', 'Qurban With Kemakom', '2022-07-10'),
(26, 6, 'P2M', 'Pengabdian Kepada Masyarakat', '2022-06-29'),
(31, 7, 'Seminar Kewirausahaan', 'Seminar tentang wirausaha', '2022-06-27');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `divisi`
--
ALTER TABLE `divisi`
  ADD PRIMARY KEY (`idDivisi`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`NIM`),
  ADD KEY `idDivisi` (`idDivisi`,`idOrganisasi`),
  ADD KEY `idOrganisasi` (`idOrganisasi`);

--
-- Indexes for table `organisasi`
--
ALTER TABLE `organisasi`
  ADD PRIMARY KEY (`idOrganisasi`);

--
-- Indexes for table `proker`
--
ALTER TABLE `proker`
  ADD PRIMARY KEY (`idProker`),
  ADD KEY `idDivisi` (`idDivisi`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `divisi`
--
ALTER TABLE `divisi`
  MODIFY `idDivisi` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `organisasi`
--
ALTER TABLE `organisasi`
  MODIFY `idOrganisasi` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD CONSTRAINT `mahasiswa_ibfk_1` FOREIGN KEY (`idDivisi`) REFERENCES `divisi` (`idDivisi`),
  ADD CONSTRAINT `mahasiswa_ibfk_2` FOREIGN KEY (`idOrganisasi`) REFERENCES `organisasi` (`idOrganisasi`);

--
-- Constraints for table `proker`
--
ALTER TABLE `proker`
  ADD CONSTRAINT `proker_ibfk_1` FOREIGN KEY (`idDivisi`) REFERENCES `divisi` (`idDivisi`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
