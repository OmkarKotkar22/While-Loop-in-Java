//Q39. Write a Java program to check whether a given number is a Harshad number (i.e., divisible by the sum of its digits) for numbers from 1 to n.
//Explanation: Use a loop to iterate through numbers, then another loop to find sum of digits, then check divisibility.

import java.util.*;
public class harshadno1_to_n
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		
		int i = 1;
		while(i <= no)
		{
			int sum = 0;
			int j = i;
			int temp = i;
			while(j!=0)
			{
			
				int rem = j % 10;		//21 % 10 = 2	0
				sum = sum + rem;		//0 + 1 = 1	1 + 2 = 3  
				j = j / 10;			//21 / 10 = 1	2
			}
			//System.out.println(sum);
			if(temp % sum == 0)
			{
				System.out.println(i);
			}
		
		i++;
		}
	}
}