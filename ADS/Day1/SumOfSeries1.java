/* Recursive Program to find Sum of Series 1-1/2+1/3-1/4*/

import java.util.*;
class SumOfSeries1
{
  static double sum(int i,int ni,double sum1)
  {
      if(i>ni)
	  return sum1;
	  else
	  {
	    if(i%2==0)
		   sum1=sum1-(double)1/i;
		   else
		    sum1=sum1+(double)1/i;
		 return sum(i+1,ni,sum1);
	  }
  }
 public static void main(String...args)
 {
   Scanner sc=new Scanner(System.in);
   
   int inputnum=sc.nextInt();
   
   double res=sum(1,inputnum,0.0);
   System.out.println(res);
 }
} 