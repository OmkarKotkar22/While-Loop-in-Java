import java.util.*;
public class Armstrong_No{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n= sc.nextInt();

		int temp = n;
		int sum = 0;
		while(n > 0){
			int digit = n % 10;
			sum = sum + (digit * digit * digit);
			n = n / 10;
		}

		if(temp == sum){
			System.out.print(temp + " : is Armstrong No");
		}
		else{
			System.out.print(temp + " : not Armstrong No");
		}
	}
}