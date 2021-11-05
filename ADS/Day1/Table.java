/* Recursive program to print multiplication table of number*/
import java.util.*;
class Table
{
  static void table(int num,int multiplier)
  {
	  System.out.println(num+"*"+multiplier+"="+(num*multiplier));
	  if(multiplier<10)
		   table(num,multiplier+1);
  }
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 int input=sc.nextInt();
	 
	  table(input,1);
	 
 }
}


