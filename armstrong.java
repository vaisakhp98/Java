import java.util.*;

class Amstrong
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		if(checkAmstrong(a)){
			System.out.print(a+" is amstrong");
		}
		else System.out.print(a+" is not amstrong");
	}

	public static boolean checkAmstrong(int number){
		int sum=0, last;
		int temp=number;
		while(number!=0){
			last = number % 10;
			sum = sum + (last*last*last);
			number = number / 10;
		}
		
		return sum==temp ? true : false;
	}
}