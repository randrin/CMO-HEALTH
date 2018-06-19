--
-- Table structure for table `patients`
--

DROP TABLE IF EXISTS `patients`;
CREATE TABLE `patients` (
  `id_patient` int(11) NOT NULL AUTO_INCREMENT,
  `nom_patient` varchar(50) NOT NULL,
  `prenom_patient` varchar(50) DEFAULT NULL,
  `date_nais_patient` date NOT NULL,
  `age_patient` int(2) DEFAULT NULL,
  `sexe_patient` varchar(2) NOT NULL,
  `addresse_patient` varchar(100) NOT NULL,
  `codPost_patient` int(6) DEFAULT NULL,
  `domicile_patient` varchar(50) NOT NULL,
  `infoSuppl_patient` varchar(200) DEFAULT NULL,
  `email_patient` varchar(200) DEFAULT NULL,
  `numTel_patient` int(9) NOT NULL,
  `numFixe_patient` int(9) DEFAULT NULL,
  PRIMARY KEY (`id_patient`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;