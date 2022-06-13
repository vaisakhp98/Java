import java.util.*;
class product
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of A:");
		int a=obj.nextInt();
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter the value of B:");
		int b=obj1.nextInt();
		int p=a*b;
		System.out.println("product of "+a+" and "+b+" is:"+p);
	}
}