/* craeted the table to store output of MySQL */
create table Exerise1
( 
  ValueInteger int,
  ValueName char(17)
);

/*
Write a program that computes the perimeter and the area of a rectangle. 
Define your own values for the length and width. (Assuming that L and W 
are the length and width of the rectangle, Perimeter = 2*(L+W) and Area = L*W.
 */
 delimiter &&
 create procedure Rectangle()
 begin
      declare length float default 21.22;
      declare width float default 12.11;
      declare perimeter float;
      declare area float;
      set perimeter=2*(length + width);
	 
     /* declare area float; int between declaration is not allowed ,first you can declare everything & 
     after that you can set it */ 
      
      set area= length* width;
      insert into Exerise1 values(perimeter,'Perimeter'),
      (area,'Area');
 end;&&
 delimiter ;
 call Rectangle;
 select * from Exerise1;
 
 /* Write a program that declares an integer variable called 
 num, assigns a value to it, and computes and inserts into 
 the tempp table the value of the variable itself, its square, and its cube.
 */
 delimiter &&
 create procedure ThreeinOne()
 begin
     declare num int default 12;
     declare square int;
     declare cubee int;
     set square= num*num;
     set cubee=num*num*num;
     insert into Exerise1 values(num,'Num'),
     (square,'Square'),
     (cubee,'Cube');
 end;&&
 delimiter ;
 call ThreeinOne;
 select * from Exerise1;
 
 /* Convert a temperature in Fahrenheit (F) to its equivalent in Celsius (C) 
 and vice versa. The required formulae are:- C= (F-32)*5/9
F= 9/5*C + 32 */
 delimiter &&
 create procedure Temperature()
 begin
    declare temp float default 35.2; /* declarinf value line should be first */
   declare F float;
   declare C float;
   set F=9/5* 35.2 +32;
   set C=(F-32)* 5/9;
   insert into Exerise1 values(F,'Fahrenheit'),
   (C,'Celsius');
 end;&&
 delimiter ;
 call Temperature();
 Select * from Exerise1;
 
 /* Convert a number of inches into yards, feet, 
 and inches. For example, 124 inches equals 
 3 yards, 1 foot, and 4 inches.*/
 delimiter &&
 create procedure inches()
 begin
    declare number int default 124;
    declare yards int;
    declare foot int;
    declare inches int;
    set yards=number/36;
    set foot =number/12;
 end;&&
 delimiter ;
 
 /* Write a program that enables a user to input an integer. 
 The program should then state whether the integer is evenly divisible by 5.
 */
 delimiter //
 create procedure input(number int)
 begin
    if MOD(NUMBER,5)=0 THEN
       insert into Exerise1 values(number,'Div');
	else
       insert into Exerise1 values(number,'Not');
	end if;
 end;//
 delimiter ;
 call input(5);
 call input(6);
 select * from Exerise1;
 
 /* Your block should read in two real numbers and tell whether 
 the product of the two numbers is equal to or greater than 100. */
 delimiter //
 create procedure num_Checker(num1 int,num2 int)
 begin
   if (num1* num2)> 100 then
   insert into Exerise1 values(100,'Grt');
   elseif (num1*num2)=100 then
    insert into Exerise1 values(100,'Eql');
    else 
    insert into Exerise1 values(100,'Less'); 
    end if;
 end;//
 delimiter ;
 call num_Checker(10,10); /* o/p- 100 Eql */
 call num_Checker(5,3);
 select * from Exerise1;
 
           
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 