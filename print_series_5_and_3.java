//Q55. Write a java program to display following series :
//           	5  3  10  6  15  9  20  12  25  15  30  18  35  21  40

import java.util.Scanner;
public class print_series_5_and_3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		int i = 5;
		int j = 3;
		while(i <= no)
		{
			System.out.println(i);
			System.out.println(j);
		i+=5;
		j+=3; 
		}
	}
}