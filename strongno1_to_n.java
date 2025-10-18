//Q32. Write a java program to display 1 to nth Strong Number.
//Example : A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145

import java.util.*;
public class strongno1_to_n
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		int i = 1 , sum ;
		while(i <= no)
		{
		        int j = i;
			int rem = 0;
			sum = 0;
			while(j != 0)
			{
				rem = j % 10;		//5   4   1          
				int  f = 1;		//1  
				while(rem != 0)		// 5>0 4>0 3>0 2>0 1>0 0>0 , 4>0 3>0 2>0 1>0 0>0 ,  1>0 0>0
				{
					f = f * rem;	//f=1*5=5, f=5*4=20, f=20*3=60, f=60*2=120     &      f=1*4=4, f=4*3=12, f=12*2 =24     &     f = 1*1 = 1
 					rem--;		//4
				}

			sum = sum + f;			//0+120 = 120   &  120+24   &   144+1   =  145
			j = j / 10;   			//14  1  0
			}

           		if (sum == i) 
			{
	        	        System.out.println(i + " is a Strong Number");
	        	}
            	i++;
		}
	}
}

