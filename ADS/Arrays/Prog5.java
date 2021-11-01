/*5.Print the third-largest number in an array without sorting it 
Input: [ 24,54,31,16,82,45,67]
Output: 54 (82 and 67 are the largest and second-largest)
*/
import java.util.*;
class Prog5
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	int i,large=0;
	int a[]=new int[7];
	
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	for(i=0;i<a.length-1;i++)
	{
		if(large<a[i])
			large=a[i];
	}System.out.println(large);
  }
}