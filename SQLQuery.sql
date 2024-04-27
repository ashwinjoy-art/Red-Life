////run this query first
create database redlife;

////then run this queries by selecting all.
use redlife;

create table login(username varchar(50) not null,password varchar(50) not null,primary key(username));
insert into login values('Admin','Password');
select *from login;

create table donor(did int identity(1,1) not null,date varchar(50) not null,name varchar(50) not null,age int not null,bgroup varchar(10) not null,gender varchar(20) not null,email varchar(100) not null,mobno varchar(20) not null,address varchar(100) not null,district varchar(50) not null,state varchar(50) not null,country varchar(50) not null,primary key(did));
select *from donor;

create table bloodtest(btid int identity(1,1) not null,donorid int not null,donorname varchar(50) not null,bloodgroup varchar(10) not null,gender varchar(20) not null,date varchar(50) not null,
hiv varchar(20),vdrl varchar(20),hbsag varchar(20),bilirubintotal float,bilirubindirect float,alt int,hb float,tc int,neutrophil int,lymphocyte int,eosinophil int,platelets int,esr float,testresult varchar(30) not null,primary key(btid));
select * from bloodtest;

create table bloodstock(stockid int identity(1,1) not null,date varchar(50) not null,bloodgroup varchar(10) not null,quantity float,donorid int not null,donorname varchar(50) not null,bloodtestid int not null,primary key(stockid));
select * from bloodstock;

create table bloodprice(priceid int identity(1,1) not null, bloodgroup varchar(10) not null,price float, primary key(priceid));
insert into bloodprice(bloodgroup,price) values('A+',2);
insert into bloodprice(bloodgroup,price) values('A-',2);
insert into bloodprice(bloodgroup,price) values('B+',3);
insert into bloodprice(bloodgroup,price) values('B-',3.5);
insert into bloodprice(bloodgroup,price) values('O+',2);
insert into bloodprice(bloodgroup,price) values('O-',2);
insert into bloodprice(bloodgroup,price) values('AB+',2);
insert into bloodprice(bloodgroup,price) values('AB-',2);

select * from bloodprice;

create table purchase(billno  int identity(1,1) not null,date varchar(50), bloodgroup varchar(10) not null,quantity float not null,price float not null,recipientname varchar(50) not null,recipientaddress varchar(150) not null,recipientphone varchar(50) not null, primary key(billno));
select * from purchase;		
	
