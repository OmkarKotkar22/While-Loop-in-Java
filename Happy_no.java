import java.util.*;
public class Happy_no{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		int temp = n;
		while(n != 1 && n != 4){
			int sum = 0;

			while(n > 0){
				int digit = n % 10;
				sum = sum + digit * digit;
				n = n / 10;
			}

			n = sum;
		}

		if(n==1){
			System.out.print(temp + " : Number is Happy no");
		}
		else{
			System.out.print(temp + " : Number is not Happy no");			
		}
	}
}