//Q53. Write a java program to display following series :
//           	1  4  9  16  25  36  49  64  81  100

import java.util.Scanner;
public class print_series_sq_1to10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		int i = 1;
		while(i <= no)
		{
			int j = (int)Math.pow(i,2);
			System.out.println(j + " ");
		i++;	
		}
	}
}