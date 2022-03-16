import java.io.* ;
import java.util.* ;

class sum {
	public static void main(String[] args){
	 Scanner firstInt = new Scanner(System.in);
	 System.out.println("Enter the first number : ");
	 int first = firstInt.nextInt();

	 Scanner secondInt = new Scanner(System.in);
	 System.out.println("Enter the second number : ");
	 int second = secondInt.nextInt();
	
	 int sum = first + second ;
	 System.out.println("The Sum is " + sum );
}
	
}