//Q29. Write a java program to display 1 to nth Prime Number.


import java.util.*;
public class primeno1_to_n
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Display the prime no: ");
		int no = sc.nextInt();
		int i = 2;
		int count = 0;
		while(i<no)
		{
		
			boolean flag = true;
			int j = 2;
			while(j < i)
			{	
				if(i%j == 0)
				{	
					flag = false;
				}	
			j++;
			}
			if(flag == true)
			{	
				System.out.println("Prime: "+i); 
				count++;
			}
		
		i++;
		}
		System.out.println("Total prime numbers: "+count);
	}
}



