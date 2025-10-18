//Q12. Write a java program to calculate the product of digits of a number.
import java.util.*;
public class productof_digit_no
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		int prod = 1, ld = 1;
		while(no!=0)
		{
			ld = no % 10;
			prod = prod * ld;
			no = no / 10;
		}
		System.out.println("Product: "+ prod);
		
	}
}