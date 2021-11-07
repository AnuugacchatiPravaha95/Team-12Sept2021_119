import java.util.*;
/*
class OneDArray
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int size=5,i;
  int arr[]=new int[size];
  System.out.println("Enter the Array Element :");
   for(i=0;i<size;i++)
   {
     arr[i]=sc.nextInt();
   }
    
	//Searching element
	System.out.println("Enter the key to search :");
	int key=sc.nextInt();
	
	for(i=0;i<size;i++)
	{
		if(arr[i]==key)
			System.out.println("Found at index :"+i);
	}
	
	//deleting element
	System.out.println("Enter the key to Delete :");
	int dkey=sc.nextInt();
	
	for(i=0;i<size;i++)
	{
		if(arr[i]==dkey)
			break;
	}
	
	for(int k=i;k<size-1;k++)
	{
		arr[k]=arr[k+1];
	} 
	System.out.println("After Deleting :");
	for(i=0;i<size-1;i++)
	{
		System.out.println(arr[i]);
	}
 }
}
*/
/*
class OneDArray
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int size=5,i;
  int arr[]=new int[size];
  System.out.println("Enter the Array Element :");
   for(i=0;i<size;i++)
   {
     arr[i]=sc.nextInt();
   }
  
  //Sum of Elements in Array
	int sum=0;
	for(i=0;i<size;i++)
	{
		sum=sum+arr[i];
	}
	System.out.println("Sum Of Ements in Array is :"+sum);
	
	//Display Elemts in reverser Order
	System.out.println("Displaying Array Elements in reverse Order:");
	for(i=size-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}  
 }
}*/
class OneDArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array :");
		int size=sc.nextInt();
		int i;
		int oneD[]=new int[size]; //6 {1,2,3}
		int oneD1[]=new int[size];//6 {4,5,6}
		int merge[]=new int[oneD.length+oneD1.length];
		System.out.println("Enter 1st Array Elements :");
		for(i=0;i<size;i++)
		{
			oneD[i]=sc.nextInt();
		}
		System.out.println("Enter 2nd Array Elements :");
		for(i=0;i<size;i++)
		{
			oneD1[i]=sc.nextInt();
		}
		System.out.println("Merge Two Ararys :");
		int count=0;
		for(i=0;i<oneD.length;i++)
	    {
			merge[i]=oneD[i];
			count++;
		}
		for(i=0;i<oneD1.length;i++)
	    {
			merge[count]=oneD1[i];
			count++;
		}
		for(i=0;i<merge.length;i++)
	    {
			System.out.println(merge[i]);
		}
	}	
}
/*
class OneDArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int size=6,i;
		int oneD[]=new int[size];
		int oneD1[]=new int[size];
	
		System.out.println("Enter 1st Array Elements :");
		for(i=0;i<size;i++)
		{
			oneD[i]=sc.nextInt();
		}
	
		System.out.println("Copying 2nd Array to 1st Array Elements :");
		for(i=0;i<size;i++)
		{
			oneD1[i]=oneD[i];
		}
		for(i=0;i<size;i++)
		{
			System.out.println(oneD1[i]);
		}
		
	}
}*/