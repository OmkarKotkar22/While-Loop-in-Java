//9.Write a C program to print a multiplication table of any number.

import java.util.*;
public class table_of_anyno
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		int i =1, tab, ld = 10;
		while(i<=ld)
		{
			tab = i*no;
			System.out.println("Table: " + tab);
			i++;
		}
	}
}