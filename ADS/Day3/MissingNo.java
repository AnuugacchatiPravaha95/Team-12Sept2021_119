import java.util.*;
class MissingNo
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of Array:");
	int size=sc.nextInt();
    int barr[]=new int[size];
     int i,j,temp=0;
	 System.out.println("Enter the Array Elements :");
    for(i=0;i<=barr.length-2;i++)
	{
		barr[i]=sc.nextInt();
	}		
   int sumOfallElements=(size*(size+1))/2;
   System.out.println("sum of all ele:"+sumOfallElements);
   int sumofArray=0;
   for(i=0;i<=barr.length-2;i++)
   {
	   sumofArray=sumofArray+barr[i];
   }
   System.out.println("Sum of Array :"+sumofArray);
   int missingNo=sumOfallElements-sumofArray;
   System.out.println("Missiong no is :"+missingNo);
}
}