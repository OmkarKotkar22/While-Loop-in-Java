//6.Write a C program to find the sum of all natural numbers between 1 to n.
import java.util.*;
public class sum_of_allNaturalno1_to_n

{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		int i = 1;//1 2 3 4...100
		int total = 0;
		while(i <= 5)//6<=5
		{
			total = total + i;
			
			
			i++;//1 2 3 4 5 6
		}
		System.out.println("Total :" + total);
	}
}