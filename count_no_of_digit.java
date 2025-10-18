//10.Write a java program to count the number of digits in a number.
import java.util.*;
public class count_no_of_digit
{  
	public static void main(String x[])
   	{ 
		Scanner sc  = new Scanner(System.in);
	   	System.out.println("Enter number");
	   	int no=sc.nextInt();
		int count=0;

            		while (no != 0) 
			{
                		no = no / 10;   
                		count++;
			}              

        	System.out.println("Total digits: " + count);
   	}
}
