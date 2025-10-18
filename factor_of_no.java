//Q17. Write a java program to find all factors of a number.
import java.util.*;
public class factor_of_no
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();
		int i = 1, f = 0;		
		while(no != i)
		{
			if(no % i == 0)
			{
				f = no / i;
				System.out.println(f);
			}
		i++;		
		}	

	}
}