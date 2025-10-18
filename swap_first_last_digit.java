//Q20. Write a java program to swap first and last digits of a number.
import java.util.*;
public class swap_first_last_digit
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int no, temp, p, first, last, count = 0, swap;
		System.out.println("Enter the Number: ");
		no = sc.nextInt();
		temp = no;

		while(no != 0)
		{
			++count;
			no = no / 10;
		}
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

		no = last + no + first;
		System.out.println(no);
		
	}
}