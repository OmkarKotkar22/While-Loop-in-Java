//7.Write a C program to find the sum of all even numbers between 1 to n.

import java.util.*;
public class sum_of_allevenno1_to_n
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no, total=0, i=1;
		no = sc.nextInt();

		while(i<=no)
		{
			if(i%2 == 0)
			{
				total = total + i;
			}
			i++;
		}
		System.out.println("Total: " + total);
	}
}



