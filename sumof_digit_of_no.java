//Q11. Write a java program to calculate the sum of digits of a number.
import java.util.*;
public class sumof_digit_of_no
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();
		int sum=0, ld = 0;
			while(no != 0)
			{
				ld = no % 10;
				sum = sum + ld;
				no = no/10;
			}
		System.out.println("Sum: " + sum);
	}
}