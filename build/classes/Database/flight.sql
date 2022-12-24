use ars;

create table flights(
flight_number int auto_increment,
primary key(flight_number),
departure varchar(50),
destination varchar(50),
duration varchar(50),
cabin_capacity varchar(50),
checkin_capacity varchar(50),
refundable varchar(50),
airline_name varchar(50),
departure_time varchar(20),
arrival_time varchar(20),
departure_date date,
economy_price int,
business_price int,
username varchar(30) unique,
foreign key(username) references user(username),
flight_type varchar(30));
drop table flights;
select * from flights;
insert into flights (departure,destination,duration,cabin_capacity,checkin_capacity,refundable,airline_name,departure_time,arrival_time,departure_date,
economy_price,business_price,flight_type) values ("Qatar","Nepal","3 Hr","5 kg","15 kg","Yes","RA","9 AM","12 AM","2023-11-27",9000,12000,"Normal"),
("Nepal","Qatar","3 Hr","5 kg","15 kg","No","Emirates","7 PM","10 PM","2023-12-01",9000,10000,"Normal"),
("Qatar","Nepal","3 Hr","5 kg","15 kg","Yes","Buddha","9 AM","12 AM","2023-11-27",9000,15000,"Normal"),
("Qatar","Nepal","3 Hr","5 kg","15 kg","Yes","Buddha","9 AM","12 AM","2023-11-27",9000,13000,"Normal"),
("Nepal","Qatar","3 Hr","5 kg","15 kg","No","Emirates","7 PM","10 PM","2023-12-01",9000,20000,"Normal"),
("Nepal","Qatar","3 Hr","5 kg","15 kg","No","Emirates","7 PM","10 PM","2023-12-01",9000,17000,"Normal")




;


select * from flights;



