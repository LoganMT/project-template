
create DATABASE test_hello_world;
USE test_hello_world;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for hello_world
-- ----------------------------
DROP TABLE IF EXISTS `hello_world`;
CREATE TABLE `hello_world`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hello_world
-- ----------------------------
INSERT INTO `hello_world` VALUES (1, 'hello');
INSERT INTO `hello_world` VALUES (2, 'world');
INSERT INTO `hello_world` VALUES (3, '!');

SET FOREIGN_KEY_CHECKS = 1;

