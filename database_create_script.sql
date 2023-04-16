CREATE DATABASE  IF NOT EXISTS `sozluk_database`;
USE `sozluk_database`;

DROP TABLE IF EXISTS `entry`;
DROP TABLE IF EXISTS `topic`;
DROP TABLE IF EXISTS `user`;


CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `is_admin` bit NOT NULL,
  `is_moderator` bit NOT NULL,
  `password` varchar(68) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

CREATE TABLE `topic` (
	`id` int NOT NULL AUTO_INCREMENT,
	`name` varchar(68) NOT NULL,
	`labels` varchar(70) ,
	`date` datetime NOT NULL,
	`user_id` int NOT NULL, 
	FOREIGN KEY (`user_id`) REFERENCES `user`(`id`),
	PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

CREATE TABLE `entry` (
	`id` int NOT NULL AUTO_INCREMENT,
	`content` varchar(2000) NOT NULL,
	`created_date` datetime NOT NULL,
	`edited_date` datetime ,
	`is_archived` bit NOT NULL,
	`is_deleted` bit NOT NULL,
	`user_id` int NOT NULL,
	`topic_id` int NOT NULL,
	FOREIGN KEY (`user_id`) REFERENCES `user`(`id`),
	FOREIGN KEY (`topic_id`) REFERENCES `topic`(`id`),
	PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;