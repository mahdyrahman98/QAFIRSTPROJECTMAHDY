DROP TABLE IF EXISTS `customers`;

CREATE TABLE IF NOT EXISTS `customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS item (
item_id INT NOT NULL AUTO_INCREMENT,
item_name CHAR(50) NOT NULL,
price DECIMAL (7, 2) NOT NULL,
PRIMARY KEY (item_id)
);


CREATE TABLE IF NOT EXISTS orders (
order_id INT NOT NULL AUTO_INCREMENT,
customer_id INT NOT NULL,
order_value DECIMAL (7, 2) NOT NULL,
order_date DATE NOT NULL,
PRIMARY KEY (order_id),
FOREIGN KEY (customer_id) REFERENCES customers(id)
);

CREATE TABLE IF NOT EXISTS orderitems (
order_item_id INT NOT NULL,
order_id INT NOT NULL,
item_id INT NOT NULL,
item_quantity INT NOT NULL,
PRIMARY KEY (order_item_id),
FOREIGN KEY (order_id) REFERENCES orders(order_id),
FOREIGN KEY (item_id) REFERENCES item(item_id)
);

