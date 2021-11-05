import java.util.*;
class MultiDimensionArray
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter row size of Array :");
   int row=sc.nextInt();
   
   System.out.println("Enter coloumn size of Array :");
   int col=sc.nextInt();
   
   int arr1[][]=new int[row][col];
   int arr2[][]=new int[row][col];
   int sum[][]=new int[row][col];
   int sub[][]=new int[row][col];
   int mul[][]=new int[row][col];
   int i,j;
   System.out.println("Enter 1st Array Elements ");
   for(i=0;i<row;i++)
   {
     for(j=0;j<col;j++)
      {
		  arr1[i][j]=sc.nextInt();
	   }
	  System.out.println();
   }
   
   System.out.println("Enter 2nd Array Elements ");
      for(i=0;i<row;i++)
     {
       for(j=0;j<col;j++)
        {
      		arr2[i][j]=sc.nextInt();
        }
		System.out.println();
     }
	 //Addition of Multidimensional Array
	System.out.println("Sum of Array Elements "); 
	 for(i=0;i<row;i++)
     {
       for(j=0;j<col;j++)
        {
      		sum[i][j]=arr1[i][j]+arr2[i][j];
			System.out.print(" "+sum[i][j]);
        }
		System.out.println();
     }
	 //Subtraction of Multidimensional Array
	System.out.println("Subtraction of Array Elements "); 
	 for(i=0;i<row;i++)
     {
       for(j=0;j<col;j++)
        {
      		sub[i][j]=arr1[i][j]-arr2[i][j];
			System.out.print(" "+sub[i][j]);
        }
		System.out.println();
     }
	 //Multiplication of Multidimensional Array
	System.out.println("Multiplication of Array Elements "); 
	 for(i=0;i<row;i++)
     {
       for(j=0;j<col;j++)
        {
      		mul[i][j]=arr1[i][j]*arr2[i][j];
			System.out.print(" "+mul[i][j]);
        }
		System.out.println();
     }
   }
}