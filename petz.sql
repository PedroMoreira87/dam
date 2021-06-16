-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3308
-- Generation Time: Jun 16, 2021 at 10:03 PM
-- Server version: 8.0.21
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `petz`
--

-- --------------------------------------------------------

--
-- Table structure for table `adocoes`
--

DROP TABLE IF EXISTS `adocoes`;
CREATE TABLE IF NOT EXISTS `adocoes` (
  `idadocao` int NOT NULL AUTO_INCREMENT,
  `data` date NOT NULL,
  `comentario` varchar(45) NOT NULL,
  `usuario_idusuario` int NOT NULL,
  `animal_idanimal` int NOT NULL,
  PRIMARY KEY (`idadocao`),
  KEY `fk_adocao_usuario1_idx` (`usuario_idusuario`),
  KEY `fk_adocao_animal1_idx` (`animal_idanimal`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `adocoes`
--

INSERT INTO `adocoes` (`idadocao`, `data`, `comentario`, `usuario_idusuario`, `animal_idanimal`) VALUES
(8, '1999-09-07', 'Rato velho', 30, 14);

-- --------------------------------------------------------

--
-- Table structure for table `animais`
--

DROP TABLE IF EXISTS `animais`;
CREATE TABLE IF NOT EXISTS `animais` (
  `idanimal` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `especie` varchar(45) NOT NULL,
  `raca` varchar(45) NOT NULL,
  `idade` varchar(45) NOT NULL,
  `detalhes` varchar(45) NOT NULL,
  `adotado` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`idanimal`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `animais`
--

INSERT INTO `animais` (`idanimal`, `nome`, `especie`, `raca`, `idade`, `detalhes`, `adotado`) VALUES
(12, 'Gatinho', 'Felix', 'Catus', '3', 'É um gato', 0),
(13, 'Cãozinho', 'Canis', 'Familiaris', '5', 'É um cachorro', 0),
(14, 'Mickey', 'Mickey', 'Mouse', '93', 'Bem famoso', 1),
(15, 'Pinky', 'Rato', 'de laboratório', '26', 'É burro', 0),
(16, 'Cerebro', 'Rato', 'de laboratório', '26', 'É inteligente', 0);

-- --------------------------------------------------------

--
-- Table structure for table `enderecos`
--

DROP TABLE IF EXISTS `enderecos`;
CREATE TABLE IF NOT EXISTS `enderecos` (
  `idendereco` int NOT NULL AUTO_INCREMENT,
  `estado` varchar(45) NOT NULL,
  `cidade` varchar(45) NOT NULL,
  `bairro` varchar(45) NOT NULL,
  `rua` varchar(45) NOT NULL,
  `numero` int NOT NULL,
  PRIMARY KEY (`idendereco`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `enderecos`
--

INSERT INTO `enderecos` (`idendereco`, `estado`, `cidade`, `bairro`, `rua`, `numero`) VALUES
(27, 'Paraná', 'Curitiba', 'Hauer', 'Rua XYZ', 1212),
(28, 'Paraná', 'Curitiba', 'Centro', 'Rua David', 123),
(29, 'Paraná', 'Curitiba', 'Cajuru', 'Rua Pedro', 321),
(30, 'Paraná', 'Curitiba', 'Batel', 'Rua Prof. Bruninho', 1),
(31, 'Paraná', 'Curitiba', 'Uberaba', 'Rua Inst. Joao', 2),
(32, 'Paraná', 'Curitiba', 'Xaxim', 'Rua xax', 1233),
(33, 'Paraná', 'Curitiba', 'Reboucas', 'Rua jooj', 33),
(34, 'Paraná', 'Curitiba', 'Bom Retiro', 'Rua Pan', 8),
(35, 'Paraná', 'Curitiba', 'Atuba', 'Rua X', 11),
(36, 'Minas', 'BH', 'Eldorado', 'Rua z', 22),
(37, 'Acre', 'Rio Branco', 'Tropical', 'Rua 37', 38),
(38, 'Acre', 'Rio Branco', 'Sombral', 'Rua 33', 98);

-- --------------------------------------------------------

--
-- Table structure for table `instituicoes`
--

DROP TABLE IF EXISTS `instituicoes`;
CREATE TABLE IF NOT EXISTS `instituicoes` (
  `idinstituicao` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL,
  `telefone` varchar(45) NOT NULL,
  `endereco_idendereco` int NOT NULL,
  PRIMARY KEY (`idinstituicao`),
  KEY `fk_escola_endereco1_idx` (`endereco_idendereco`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `instituicoes`
--

INSERT INTO `instituicoes` (`idinstituicao`, `nome`, `email`, `senha`, `telefone`, `endereco_idendereco`) VALUES
(4, 'Escola Bruninho', 'escolab@email.com', 'escolab', '6666-6666', 30),
(5, 'Inst. João', 'instj@email.com', 'instj', '5555-5555', 31),
(6, 'Peter Pandeiros', 'pp@email.com', '123', '2222-2222', 34),
(7, 'Skool', 'skool@email.com', '123', '12365-7892', 37);

-- --------------------------------------------------------

--
-- Table structure for table `palestrantes`
--

DROP TABLE IF EXISTS `palestrantes`;
CREATE TABLE IF NOT EXISTS `palestrantes` (
  `idpalestrante` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL,
  `telefone` varchar(45) NOT NULL,
  `endereco_idendereco` int NOT NULL,
  PRIMARY KEY (`idpalestrante`),
  KEY `fk_palestrante_endereco1_idx` (`endereco_idendereco`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `palestrantes`
--

INSERT INTO `palestrantes` (`idpalestrante`, `nome`, `email`, `senha`, `telefone`, `endereco_idendereco`) VALUES
(3, 'Fefe Palestrinha', 'palestrinha@email.com', '123', '4444-4444', 32),
(4, 'Edu Falador', 'falador@email.com', '123', '3333-3333', 33),
(5, 'Felipe', 'f.palestras@email.com', '123', '32158-9875', 38);

-- --------------------------------------------------------

--
-- Table structure for table `palestras`
--

DROP TABLE IF EXISTS `palestras`;
CREATE TABLE IF NOT EXISTS `palestras` (
  `idpalestra` int NOT NULL AUTO_INCREMENT,
  `data` date NOT NULL,
  `horario` varchar(5) NOT NULL,
  `instituicoes_idinstituicao` int NOT NULL,
  `temas_idtema` int NOT NULL,
  PRIMARY KEY (`idpalestra`),
  KEY `instituicoes_idinstituicao` (`instituicoes_idinstituicao`),
  KEY `temas_idtema` (`temas_idtema`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `palestras`
--

INSERT INTO `palestras` (`idpalestra`, `data`, `horario`, `instituicoes_idinstituicao`, `temas_idtema`) VALUES
(6, '2021-06-20', '18:00', 6, 5),
(7, '2021-06-25', '17:30', 6, 8),
(8, '2021-06-16', '20:00', 7, 9);

-- --------------------------------------------------------

--
-- Table structure for table `temas`
--

DROP TABLE IF EXISTS `temas`;
CREATE TABLE IF NOT EXISTS `temas` (
  `idtema` int NOT NULL AUTO_INCREMENT,
  `titulo` varchar(45) NOT NULL,
  `palestrantes_idpalestrante` int NOT NULL,
  PRIMARY KEY (`idtema`),
  KEY `idpalestrante` (`palestrantes_idpalestrante`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `temas`
--

INSERT INTO `temas` (`idtema`, `titulo`, `palestrantes_idpalestrante`) VALUES
(5, 'Animais sao legais', 3),
(6, 'Animaizinhos felizes', 3),
(7, 'Não mate formigas', 4),
(8, 'Formigas tambem sentem', 4),
(9, 'Adote um animal', 5);

-- --------------------------------------------------------

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `idusuario` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL,
  `telefone` varchar(45) NOT NULL,
  `adm` tinyint(1) NOT NULL DEFAULT '0',
  `endereco_idendereco` int NOT NULL DEFAULT '1',
  PRIMARY KEY (`idusuario`),
  KEY `fk_usuario_endereco1_idx` (`endereco_idendereco`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `usuarios`
--

INSERT INTO `usuarios` (`idusuario`, `nome`, `email`, `senha`, `telefone`, `adm`, `endereco_idendereco`) VALUES
(29, 'admin', 'admin', 'admin', '9999-9999', 1, 27),
(30, 'David', 'david@email.com', '123', '7777-7777', 0, 28),
(31, 'Pedro', 'pedro@email.com', '321', '8888-8888', 0, 29),
(32, 'Bruno', 'bruno@email.com', '123', '1111-1111', 0, 35),
(33, 'João', 'joao@email.com', '123', '2222-2222', 0, 36);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `adocoes`
--
ALTER TABLE `adocoes`
  ADD CONSTRAINT `fk_adocao_animal1` FOREIGN KEY (`animal_idanimal`) REFERENCES `animais` (`idanimal`),
  ADD CONSTRAINT `fk_adocao_usuario1` FOREIGN KEY (`usuario_idusuario`) REFERENCES `usuarios` (`idusuario`);

--
-- Constraints for table `instituicoes`
--
ALTER TABLE `instituicoes`
  ADD CONSTRAINT `fk_escola_endereco1` FOREIGN KEY (`endereco_idendereco`) REFERENCES `enderecos` (`idendereco`);

--
-- Constraints for table `palestrantes`
--
ALTER TABLE `palestrantes`
  ADD CONSTRAINT `fk_palestrante_endereco1` FOREIGN KEY (`endereco_idendereco`) REFERENCES `enderecos` (`idendereco`);

--
-- Constraints for table `palestras`
--
ALTER TABLE `palestras`
  ADD CONSTRAINT `palestras_ibfk_1` FOREIGN KEY (`instituicoes_idinstituicao`) REFERENCES `instituicoes` (`idinstituicao`),
  ADD CONSTRAINT `palestras_ibfk_2` FOREIGN KEY (`temas_idtema`) REFERENCES `temas` (`idtema`);

--
-- Constraints for table `temas`
--
ALTER TABLE `temas`
  ADD CONSTRAINT `temas_ibfk_1` FOREIGN KEY (`palestrantes_idpalestrante`) REFERENCES `palestrantes` (`idpalestrante`);

--
-- Constraints for table `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `fk_usuario_endereco1` FOREIGN KEY (`endereco_idendereco`) REFERENCES `enderecos` (`idendereco`) ON DELETE CASCADE ON UPDATE RESTRICT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
