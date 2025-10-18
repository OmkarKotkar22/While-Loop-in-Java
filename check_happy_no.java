/*Q27. Write a java program to Check If a Number Is a Happy Number or Not.
Example : A number is called happy if it leads to 1 after a sequence of steps wherein each step number is replaced by the sum of squares of its digit, that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1.
        	Input: n = 19
        	Output: True
        	19 is Happy Number,
        	1^2 + 9^2 = 82
        	8^2 + 2^2 = 68
        	6^2 + 8^2 = 100
        	1^2 + 0^2 + 0^2 = 1
        	As we reached 1, 19 is a Happy Number.
*/


import java.util.*;
public class check_happy_no
{

	public static void main(String a[])
        {
            int rem,count=0,i=1,sum=0;
		boolean flag = false;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number=");
		int num=sc.nextInt();
		int temp=num;
		while(true)
                {
			
			while(num!=0)
			{
				rem=num % 10; //0
				num=num / 10; //6
				sum = sum + rem * rem;
			}
			
			if(sum == 1)
			{
				flag = true;
				break;
			}

			else if(count == 4)
			{
				flag = false;
				break;	
			}

			else
                        {
				num = sum;
				sum = 0;	
			}
			count++;

		}

		if(flag)
		{
			System.out.println("Happy Number");
		}
		else
		{
			System.out.println("Unhappy Number");

		}
		

         }



}