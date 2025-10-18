//1.Write a java program to print all natural numbers from 1 to n. - using while loop

import java.util.*;
public class naturalNo1ToN
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		int total;
		int i = 0;
		while(i<no)
		{
			total = i + 1;
			System.out.println("Total= \t" + total);
			i++;
		}
	}
}



