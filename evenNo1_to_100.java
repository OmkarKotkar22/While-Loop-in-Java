//4.Write a C program to print all even numbers between 1 to 100. - using while loop
import java.util.*;
public class evenNo1_to_100
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		int i = 1;//1 2 3 4...100
		int even;
		while(i<=no)
		{
			if(i%2==0)
				System.out.println("Even no" + i);
			i++;
		}
	}
}
