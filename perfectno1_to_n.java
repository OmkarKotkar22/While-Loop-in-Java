//Q30. Write a java program to display 1 to nth Perfect Number.
import java.util.*;
public class perfectno1_to_n
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("print the perfect Number: ");
		int no = sc.nextInt();
	
		int i = 2,  count = 0;
		
		while(i < no)
		{
			 int sum = 0, j = 1;

			while(j < i)
			{
				if(i % j == 0)
				{
					sum = sum + j;
				}
				j++;
			}
			if(sum == i)
			{
				count++;
				System.out.print("Perfect number\t" + i +"\n");
			}
			i++;
		}
		System.out.println("count" + count);
	}
}

























/*		while(j != no)
		{
			System.out.println(j);
			Boolean flag = false;
			int i = 1;
			System.out.println(i);
			while(i < j)
			{
				if(j % i == 0)
				{
					flag = false;
					sum = sum + i;
					//System.out.println(sum);
				}
				
			}
			i++;
			//System.out.println(i);
			if(flag == true)
			{
				//System.out.println("Perfect No. " + j);
			}
		}
		//j++;*/