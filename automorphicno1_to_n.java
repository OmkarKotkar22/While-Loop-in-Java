/*Q40. Write a Java program to print all automorphic numbers between 1 and n. An automorphic number’s square ends with the number itself (e.g., 5² = 25).
 Explanation:
 Use loop to check square and a while loop to match last digits.*/

import java.util.*;
public class  automorphicno1_to_n
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
	
		int i = 1;
		while(i<=no)
		{
			int j = i;
			int temp = i;
			int square = j * j;		//square any input number

			int count = 0;
			while(j>0)
			{
				count++;		//how many digit count in your number
				j = j / 10;		// remove last digit
			}


			int pow = (int)(Math.pow(10,count));	//how many digit count according to cal power
			int rem = square % pow;			//separate last digit depends on power
			if(rem == temp)
			{
				System.out.println(i);
			}
		i++;
		}
		
	}
}