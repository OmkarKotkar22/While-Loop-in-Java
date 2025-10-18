//Q18. Write a java program to find the first and last digit of a number.
import java.util.*;
public class first_last_digit
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		int no, temp, p, first, last, count = 0, no1, no2;
		System.out.println("Enter the Number");
		no = sc.nextInt();
		temp = no;

		while(no != 0)
		{
			++count;
			no = no / 10;
		}
		no = temp;

		last = no % 10;

		p = (int)(Math.pow(10, --count));
		

		first = no / p;
		no = no % p;

		no = no / 10;

		//last = last * p;

		no = no * 10;

		no1 = last;
		no2 = first;
		System.out.println(no1);
		System.out.println(no2);
	}
}
/*

	   while(no!=0)
	   {
	     ++count;
		 no  = no /10;
	   }
	   no=temp;
	   last=no%10; //extarct last digit 
       p=(int)Math.pow(10,--count);	  //calcualte power 
	   first=no/p; //extact first digit 
	   no=no%p; //remove first digit
	   no = no/10; //remove last digit 
	   last= last*p; 
	   no =no*10;
	   no=  last+no+first;
	   System.out.printf("AFter swap %d\n",no);
	}
}
*/