use dbmysql;
create table emp(empid int(10), empname varchar(10), jobname varchar(10), managerid int(10), salary int(10), commission int(10), depid int(10));
desc emp;
insert into emp values(68319, 'Kayling', 'President', 0, 6000, 0, 1001);
insert into emp values(66928, 'Blaze', 'Manager', 68319, 2750, 0, 3001);
insert into emp values(67832, 'Clare', 'Manager', 68319, 2550, 0, 1001);
insert into emp values(65646, 'Jonas', 'Manager', 68319, 2957, 0, 2001);
insert into emp values(67858, 'Scarlet', 'Analyst', 65646, 3100, 0, 2001);
insert into emp values(69062, 'Frank', 'Analyst', 65646, 3100, 0, 2001);
select * from emp;
alter table emp drop column commission;
alter table emp add commission int(10);
update emp set commission=500 where depid=1001 OR depid=3001;
delete from emp where jobname='Analyst';
delete from emp where jobname='Manager' and empname='Clare';
update emp set managerid=68310 where jobname='President';
truncate emp;
drop table emp;