create database SDA_LAB;
use SDA_LAB;
create table SDA_lab_06(
stu_id int  auto_increment primary key ,
stu_name varchar(50) not null,
stu_marks float not null,
test_date date
);

insert into SDA_lab_06(stu_name,stu_marks,test_date)
values
("Farooque Sajjad",10,"22/09/24"),
("Arbab Hussain",10,"22/09/24"),
("Muhammad Talha",10,"22/09/24"),
("Rohit",9.1,"22/09/24"),
("Ada",8.2,"22/09/24");


select * from SDA_lab_06;

