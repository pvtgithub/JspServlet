-- MySQL
CREATE DATABASE DBLogin;
go 
USE DBLogin;
go
drop table users
create table users (
 id  int(3) NOT NULL AUTO_INCREMENT,
 name varchar(50)  NULL,
 pass varchar(20)  NULL,
 email varchar(220)  NULL,
 country varchar(120) NULL,
 PRIMARY KEY (id)
);
-- SQL Server
CREATE DATABASE DBLogin;
go 
USE DBLogin;
go
drop table users
create table users (
 id  integer identity(1,1),
 name varchar(50)  NULL,
 pass varchar(20)  NULL,
 email varchar(220)  NULL,
 country varchar(120) NULL,
 PRIMARY KEY (id)
);