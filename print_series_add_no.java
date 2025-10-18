//Q54. Write a java program to display following series :
//           	1  2  4  7  11  16  22  29  37  46.

import java.util.Scanner;
public class print_series_add_no
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		int i = 1, j = 1;
		while(i <= no)
		{
			System.out.println(i);	
		i = i+j;
		j++;	
		}
	}
}