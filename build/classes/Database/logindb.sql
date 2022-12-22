create database logindb;
use logindb;

create table user(
user_id int auto_increment unique,
username varchar(30),
email varchar(30),
password varchar(20),
primary key(user_id)
);
select * from user;
drop table user;

insert into user (username,password) values 
("preeya","aryalprapti@gmail.com","123456")
;