import java.util.*;
class Palindrome
{
   static int palin(int num,int reverse)
	{
		if(num==0)
			return reverse;
		else
		{
			reverse=reverse*10+(num%10);
			return palin(num/10,reverse);
		}
		
	}
   public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		 int input=sc.nextInt();
		 int temp=palin(input,0);
		 
		 if(temp==input)
       System.out.println("palindrome");
          else
			  System.out.println("Not Palindrome");
    }
}