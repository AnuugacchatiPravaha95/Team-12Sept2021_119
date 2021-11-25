use cdacmumbaisept2021;
select * from emp;
select * from emp1;
INSERT INTO EMP1 VALUES('ARUNTARUN'),
('TARUNARUN'),
('SNEHALPAYAL'),
('SIRUNKIRUN'),
('NUTANPURN'); 
SELECT LPAD(ENAME,17,'*') ,RPAD(ENAME,17,'*') FROM EMP1;
SELECT LPAD(RPAD(ENAME,17,'*'),28,'*') FROM EMP1;
SELECT * FROM EMP1;
/*SELECT LOWER(ENAME)FROM EMP1;
SELECT * FROM EMP; //FOR SIR'S q.1
SELECT SUBSTR(FNAME,1,2)FROM EMP WHERE LNAME='ARUN';*/
/*select .....display the ENAME'S centered justified padded with * 
SELECT LPAD(RPAD(ENAME,25,'*'),36,'*') FROM EMP1;*/
/*select .....display the ENAME'S char(20) column right justified
SELECT LPAD(ENAME,20,' ')FROM EMP1;*/
/*select .....display the ENAME'S with the vowels removed
SELECT * FROM EMP1 WHERE SOUNDEX(ENAME)=SOUNDEX('SIIIIRUUUNKIRUN');*/
