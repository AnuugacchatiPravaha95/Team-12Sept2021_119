import java.util.*;
/*
class SearchIndexInputFromUser
{
  public static void main(String args[])
  {
	 //int a[]={10,20,80,30,60,50,110,100,130,170};
      Scanner sc=new Scanner(System.in);
	   int size=10,i;
	   int a[]=new int[size];
	   
	  System.out.println("Enter Array Elements :");
       for(i=0;i<size;i++) {
		   a[i]=sc.nextInt();
	   }
	   System.out.println("Enter key element to search :");
	   int key=sc.nextInt();
	   
	   for(i=0;i<size;i++){
	      if(a[i]==key){
		     System.out.println(i);
	          System.out.println("Element x is present at index :"+i);
		         break;
				}
	   }   
  }
}*/
class SearchIndexInputFromUser
{
  public static void main(String args[])
  {
	 //int a[]={10,20,80,30,60,50,110,100,130,170};
      Scanner sc=new Scanner(System.in);
	   int size=10,i;
	   int a[]=new int[size];
	   
	  System.out.println("Enter Array Elements :");
       for(i=0;i<size;i++)
	   {
		   a[i]=sc.nextInt();
	   }
	   System.out.println("Enter key element to search :");
	   int key=sc.nextInt();
	   for(i=0;i<size;i++)
	   {
		   if(a[i]==key)
		   { 
	          System.out.println(i);
	          System.out.println("Element x is present at index :"+i);
			  break;
		   }
	   } 
         if(i==size) //for ex. we are searching key=110 its at index 6..so 6==10
             System.out.println("-1");
         else
			 System.out.println();
	
  }
}