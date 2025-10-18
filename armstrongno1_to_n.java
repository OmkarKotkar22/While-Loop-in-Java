//Q33. Write a java program to display 1 to nth Armstrong Number.
//For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers and, 1634, 8208, 9474 are four-digit Armstrong numbers and there are many more.


/*import java.util.*;
public class armstrongno1_to_n
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		
		int i = 1;
		while(i <= no)
		{
			int j = i;
			int temp = i, count = 0, sum = 0;
			
			j = temp;
			while(j != 0)
			{
				++count;
				j = j / 10;
			}
			j = temp;

			while(j != 0)
			{
				int rem = j % 10;

				int p = 1, q = 0;
				while(q < count)
				{
					p = p * rem;
					q++;
				}
				sum = sum + p;
				j = j / 10;
			}
			if (sum == i) 
			{
	        	        System.out.println(i + " is a armstrong Number");
	        	}
            	i++;
		}
	}
}


*/

import java.util.*;

public class armstrongno1_to_n {
    public static void main(String[] x) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int no = sc.nextInt();

        int i = 1;
        while (i <= no) {
            int count = 0, sum = 0;
            int temp = i;

            // Step 1: Count number of digits
            int digitCounter = temp;
            while (digitCounter != 0) {
                count++;
                digitCounter = digitCounter / 10;
            }

            // Step 2: Sum of digits raised to the power 'count'
            int j = temp;
            while (j != 0) {
                int rem = j % 10;
                int power = 1;

                int k = 0;
                while (k < count) {
                    power *= rem;
                    k++;
                }

                sum += power;
                j /= 10;
            }

            // Step 3: Compare sum with original number
            if (sum == i) {
                System.out.println(i + " is an Armstrong Number");
            }

            i++;
        }
    }
}




