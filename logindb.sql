create database logindb;
use logindb;



create table user(
user_id int auto_increment unique,
username varchar(30),
password varchar(20),
email varchar (30),
conf_password varchar(20),
primary key(user_id)
);
select * from user;
drop table user;

insert into user (username,password,email,conf_password ) values 
("priya","123456","aryalpriya9@gmail.com","123456"),
("prapti","147","aryalpreeya9@gmail.com","147"),
("preeya","123","aryalprapti@gmail.com","123")
;