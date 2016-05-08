 

CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `price` decimal(10,0) DEFAULT NULL,
  `quantity` int(45) DEFAULT NULL,
  `description` varchar(450) DEFAULT NULL,
  `photo` varchar(45) DEFAULT NULL,
  `active` tinyint(4) DEFAULT NULL,
  `createiondate` datetime  DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;



DELIMITER ;;
CREATE PROCEDURE `joinSp`()
begin 
select 
p.id as productId, p.name as productName ,  p.quantity as quantity, o.id as orderId ,o.name as orderName
 from product p join  orders o on p.id=o.id;
end ;;
