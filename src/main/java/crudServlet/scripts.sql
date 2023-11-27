 
-- SQL Server
CREATE DATABASE DBLogin;
go 
USE DBLogin;
go
drop table user905
create table user905 (
 id  integer identity(1,1),
 name varchar(50)  NULL,
 password varchar(20)  NULL,
 email varchar(220)  NULL,
 country varchar(120) NULL,
 PRIMARY KEY (id)
);