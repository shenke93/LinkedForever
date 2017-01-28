### Review
We have made a baseline database schema:
![Database Schema](https://raw.githubusercontent.com/shenke93/LinkedForever/Ke/diagrams/dbschema.png)

We have made some web pages.
We use hibernate and have written some persistent objects and some of their functions.

### Explanation of DB schema
Table friendship: *StuId1* and *StuId2* are ID of two friends.

Table photo: *Content* is the phote file name(We won't store photos in the Mysql). Like is number of likes.

Table comment: A user can leave comments to a phote or a post.

Table stuLog: A user use email address or cell phone number to login. We separate this table to deal with login tasks.

### Diagram of DAO
![Diagram_DAO](https://raw.githubusercontent.com/shenke93/LinkedForever/Ke/diagrams/linkedforever_DAO_Diagram.png)

#### Following tasks
    Further requirements analysis. We need a list of functions to realise. 
    Using pattern DAO (Data Access Object) 
    Using Spring Framework (with/without?) others frameworks(Struts, Hibernate)
    Determine environment of development (IDE, framework, Database, Building Tools etc) 
