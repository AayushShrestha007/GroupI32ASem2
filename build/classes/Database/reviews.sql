create database ars;
use ars;

 
create table user(
user_id int auto_increment unique,
username varchar(30),
email varchar(30),
password varchar(20),
primary key(user_id)
);
select * from user;
drop table review;

 

drop table user;
create table review( review varchar(5000) );
select * from review;