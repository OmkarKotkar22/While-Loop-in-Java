//Q13. Write a java program to enter a number and print its reverse.
import java.util.*;
public class reverse_no
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		int rev = 0, rem=0;
		while(no!=0)
		{
			rem = no%10;
			rev = rev * 10 + rem;
			no = no/10;
		}
		System.out.println("Reverse:" + rev);
	}
}