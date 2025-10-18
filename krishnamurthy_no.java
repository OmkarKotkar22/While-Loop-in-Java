/*Q50. Write a Java program to check whether a given number is a Krishnamurthy Number and list all Krishnamurthy numbers up to n.
 A Krishnamurthy number is a number whose sum of the factorials of its digits equals the number itself.
 Example: 145 → 1! + 4! + 5! = 145.
Explanation:
 Use loops:
Outer loop for numbers from 1 to n.
Inner loop to extract digits and compute each digit’s factorial with another nested loop.
Sum and compare with the original number.*/

import java.util.Scanner;
public class krishnamurthy_no
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		int i = 1;
		while(i <= no)
		{
			int j = i;
			int rem = 0, sum =0;
			while(j != 0)
			{
				rem = j % 10;
				int f = 1;
				while(rem != 0)
				{
					f = f * rem;
					rem--;
				}
			sum = sum + f;
			j = j /10;
			}
			if(sum == i)
			{
				System.out.println("Krishnamurthy numbers: " + i);
			}
		i++;
		}
	}
}