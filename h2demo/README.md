# springBoot
Scripts  
CREATE TABLE AUTHOR(  
    ID INT PRIMARY KEY,  
    FIRST_NAME VARCHAR(255),  
    LAST_NAME VARCHAR(255)  
);  

CREATE TABLE POST (  
    ID INT PRIMARY KEY,  
    BODY VARCHAR(255),  
    POSTED_ON DATETIME,  
    TITLE VARCHAR(255),  
    AUTHOR_ID INT,AUTHOR_ID  
    FOREIGN KEY (AUTHOR_ID) REFERENCES AUTHOR(ID)  
);  

INSERT INTO AUTHOR(id, first_name, last_name) VALUES(1, 'Dan', 'Vega');  
INSERT INTO POST(id, title, body, author_id, posted_on) VALUES(1, 'My First Blog', 'Post body', 1, CURRENT_DATE());  

SELECT * FROM AUTHOR;  
SELECT * FROM POST;  
  
