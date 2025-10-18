/*Q28. Write a java program to Check Number Is Spy Number or Not.
Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
 	Input : 1412
	Output : Spy Number
	Explanation :
	sum = (1 + 4 + 1 + 2) = 8
	product = (1 * 4 * 1 * 2) = 8
	since, sum == product == 8
*/

import java.util.*;
public class check_spy_no
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no, sum = 0, product = 1, rem;
		no = sc.nextInt();
		
		while(no != 0)
		{
			rem = no % 10;
			sum = sum + rem;
			product = product * rem;
			no = no / 10;
		}
		System.out.println(sum);
		System.out.println(product);
		String str = (sum == product) ? "spy number" : "Not spy number";
		System.out.println(str);

	}
}