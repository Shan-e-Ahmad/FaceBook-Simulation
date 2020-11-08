create database facebook

use facebook
create table [user](
id int not null primary key,
name varchar(100),
email varchar(100),
[password] varchar(100),
dateofbirth date,
gender varchar(100)

)
create table friendsname(
id int ,
    FriendID int,
	foreign key(id) references [user](id),
	foreign key(FriendID) references [user](id)
)
select * from[user]
select * from friendsname
insert into [user] values(1,'Shan e ahmad','shan e ahmad@gmail.com','123456789','1999-05-12','M')
insert into [user] values(2,' ahmad',' ahmad@gmail.com','23456789','1999-08-25','M')
insert into [user] values(3,'mozaina','mozaina@gmail.com','456789','2000-06-2','F')
insert into friendsname values(1,2)
insert into friendsname values(1,3)
insert into friendsname values(2,3)
drop table dbo.post
create table post(
postid int identity(1,1)not null primary key ,
userid int  foreign key references [user](id),
text varchar(5000)
)
create procedure createpost
@id int ,
@text varchar(5000),
@output int output
as  
begin
if exists(select * from [user] 
where [user].id=@id)
begin
insert into post(userid,text)values(@id,@text)
set @output=1
end
else
set @output =-1
return
end
declare @output1 int 
exec createpost 1,'my name is shaaaaaaaaan ',@output1 out
select @output1
select * from post
drop procedure createpost