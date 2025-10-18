//Q51. Write a java program to display following series :
//           	1  2  2  4  3  6  4  8  5  10  6  12

import java.util.Scanner;
public class print_series_1to6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		int i = 1;
		while(i <= no)
		{
			System.out.println(i + " ");
			System.out.println(i * 2 + " ");
		i++;	
		}
	}
}