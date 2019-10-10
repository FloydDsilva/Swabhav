create table college_dept(did int,dname varchar(20),cid int,primary key (did),foreign key (cid) references college(cid));
insert into college_dept values(10,"Computer",1); 
insert into college_dept values(11,"EXTC",1); 
insert into college_dept values(20,"Computer",2);
insert into college_dept values(21,"IT",2);