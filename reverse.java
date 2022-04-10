import java.util.*;

class Reverse
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		System.out.println("Reverse = " + reverse(a));
	}

	public static int reverse(int num)
	{
		int reverse=0;
		while(num!=0){
			reverse = (reverse * 10) + (num % 10);
			num/=10;
		}
		return reverse;
	}
}