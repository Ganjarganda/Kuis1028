-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 12 Des 2017 pada 15.46
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis_1028`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `cv_1028`
--

CREATE TABLE `cv_1028` (
  `id` bigint(20) NOT NULL,
  `alamat` varchar(150) NOT NULL,
  `nama` varchar(150) NOT NULL,
  `tanggal_lahir` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `cv_1028`
--

INSERT INTO `cv_1028` (`id`, `alamat`, `nama`, `tanggal_lahir`) VALUES
(1, 'Jl Paus', 'Ganjar', '20 Oktober 2018'),
(2, 'Sudirman', 'Linda', '20 Oktober 2018'),
(3, 'Nangka', 'rahmaa', '20 Oktober 2018');

-- --------------------------------------------------------

--
-- Struktur dari tabel `nilai_1028`
--

CREATE TABLE `nilai_1028` (
  `id` bigint(20) NOT NULL,
  `mata_kuliah` varchar(150) NOT NULL,
  `nilai` double NOT NULL,
  `mcv_1028_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `nilai_1028`
--

INSERT INTO `nilai_1028` (`id`, `mata_kuliah`, `nilai`, `mcv_1028_id`) VALUES
(1, 'Biologi', 29, 1),
(2, 'Matematika', 54, 3),
(3, 'Fisika', 60, 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cv_1028`
--
ALTER TABLE `cv_1028`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `nilai_1028`
--
ALTER TABLE `nilai_1028`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK64pqaup3dwlck3us5pbw570rh` (`mcv_1028_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cv_1028`
--
ALTER TABLE `cv_1028`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `nilai_1028`
--
ALTER TABLE `nilai_1028`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `nilai_1028`
--
ALTER TABLE `nilai_1028`
  ADD CONSTRAINT `FK64pqaup3dwlck3us5pbw570rh` FOREIGN KEY (`mcv_1028_id`) REFERENCES `cv_1028` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
