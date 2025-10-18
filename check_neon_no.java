/*Q26. Write a java program to Check Number Is Neon Number or Not.
Example : A neon number is a number where the sum of digits of the square of the number is equal to the number.
*/

import java.util.*;
public class check_neon_no
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		int square, sum=0, rem;

		square = no * no;
		
		while(square != 0)
		{
			rem = square % 10;
			sum = sum + rem; 
			square = square / 10;
		}
		System.out.println(sum);
		String str = (sum==no)?"Neon no":"not";
		System.out.println(str);
	}
}