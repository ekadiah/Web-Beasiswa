-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 20, 2020 at 08:24 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `beasiswa`
--

-- --------------------------------------------------------

--
-- Table structure for table `databeasiswa`
--

CREATE TABLE `databeasiswa` (
  `ID_Pesesrta` int(11) NOT NULL,
  `Kategori` varchar(30) NOT NULL,
  `Jenjang_Pendidikan` varchar(30) NOT NULL,
  `Lembaga_Beasiswa` varchar(30) NOT NULL,
  `Surat_Keterangan` varchar(30) NOT NULL,
  `Periode_Perkuliahan` varchar(30) NOT NULL,
  `Universitas` varchar(30) NOT NULL,
  `Fakultas` varchar(30) NOT NULL,
  `Jurusan` varchar(30) NOT NULL,
  `Lokasi_Tes` varchar(30) NOT NULL,
  `Program_Beasiswa_Lain` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `databeasiswa`
--

INSERT INTO `databeasiswa` (`ID_Pesesrta`, `Kategori`, `Jenjang_Pendidikan`, `Lembaga_Beasiswa`, `Surat_Keterangan`, `Periode_Perkuliahan`, `Universitas`, `Fakultas`, `Jurusan`, `Lokasi_Tes`, `Program_Beasiswa_Lain`) VALUES
(1, 'Reguler', 'S1', 'Bank Indonesia', 'Memiliki', 'Agustus 2020', 'Universitas Indonesia', 'Fakultas Teknik', 'Teknologi Informasi', 'Jakarta', 'Tidak'),
(2, 'Reguler', 'S1', 'PT Pertamina', 'Memiliki', 'September 2020', 'Universitas Brawijaya', 'Fakultas Hukum', 'Hukum', 'Surabaya', 'Tidak'),
(3, 'Reguler', 'S1', 'Bank Indonesia', 'Memiliki', 'Juli 2020', 'Universitas Negeri Yogyakarta', 'Fakultas Ekonomi', 'Akuntansi', 'Yogyakarta', 'Tidak'),
(7, 'Reguler', 'S1', 'PT Pertamina', 'Memiliki', 'Juli 2020', 'Universitas Negeri Semarang', 'Fakultas Matematika IPA', 'Kimia', 'Semarang', 'Tidak'),
(8, 'Reguler', 'S1', 'PT Pertamina', 'Memiliki', 'Juli 2020', 'Universitas Negeri Semarang', 'Fakultas Matematika IPA', 'Kimia', 'Semarang', 'Tidak'),
(9, 'Reguler', 'S1', 'Bank Indonesia', 'Memiliki', 'September 2020', 'Institut Pertanian Bogor', 'Fakultas Matematika IPA', 'Statistika', 'Bogor', 'Tidak'),
(10, 'Reguler', 'D3', 'PT Astra', 'Memiliki', 'Agustus 2020', 'Institut Pertanian Bogor', 'Fakultas Vokasi', 'Manajemen', 'Bogor', 'Tidak'),
(11, 'Reguler', 'D3', 'MUFG Bank', 'Memiliki', 'September 2020', 'Universitas Indonesia', 'Sekolah Vokasi', 'Akuntansi', 'Jakarta', 'Tidak');

-- --------------------------------------------------------

--
-- Table structure for table `datadiripeserta`
--

CREATE TABLE `datadiripeserta` (
  `ID_Peserta` int(11) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `NoKTP` int(11) NOT NULL,
  `JenisKelamin` varchar(50) NOT NULL,
  `StatusMenikah` varchar(50) NOT NULL,
  `Agama` varchar(50) NOT NULL,
  `TangalLahir` varchar(50) NOT NULL,
  `Alamat` text NOT NULL,
  `NoHp` int(11) NOT NULL,
  `Pendidikan` varchar(50) NOT NULL,
  `TahunLulus` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `datadiripeserta`
--

INSERT INTO `datadiripeserta` (`ID_Peserta`, `Nama`, `NoKTP`, `JenisKelamin`, `StatusMenikah`, `Agama`, `TangalLahir`, `Alamat`, `NoHp`, `Pendidikan`, `TahunLulus`) VALUES
(1, 'Eka Diah Pramesti', 23456789, 'Perempuan', 'Belum', 'Islam', '29062002', 'awsretyvgubhinkjl', 2345678, 'SMA/SMK', 2019),
(2, 'Eka Diah Pramesti', 35467890, 'Perempuan', 'Belum', 'Islam', '29062002', 'setrdytucyvkbjn', 457689, 'S1', 2019),
(3, 'Eka Diah Pramesti', 35467890, 'Perempuan', 'Belum', 'Islam', '29062002', 'setrdytucyvkbjn', 457689, 'S1', 2019);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `databeasiswa`
--
ALTER TABLE `databeasiswa`
  ADD PRIMARY KEY (`ID_Pesesrta`);

--
-- Indexes for table `datadiripeserta`
--
ALTER TABLE `datadiripeserta`
  ADD PRIMARY KEY (`ID_Peserta`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `databeasiswa`
--
ALTER TABLE `databeasiswa`
  MODIFY `ID_Pesesrta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `datadiripeserta`
--
ALTER TABLE `datadiripeserta`
  MODIFY `ID_Peserta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
