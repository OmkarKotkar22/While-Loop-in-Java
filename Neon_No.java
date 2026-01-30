import java.util.*;
public class Neon_No{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int no = sc.nextInt();

		int sum = 0;
		int square = no * no;
	
		while(square > 0){
			int digit = square % 10;
			sum += digit;
			no = no / 10;
		}

		
		if(sum == no){
			System.out.print(no + " : is Neon Number");
		}
		else{
			System.out.print(no + " : is Neon Number");
		}
	}
}