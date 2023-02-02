create database if not exists react_sprint3;
use react_sprint3;

create table if not exists user(
	username varchar(50) primary key,
    password varchar(100),
    is_delete bit default 0
);

create table if not exists product_type(
	id int primary key auto_increment,
    name varchar(50),
    is_delete bit default 0
);

create table if not exists product_producer(
	id int primary key auto_increment,
    name varchar(50),
    is_delete bit default 0
);

create table if not exists product(
	id int primary key auto_increment,
    name varchar(50),
    price int,
    discount int,
    image varchar(255),
    price_for_sale_off int,
	is_delete bit default 0,
    product_type_id int,
    product_producer_id int,
    foreign key(product_type_id) references product_type(id),
    foreign key(product_producer_id) references product_producer(id)
);
create table if not exists product_bill_type(
	id int primary key auto_increment,
    name varchar(50),
    is_delete bit default 0
);
create table if not exists product_bill(
	id int primary key auto_increment,
	create_date int,
    quantity int,
    product_bill_type_id int,
    foreign key(product_bill_type_id) references product_bill_type(id)
);
create table if not exists order_detail(
	id int primary key auto_increment,
	product_id int,
    product_bill_id int,
	foreign key (product_id) references product(id),
    foreign key (product_bill_id) references product_bill(id)
);
create table if not exists buy(
	id int primary key auto_increment,
	product_id int,
    username varchar(255),
	foreign key (product_id) references product(id),
    foreign key (username) references user(username)
);
