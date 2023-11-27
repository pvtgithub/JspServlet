/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Hung
 * Created: Aug 12, 2021
 */ 
 
Create database CRUDServlet; 
CREATE TABLE User905( ID int(11) NOT NULL AUTO_INCREMENT 
      ,NAME VARCHAR(50), password VARCHAR(20)
      , email VARCHAR(500),country VARCHAR(30), PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
			
 