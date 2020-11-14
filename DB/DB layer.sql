drop database Facebook
create database Facebook
use Facebook

create table [user](
userid int not null primary key,
name varchar(100),
email varchar(100),
[password] varchar(100),
dateofbirth date,
gender nvarchar(100),
)

create table friends(
    userid int ,
    FriendID int,
	foreign key(userid) references [user](userid),
	foreign key(FriendID) references [user](userid),
	CONSTRAINT pk_friends PRIMARY KEY (userid,FriendID)
)

Create Table Post
(
postid int NOT NULL PRIMARY KEY,
userid int FOREIGN KEY REFERENCES [user](userid),
text nvarchar(1000)
)

create Table Comment
(
Commentid int IDENTITY(1,1) NOT NULL PRIMARY KEY,
userid int FOREIGN KEY REFERENCES [user](userid),
postid int FOREIGN KEY REFERENCES post(postid),
text nvarchar(500)
)

Create Table Likepost
(
userid int FOREIGN KEY REFERENCES [user](userid),
postid int FOREIGN KEY REFERENCES post(postid),
CONSTRAINT pk_Likedpost PRIMARY KEY (userid,postid)

)

create Table Share
(
shareid int IDENTITY(1,1) NOT NULL PRIMARY KEY,
userid int FOREIGN KEY REFERENCES [user](userid),
postid int FOREIGN KEY REFERENCES post(postid)
)


create table Video(
Videoid int IDENTITY(1,1) NOT NULL PRIMARY KEY,
trailer_link varchar(200),
)

create Table Message(
messageid int IDENTITY(1,1) not null PRIMARY KEY,
senderid int FOREIGN KEY REFERENCES [user](userid),
recvrid int FOREIGN KEY REFERENCES [user](userid),
message nvarchar(1000)
)

Create Table Page
(
Pageid int NOT NULL PRIMARY KEY,
adminid int FOREIGN KEY REFERENCES [user](userid),
name varchar(100),
description nvarchar(100)
)

Create Table FGroup
(
Groupid int NOT NULL PRIMARY KEY,
adminid int FOREIGN KEY REFERENCES [user](userid),
name varchar(100),
description nvarchar(100)
)



go

create Procedure Usersignup 
@userid int,
@name varchar(100),
@email varchar(100),
@password varchar(100),
@dateofbirth date,
@gender char,
@output int OUTPUT
As
Begin

if exists (select * From [user] where [user].userid=@userid)
Begin
set @output= -2

return
End
else if exists (select * From [user] where [user].email=@email)
Begin
set @output = 0
return
End
else
Insert into [user] values (@userid,@name, @email, @password,@dateofbirth,@gender )
set @output= 1
End

go

declare  @out int
exec Usersignup 1, 'shan', 'doublecheck1@gmail.com', 'pass', '2000-01-17', 'M', @out OUT
Select @out
go


-- UserLogin
  go
create Procedure UserLogin  
@email varchar(100), 
@password varchar(100), 
@output int OUTPUT
 As
 Begin

  if  not exists (select * From [user] where [user].email=@email AND [user].[password] =@password)
  Begin
  set @output = 0
  return
  End
  set @output = 1
 End
 go

 go
 declare  @out int
 exec UserLogin 'doublecheck1@gmail.com', 'pass', @out  out
 Select @out
 go


 

-- Video
  go
  drop procedure Videos
create Procedure Videos  

@trailer_link varchar(200), 
@output int OUTPUT
 As
 Begin
  
 
  
 Insert into Video values (@trailer_link)
 set @output= 1
End
 go

 go
 declare  @out int
 exec Videos'https://www.youtube.com/embed/-Denciie5oA', @out  output
 Select @out
 go



 create Procedure createPage 
@Pageid int,
@adminid int,
@name varchar(100),
@description nvarchar(100),
@output int OUTPUT
As
Begin

if exists (select * From Page where Page.Pageid=@Pageid)
Begin
set @output= -2
return
End

else if exists (select * From Page where Page.name=@name)
Begin
set @output = 0
return
End
else
Insert into Page values (@Pageid,@adminid,@name, @description)
set @output= 1
End

go

declare  @out int
exec createPage 1,1, 'page1', 'first page ever', @out OUT
Select @out
go


create Procedure viewGroup
@groupid int
As
Begin
select *
from FGroup 
where FGroup.Groupid=@groupid
End
go

exec viewGroup 1
go



create Procedure createpost 
@postid int ,
@userid int,
@text nvarchar(1000),
@output int OUTPUT
As
Begin

if exists (select * From Post where Post.postid=@postid)
Begin
set @output= -2
return
End
else
Insert into Post values (@postid, @userid,@text )
set @output= 1
End

go

declare  @out int
exec createpost 1,1, 'Post1', @out OUT
Select @out
go



create Procedure SendMessage
@senderid int,
@recvrid int,
@message nvarchar(1000),
@output int OUTPUT
As
Begin

if exists (select * From [user] where [user].userid=@senderid)
Begin
if exists (select * From [user] where [user].userid=@recvrid )
Begin
if exists (select * From [user] where @senderid!=@recvrid )
Begin
Insert into Message values (@senderid, @recvrid, @message)
set @output= 1 --Message added successfully
end
else
set @output= -4 --User cannot send a message to itself
end
else 
set @output= -3 --reciever does not exists
return
End
else
set @output= -2 --sender does not exists
return
End

go