//Q19. Write a java program to find the sum of the first and last digit of a number.
import java.util.*;
public class sumof_first_last_digit
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int no, temp, p, first, last, count = 0, sum;
		System.out.println("Enter the Number: ");
		no = sc.nextInt();
		temp = no;
		while(no != 0)
		{
			++count;
			no = no / 10;
		}
							//System.out.println(no);

		no = temp;
							//System.out.println(no);
		last = no % 10;
							//System.out.println(last);
		p = (int)(Math.pow(10, --count));
							//System.out.println(p);
		first = no / p;
		no = no % p;
							//System.out.println(first);
							//System.out.println(no);
		no = no / 10;
							//System.out.println(no);
		last = last * p;
							//System.out.println(last);
		no = no * 10;
							//System.out.println(no);
		sum = last + first ;
		System.out.println("Sum" + sum);
	} 
}