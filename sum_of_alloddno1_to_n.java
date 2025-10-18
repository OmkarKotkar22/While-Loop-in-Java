//8.Write a C program to find the sum of all odd numbers between 1 to n.
import java.util.*;
public class sum_of_alloddno1_to_n
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no, sum=1, i=1;
		no = sc.nextInt();
		
		while(i<=no)
		{
			if(i%2 != 0)
			{
				sum = sum * i;
			}
			i++;
		}
		System.out.println("Sum: " + sum);
	}
}