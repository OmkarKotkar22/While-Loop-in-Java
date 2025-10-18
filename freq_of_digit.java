//Q34. Write a java program to find the frequency of each digit in a given integer.

import java.util.*;
public class freq_of_digit
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		int j = no;
	
		int i = 0;
		while(i <= 9)
		{
			int temp = j, count = 0;
			while(temp > 0)
			{
				int rem = temp % 10;
				if(rem == i)
				{
					count +=1;
				}
			temp = temp / 10;
			}
			if(count > 0)
			{
				System.out.println("Digit " + i + " occurs " + count + " time(s)");
			}
			i++;
		}
	}
}

