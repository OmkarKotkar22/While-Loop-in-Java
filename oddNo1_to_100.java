//5.Write a C program to print all odd numbers between 1 to 100.
import java.util.*;
public class oddNo1_to_100
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		int i = 1;
		int even;
		while(i <= 100)
		{
			if(i%2 != 0)
				System.out.println("Odd no" + i);
                        //else
			//	System.out.println("Even no" + i);
			
			i++;
		}
	}
}