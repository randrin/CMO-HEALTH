USE `cmo-healthmanager`;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `administrateurs`;
CREATE TABLE `administrateurs` (
  `id_admin` int(11) NOT NULL AUTO_INCREMENT,
  `nom_admin` varchar(50) NOT NULL,
  `prenom_admin` varchar(50) NOT NULL,
  `pwd_admin` varchar(50) NOT NULL,
  `date_insert_admin` datetime NOT NULL,
  `date_lastUpdate_admin` datetime NOT NULL,
  `date_nais_admin` varchar(10) NOT NULL,
  `sexe_admin` varchar(1) NOT NULL,
  `role_admin` varchar(50) NOT NULL,
  `isActive_admin` boolean default 0,
  PRIMARY KEY (`id_admin`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;



