CREATE TABLE IF NOT EXISTS product_category (
                                                id INT NOT NULL,
                                                name VARCHAR(45) DEFAULT NULL,
                                                PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS robot (
                                     id INT NOT NULL,
                                     name VARCHAR(45) DEFAULT NULL,
                                     PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS product (
                                       id INT NOT NULL AUTO_INCREMENT,
                                       name VARCHAR(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                       category_id INT DEFAULT NULL,
                                       robot_id INT DEFAULT NULL,
                                       color VARCHAR(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                       image_path VARCHAR(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                       rating INT DEFAULT NULL,
                                       no_of_reviews INT DEFAULT NULL,
                                       description VARCHAR(2048) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                       price INT DEFAULT NULL,
                                       PRIMARY KEY (id),
                                       KEY pr_index (id),
                                       KEY fk_category (category_id),
                                       KEY fk_robot (robot_id),
                                       CONSTRAINT fk_category FOREIGN KEY (category_id) REFERENCES product_category (id),
                                       CONSTRAINT fk_robot FOREIGN KEY (robot_id) REFERENCES robot (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS user (
                                    id INT NOT NULL AUTO_INCREMENT,
                                    date_of_birth VARCHAR(255) DEFAULT NULL,
                                    email VARCHAR(255) DEFAULT NULL,
                                    favorite_collection VARCHAR(255) DEFAULT NULL,
                                    gender VARCHAR(255) DEFAULT NULL,
                                    message VARCHAR(255) DEFAULT NULL,
                                    name VARCHAR(255) DEFAULT NULL,
                                    news_letter BIT(1) NOT NULL,
                                    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS user_seq (
                                        next_val BIGINT DEFAULT NULL
)
    ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE utf8mb4_0900_ai_ci;

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES
                          (1,'Dolores Apron',1,2,'White','/images/products/binaryville-apron-dolores-white.svg',5,130,'Everyone’s a chef in our eco-friendly apron made from 55% organic cotton and 45% recycled polyester.',22),
                          (2,'Dolores Artwork',8,2,'White','/images/products/binaryville-artwork-dolores-wood.svg',4,100,'It’s the perfect gift for that one in your life who loves Big Star Collectibles characters!',50);

/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

