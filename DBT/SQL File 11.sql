/* Practise day 11   */

select * from salespeople;

create view v2
as
select Sname from salespeople;

select * from cdacmumbaisept2021.v2;

update salespeople set sname='Alee' where sname='peel';
select * from cdacmumbaisept2021.v2;

grant select ,insert on v2 to PGdac3;
revoke select,insert on v2 from PGdac3;

insert into cdacmumbaisept2021.v2 values('Snehal');
 
use cdacmumbaisept2021;
SHOW TABLES;
SHOW FULL TABLES;

/*   Procedures */
create table tempp( /* We have created a separate table for storing the output of my program  */
first int,
second char(5));

/* here we have started doing coding or creating procedures */
delimiter &&
create procedure abc()
begin
insert into tempp values(1,'Hello');
end; &&
delimiter ;
call abc();
select * from tempp;
drop procedure abc; /*  After droping also my data still exits there  */

/* 2nd problem insert value into */
delimiter &&
create procedure xyz()
begin
 declare x int;
 set x=23;
 insert into tempp values(x,'Cdac');
end; &&
delimiter ;
call xyz() ;
select * from tempp;

/* 3rd problem gives declaration & values in a same line */
delimiter //
create procedure trial()
begin     /* the datatype limit we have given as char(5)  it woint take 8 */
   declare name char(8) default 'Sonalik';
   insert into tempp values(2,name);
end;//
delimiter ;
call trial();
select * from tempp;

/* 4th program declare it in one line */
delimiter %%
create procedure another()
begin
  declare a int default 12;
  insert into tempp values(a,'Sann');
end;%%
delimiter ;
call another;
select * from tempp;
/* 5th program salary =40%*/
delimiter &&
create procedure for5th()
begin
    declare name char default 'Avi';
    declare salary float default 3000;
    declare multiplicant float default 0.4;
    declare hr int;
     set hr=salary*multiplicant;
    insert into tempp values(salary,name);
    insert into tempp values(hr,'HRA');
end; &&
delimiter ;
call for5th(); /*error==> saying data is too long */
drop procedure for5th;




















