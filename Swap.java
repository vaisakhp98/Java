import java.util.* ;

public class Swap{
	public static void main(String args[]){
		System.out.println("...Swapping with 3rd Variable...");

		Scanner A = new Scanner(System.in);
		System.out.println("Enter the value of A");
		int a = A.nextInt();
		
		Scanner B = new Scanner(System.in);
		System.out.println("Enter the value of B");
		int b = B.nextInt();
		
		System.out.println("A :" + a);
		System.out.println("B :" + b);

		int temp = a; 
		a = b; 
		b = temp; 
		
		System.out.println("Swapped");
		System.out.println("A :" + a);
		System.out.println("B :" + b);
		
		System.out.println("...Swapping without 3rd Variable...");
		
		Scanner C = new Scanner(System.in);
		System.out.println("Enter the value of C");
		int c = C.nextInt();
		
		Scanner D = new Scanner(System.in);
		System.out.println("Enter the value of D");
		int d = D.nextInt();

		System.out.println("C :" + c);
		System.out.println("D :" + d);
		
		c = c + d;
		d = c - d;
		c = c - d;

		System.out.println("Swapped");
		System.out.println("C :" + c);
		System.out.println("D :" + d);
		
		
	
}}