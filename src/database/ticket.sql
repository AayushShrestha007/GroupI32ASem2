use ars;

create table ticket(
ticket_number int auto_increment,
primary key(ticket_number),
seat_type varchar(50),
user_id int,
foreign key(user_id) references user(user_id),
flight_number int,
foreign key(flight_number) references flights(flight_number));

