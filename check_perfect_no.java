/*Q22. Write a java program to Check Number Is Perfect Number or Not.
Example : perfect number, a positive integer that is equal to the sum of its proper divisors. The smallest perfect number is 6,which is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128.
*/
import java.util.*;
public class check_perfect_no
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();
		int sum=0, i = 1;
		
		while(i != no)
		{
			if(no%i == 0)
			{
				sum = sum + i;
			}
			i++;
		}
		String str = (sum == no)?"perfect no":"not";
		System.out.println(str);
	}
}


