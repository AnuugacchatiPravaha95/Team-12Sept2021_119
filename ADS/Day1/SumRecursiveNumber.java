/*class SumRecursiveNumber
{
  static int num(int n)
  {
    if(n==10)
	 return 10;
	 else
	 return n+num(n+1);
  }
  public static void main(String args[])
  {
     System.out.println(num(1));
  }
}
*/
import java.util.*;
class SumRecursiveNumber
{
  static int sum(int n)
  {
    if(n==10)
	 return 10;
	 else
	 return n+sum(n+1);
  }
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number :");
	   int nu=sc.nextInt();
	   
	   int result=sum(nu); //1	   
     System.out.println(result);
  }
}
