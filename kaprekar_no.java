/*Q44. Write a Java program to check whether a given number is a Kaprekar number or not, and to display all Kaprekar numbers up to n.
A Kaprekar number is a non-negative integer, the representation of whose square can be split into two parts that add up to the original number itself.
 For example:
9² = 81 → split as 8 and 1 → 8 + 1 = 9
45² = 2025 → split as 20 and 25 → 20 + 25 = 45
*/


import java.util.*;

public class kaprekar_no
{
    public static void main(String args[]) 
	{
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter a number: ");
        	int n = sc.nextInt();
	
        	int i = 1;
        	while (i <= n) 
		{
        	    int sq = i * i;		// Count digits in original number
        	    int count = 0;
        	    int j = i;
        	
			while (j != 0) 
			{
        		        count++;
        		        j = j / 10;
        		}

            					// Calculate 10^digits
            		int div = 1;
            		int k = 1;
            		
			while (k <= count) 
			{
                		div = (int)(Math.pow(10, count));
                		k++;
            		}

            int right = sq % div;
            int left = sq / div;

            if ((right + left) == i) {
                System.out.println(i + " is a Kaprekar number");
            }

            i++;
        }
    }
}
