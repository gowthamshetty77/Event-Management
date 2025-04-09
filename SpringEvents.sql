-- Event Management - Spring

CREATE DATABASE springevents;
use springevents;

CREATE TABLE `user_register_table` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `user_email` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `user_password` varchar(255) DEFAULT NULL,
  `user_phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `tasks` (
  `t_id` int NOT NULL AUTO_INCREMENT,
  `catering_and_hospitality` varchar(255) DEFAULT NULL,
  `entertainment_and_activities` varchar(255) DEFAULT NULL,
  `logistics_and_operations` varchar(255) DEFAULT NULL,
  `venue_management` varchar(255) DEFAULT NULL,
  `b_id` varchar(255) DEFAULT NULL,
  `e_address` varchar(255) DEFAULT NULL,
  `e_date` varchar(255) DEFAULT NULL,
  `e_name` varchar(255) DEFAULT NULL,
  `e_time` varchar(255) DEFAULT NULL,
  `status` bit(1) NOT NULL,
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `events_entity` (
  `event_id` int NOT NULL AUTO_INCREMENT,
  `event_amount` double NOT NULL,
  `event_category` varchar(255) DEFAULT NULL,
  `event_details` varchar(255) DEFAULT NULL,
  `event_img1` varchar(255) DEFAULT NULL,
  `event_img2` varchar(255) DEFAULT NULL,
  `event_img3` varchar(255) DEFAULT NULL,
  `event_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`event_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `bookings` (
  `id` int NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `attendees` bigint DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `event_name` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT 'pending',
  `time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `attendies` (
  `a_id` int NOT NULL AUTO_INCREMENT,
  `a_category` varchar(255) DEFAULT NULL,
  `a_email` varchar(255) DEFAULT NULL,
  `a_name` varchar(255) DEFAULT NULL,
  `a_password` varchar(255) DEFAULT NULL,
  `a_phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`a_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `attendie_task_status` (
  `id` int NOT NULL AUTO_INCREMENT,
  `status` bit(1) NOT NULL,
  `attendie_id` int DEFAULT NULL,
  `task_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKafbaem6s4rwt3v4pq2lrchgs` (`attendie_id`),
  KEY `FK8w1ihwux5ed9hdbm51nfkbuql` (`task_id`),
  CONSTRAINT `FK8w1ihwux5ed9hdbm51nfkbuql` FOREIGN KEY (`task_id`) REFERENCES `tasks` (`t_id`),
  CONSTRAINT `FKafbaem6s4rwt3v4pq2lrchgs` FOREIGN KEY (`attendie_id`) REFERENCES `attendies` (`a_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

