//Q35. Write a java program to enter a number and print it in words.
import java.util.*;
public class conv_no_to_words
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		int rev = 0;

		while(no > 0)
		{
			int temp = 1;
			temp = temp % 10;
			if(temp == 0)
			{
				System.out.println("Zero");
			}else if(temp == 1){
				System.out.println("One");
			}else if(temp == 2){
				System.out.println("Two");
			}else if(temp == 3){
				System.out.println("Three");
			}else if(temp == 4){
				System.out.println("Four");
			}else if(temp == 5){
				System.out.println("Five");
			}else if(temp == 6){
				System.out.println("Six");
			}else if(temp == 7){
				System.out.println("Seven");
			}else if(temp == 8){
				System.out.println("Eight");
			}else{
				System.out.println("Nine");				
			}
			temp = temp / 10;
			}
		System.out.println("*"); 
	}
}