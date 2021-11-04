import java.util.*;
class Fibonanci
{
	static int fibo(int num)
	{
		if(num<=1)
		return num;
	else
		return fibo(num-1)+fibo(num-2);
	  
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size :");
	 int size=sc.nextInt();
	
	System.out.println("The Fibonanci series :");
	for(int i=0;i<size;i++)
	{System.out.print(fibo(i)+" ");}
}
}