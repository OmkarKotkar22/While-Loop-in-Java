//Q32. Write a java program to display 1 to nth Strong Number.


import java.util.*;
public class display1ToN
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Print the strong number: ");
		int sum = 0, i = 1; rem = 0;
		while()
	}
}



int sum = 0, f = 1, rem;
		int temp = no;
		while(no != 0)
		{
			rem = no % 10;
			while(rem > 0)
			{
				f = f * rem;
				rem--;
			}
			sum = sum + f;
			f = 1;
			no = no / 10;
		}
