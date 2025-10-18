/*Q48. Write a Java program to display all Twin Primes between 1 and n.
 Twin Primes are pairs of prime numbers that differ by 2.
 Example: (3, 5), (5, 7), (11, 13).
Explanation:
 Use loops:
First, loop through numbers from 2 to n.
For each, check if it and the next number +2 are both prime using an inner loop.
If both are prime, print the pair.*/

import java.util.Scanner;
public class twin_prime_pair
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();

		int i = 2;
		while(i <= no)
		{
			int j = 2;
			while(j % i == 0)
			{
				if(i + 2 == 0)
				{
					System.out.println("Twin prime pair" + (i,(i+2));
					break;
				}
			j++;
			}
		i++;
		}
	}
}