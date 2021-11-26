USE W3Schools;
use  cdacmumbaisept2021;
desc customers;
CREATE TABLE Numberfunction(name varchar(25),salary float,hiredate DATE);
INSERT INTO numberfunction (name,salary,hiredate)VALUES('SUMIT',1256.34,'1990-07-12');
INSERT INTO numberfunction VALUES('KAVITA',345.67,'1994-03-09');
INSERT INTO numberfunction VALUES('BALA',6754.67,'1989-05-20');
INSERT INTO numberfunction VALUES('ANITA',5672.50,'1988-02-19');
INSERT INTO numberfunction VALUES('PRALWAL',853.019,'1950-09-15');
SELECT * FROM numberfunction;
/* DAY 5 PRACTISE */
SELECT ROUND(SALARY)FROM numberfunction;
SELECT ROUND(salary,1)FROM numberfunction;
SELECT ROUND(salary,-1)FROM numberfunction;
SELECT ROUND(salary,3) FROM numberfunction;/* if i dont have any value at 3rd position after decimal point
then it will only print upto 2 & not padded it with zero*/
SELECT ROUND(salary,-3)FROM numberfunction;
SELECT TRUNCATE(salary,2)FROM numberfunction;
select * from numberfunction;
SELECT TRUNCATE(salary,-5)FROM numberfunction;
SELECT CEIL(salary)FROM numberfunction;
select floor(salary) from numberfunction;
SELECT SIGN(salary)FROM numberfunction;/*it gives u sign of all column as in
my all values in the column are positive*/
select sign(-345.67)from numberfunction;/* sign chya function madhe je value pass krnr taycha sing gehet te*/
SELECT SIGN(null)FROM numberfunction;
select sign(0)from numberfunction;
select sign(-23.5)from dual;
SELECT MOD(8.3,3)FROM DUAL;
SELECT POWER(34,2)FROM DUAL;
SELECT POWER(1728,1/3)FROM DUAL;
SELECT ABS(-234342)FROM DUAL;
SELECT ABS(0)FROM DUAL;
select sysdate()from numberfunction;
select sysdate()from dual;
select sysdate(),now(),sleep(10)from dual;
select adddate(sysdate(),1)from dual;
select adddate(sysdate(),3)from dual;
select adddate(sysdate(),7)from dual;
select datediff(sysdate(),hiredate)from numberfunction;
select date_add(hiredate, interval 2 month)from numberfunction;
select date_add(hiredate,interval 1 year)from numberfunction;
select last_day(hiredate)from numberfunction;
SELECT DAYNAME(SYSDATE())FROM DUAL;
/* QUESTIONS GIVEN BY SIR*/
/*select * from numberfunction;
select
case
when name='sumit'then 'one thousand two hundared fifty six'
end "InWords"
from numberfunction;
select truncate(salary,0)from numberfunction;
select length(truncate(salary,0))from numberfunction;
select
case
when length   then 'thousand'*/

/* 1990-07-12 - 25/11/201= 11459 days  1yr 2 month something day*/
select datediff(sysdate(),hiredate)from numberfunction;
select date_add(hiredate,interval 1 year)from numberfunction; 

SELECT COUNT(name)FROM numberfunction;
select addtime('2021-11-25 12:00:20',1)from numberfunction;
ALTER TABLE numberfunction ADD COLUMN COMMISION int AFTER hiredate;
select * from numberfunction;
insert into numberfunction (commision)values(500);
insert into numberfunction (commision)values(null);
insert into numberfunction (commision)values(300);
insert into numberfunction (commision)values(700);
select * from numberfunction;
Alter table numberfunction drop column Commision;
select * from numberfunction;
ALTER TABLE numberfunction ADD COLUMN COMMISION int AFTER hiredate;
select * from numberfunction;
UPDATE numberfunction set commision=500 where name='sumit';
select * from numberfunction;
UPDATE numberfunction set commision=700 where name='bala';
UPDATE numberfunction set commision=200 where name='pralwal';
select * from numberfunction;
select * from numberfunction where commision=null;/* wont work */
select * from numberfunction where commision is null;
select * from numberfunction where commision is not null;
/* any opration done with null returns null */
update numberfunction set salary=null where name='pralwal';
select salary+commision from numberfunction;
select ifnull(salary,0)+ifnull(commision,0) ,salary,commision from numberfunction; 
select * from numberfunction;
update numberfunction set name=null where hiredate='1989-05-20';
select * from numberfunction;
select ifnull(name,'SUNDAMA') name,salary from numberfunction;
select * from numberfunction;
select min(ifnull(salary,0))name,salary from numberfunction;
select avg(salary)from numberfunction;







































































