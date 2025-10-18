//Q14. Write a java program to check whether a number is palindrome or not.
import java.util.*;
public class no_palindrome
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();
		int temp = no;
		int rev = 0, ld = 0;
		while(no > 0)
		{
			ld = no % 10;
			rev = rev * 10 + ld;
			no = no / 10;
		} 
		String str = (temp == rev)?"Palindrome" : "Not Palindrome";
		System.out.println("Check No Palindrome: "+str);
	}
}