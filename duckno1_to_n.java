//Q31. Write a java program to display 1 to nth Duck Number.
import java.util.*;
public class duckno1_to_n
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Print the Duck No.");
		int no = sc.nextInt();
		boolean flag = false;
		int i = 1, count = 0;
		while(i <= no)
		{	
			int rem;
			int temp = i;
			flag = true;
			while(temp != 0)
			{
				rem = temp % 10;
				if(rem == 0)
				{
					count++;
					flag = false;
					break;
				}
				temp = temp / 10;
			}
			if(flag == false)
			{
				System.out.println(i);
			}
			i++;
		}
		System.out.println("Count: " + count);
	}
}