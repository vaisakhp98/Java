import java.util.*;
class digit
{
	public static void main(String args[])
	{
		int sum=0;
		int temp;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the digit: ");
		int num=obj.nextInt();
		while(num>0)
		{
			temp=num%10;
			sum=sum+temp;
			num=num/10;
		}
		System.out.println("Sum of digit: "+sum);
	}
}