# springBoot  
MySql  
$ brew install mysql  
$ mysql.server start  
mysql> create database spring_boot_intro;  
Query OK, 1 row affected (0.00 sec)  

mysql> create user 'springuser'@'localhost' identified by 'password';  
Query OK, 0 rows affected (0.01 sec)  

mysql> grant all on spring_boot_intro.* to 'springuser'@'localhost';  
Query OK, 0 rows affected (0.00 sec)  

mysql> use spring_boot_intro;  

mysql> show tables;  
+-----------------------------+  
| Tables_in_spring_boot_intro |  
+-----------------------------+  
| roles                       |  
| users                       |  
| users_roles                 |  
+-----------------------------+  
3 rows in set (0.00 sec)  
  
mysql> insert into users(email,full_name,password) values ('pmagnaghi@solstice.com','pablo magnaghi','123456');  
mysql> insert into roles(role) values('ROLE_ADMIN');  
mysql> insert into users_roles(user_id, role_id) values(1,1);  

application.properties  
# Thymeleaf  
spring.thymeleaf.cache=false  

# mysql connection details  
spring.datasource.url=jdbc:mysql://localhost:3306/spring_boot_intro  
spring.datasource.username=springuser  
spring.datasource.password=password  
spring.datasource.driver-class-name=com.mysql.jdbc.Driver  

# create-drop | update | validate | none  
spring.jpa.hibernate.ddl-auto=update  
