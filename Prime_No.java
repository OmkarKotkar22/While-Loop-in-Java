import java.util.*;
public class Prime_No{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int no= sc.nextInt();

		int count = 0;
		int i = 1;
		while(i <= no){
			if(no % i == 0){
				count++;
			}
			i++;
		}

		if(count == 2){
			System.out.print(no + " : is Prime No");
		}
		else{
			System.out.print(no + " : is not Prime No");
		}
	}
}