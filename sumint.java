import java.util.*;
class sumint
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Input the first number: ");
		int x=in.nextInt();
		System.out.println("Input the second number: ");
		int y=in.nextInt();
		System.out.println("Input the third number: ");
		int z=in.nextInt();
		int sum=x+y;
		System.out.println("Sum of first two integers: "+sum);
		System.out.println("The result is: "+sumoftwo(x,y,z));
	}
	public static boolean sumoftwo(int p,int q,int r)
	{
		return((p+q)==r||(q+r)==p||(r+p)==q);
	}
}

output
------

Input the first number:
345
Input the second number:
312
Input the third number:
657
Sum of first two integers: 657
The result is: true		