//3.Write a C program to print all alphabets from a to z. - using while loop
import java.util.*;
public class alphabet_a_to_z
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Charcter: ");
		char ch = sc.next().charAt(0);
		while(ch>='a' && ch<='z')
		{
			System.out.println("Total \t" + ch);
			ch++;
		}
	}
}