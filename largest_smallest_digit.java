/*Q41. Write a Java program to find the largest and smallest digit of a given number.
 Explanation:
 Use a while loop to extract digits, compare each digit to track max and min.
*/


import java.util.*;
public class largest_smallest_digit
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();

		int max = 9;
		int min = 0;
		while(no > 0)
		{
			int rem = no % 10;
			if(min < rem)
			{
				min = rem;
				System.out.println("Min =" + min);
			}
			if(rem < max)
			{
				max = rem;
				System.out.println("Max =" + max);
			}
			
			no = no / 10;
		}
		
	}
}