//Q52. Write a java program to display following series :
//           	2   729   4   512   6   343   8   216   10   125   12   64   14   27   16   8   18   1

import java.util.Scanner;
public class print_series_even_and_cube
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();

		int i = 2, cubebase = 9;
		while(i <= no)
		{
			System.out.println(i);
			System.out.println(cubebase*cubebase*cubebase);
		i+=2;
		cubebase--;
		}
	}
}