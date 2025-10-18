//Q36. Write a java program to find HCF (GCD) of two numbers.

import java.util.*;
public class hcf_of_two_no
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no1: ");
		int no1 = sc.nextInt();
		
		System.out.println("Enter the no2: ");
		int no2 = sc.nextInt();
		int min = 0;
		if(no1 < no2)
		{
			min = no1;
		}
		else
		{
			min = no2;
		}
		int i = 1;
		int hcf = 1;
		while(i <= min)
		{
			
			if((no1 % i == 0) && (no2 % i == 0))
			{
				hcf = i;
			}
		i++;
		}
		System.out.println(hcf);
	}
}