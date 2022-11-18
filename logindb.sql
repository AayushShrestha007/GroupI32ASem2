create database logindb;
use logindb;

create table user(
username varchar(30),
password varchar(20)
);
select * from user;
drop table user;

insert into user (username,password) values 
("preeya","123456"),
("aryalpreeya9@gmail.com","3456")
;