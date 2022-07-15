DROP TABLE IF EXISTS `family`;

CREATE TABLE `family` (
    `id` BIGINT AUTO_INCREMENT,
    `father` VARCHAR(255) NOT NULL,
    `mother` VARCHAR(255) NOT NULL,
    `child`  VARCHAR(255)UNIQUE NOT NULL,
    PRIMARY KEY(`id`)
    );