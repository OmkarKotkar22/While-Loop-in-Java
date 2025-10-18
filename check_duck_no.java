/*Q23. Write a java program to Check Number Is Duck Number or Not.
Example : A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers.
Please note that a number with only leading 0s is not considered a Duck Number.
For example, numbers like 035 or 0012 are not considered as Duck Numbers.*/

import java.util.*;
public class check_duck_no
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();
		int rem = 0;
		boolean flag = true;
		while(no != 0)
		{
			flag = false;
			rem = no % 10;
			no = no / 10;
		}
		if(flag == false)
		{
			System.out.println("Number is Duck no.");
		}
		else
		{
			System.out.println("Number is not Duck no.");
		}
	}
}