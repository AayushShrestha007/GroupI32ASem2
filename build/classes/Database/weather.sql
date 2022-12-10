use ars;
create table weathers(
location varchar(50),
temperature varchar(50),
forecast varchar(50));
insert into weathers (location,temperature,forecast) values ("Nepal","32 F","Rainy"),
("Qatar","45 F","Windy"),
("Qatar","25 F","Windy"),
("Qatar","45 F","Windy");

select * from weathers;


