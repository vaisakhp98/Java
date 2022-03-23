import java.io.*;
import java.util.*;

class product {
	public static void main (String[] args){
	  Scanner firstNum = new Scanner(System.in);
	  System.out.println("Enter the first number : ");
	  int first = firstNum.nextInt();

	  Scanner seconfNum = new Scanner(System.in);
	  System.out.println("Enter the Second number : ");
	  int second = seconfNum.nextInt();

          int product = first * second;
	
	  System.out.println("The Product of " + first + " and " + second + " is " + product);
}
}