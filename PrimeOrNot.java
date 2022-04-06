import java.util.*;

public class PrimeOrNot{
	public static void main(String args[]){
		System.out.print("Number is prime or not");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		
		int num = sc.nextInt();
		int count = 0;
		for (int i=1;i<=num;i++){
			if(num % i == 0){
				count = count + 1;
				System.out.println(i);
			}
		
}
System.out.println(count);

if(count == 2){
	System.out.println("The number is Prime");
}else{
	System.out.println("The number is not Prime");
}
}
}