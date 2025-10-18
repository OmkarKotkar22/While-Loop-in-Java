//2.Write a C program to print all natural numbers in reverse (from n to 1). - using while loop
import java.util.*;
public class reverseNaturalNo_N_TO_1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		int total;
		int n = 1;
		int i = 100;
		while(i>n)
		{
			total = i - 1;
			System.out.println("Total \t" + total);
			i--;
		}
	}
}