/*Q45. Write a Java program to check whether a given number is a Disarium number or not, and display all Disarium numbers up to n.
 A Disarium number is a number whose sum of its digits powered with their respective positions is equal to the number itself.
 Example: 135 is a Disarium number because 1¹ + 3² + 5³ = 1 + 9 + 125 = 135.
Explanation:
 Use a loop to count digits. Use another loop to extract each digit and calculate the digit raised to its position power using only loops (no Math.pow()). Check if the sum equals the original number.
*/

import java.util.*;
public class Disarium_no
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();

		int k = 1;
		
		while(k <= no)
		{
			int count = 0;
			int sum = 0;
			int j = k;
			while(j != 0)
			{
				count++;
				j = j / 10;
			}
	
			int temp = k;
			
			while(temp != 0)
			{
				
				int rem = temp % 10; 
				int i = 1;
				int pow = 1;	
				while(i <= count)
				{
					pow = pow * rem;
					i++;
				
				}
				sum = sum + pow;
				count--;
				temp = temp / 10;
			}
			if(sum == k)
			{
				System.out.println("Disarium number" + k);
			}
		k++;
		}
		
	}
}