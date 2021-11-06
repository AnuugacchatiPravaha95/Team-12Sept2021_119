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
    for(i=0;i<barr.length;i++)
	{
		barr[i]=sc.nextInt();
	}		
     //Arrays.sort(barr);
  for(i=0;i<barr.length;i++)
  {
	  for(j=i+1;j<barr.length;j++)
	  {
		  if(barr[i]>barr[j])
		  {
			  temp=barr[i];
			  barr[i]=barr[j];
			  barr[j]=temp;
		  }
	  }
  }
   int sumOfallElements=size*(size+1)/2;
   int sumofArray=0;
   for(i=0;i<barr.length-1;i++)
   {
	   sumofArray=sumofArray+barr[i];
   }
   int missingNo=sumOfallElements-sumofArray;
   System.out.println("Missiong no is :"+missingNo);
}
}