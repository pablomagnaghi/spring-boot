Mongo  
$ brew install mongodb  
$ sudo mkdir -p /data/db  
$ sudo chmod 777 /data/db  
$ sudo mongod  

Open new terminal  
$ mongo  
> show dbs  
admin              0.000GB  
local              0.000GB  
spring-boot-intro  0.000GB  
> use spring-boot-intro  
switched to db spring-boot-intro  
> show collections  
author  
post  
> db.author.find()  
{ "_id" : ObjectId("59aec95ad73e22e0d0a8eb2c"), "_class" : "com.pmagnaghi.domain.Author", "firstName" : "Dan", "lastName" : "Vega", "email" : "danvega@gmail.com", "posts" : [ DBRef("post", ObjectId("59aec95ad73e22e0d0a8eb2d")) ] }
> db.post.find()  
{ "_id" : ObjectId("59aec95ad73e22e0d0a8eb2d"), "_class" : "com.pmagnaghi.domain.Post", "title" : "Spring Data Rocks!", "body" : "Post Body", "teaser" : "Post Teaser", "slug" : "spring-data-rocks", "postedOn" : ISODate("2017-09-05T15:57:14.223Z"), "author" : DBRef("author", ObjectId("59aec95ad73e22e0d0a8eb2c")) }
