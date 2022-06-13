import java.util.*;
class smallest
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int x=obj.nextInt();
		System.out.println("Enter the second number: ");
		int y=obj.nextInt();
		System.out.println("Enter the third number: ");
		int z=obj.nextInt();
		System.out.println("The smallest value is "+small(x,y,z)+"\n");
	}
	public static int small(int x,int y,int z)
	{
		return Math.min(Math.min(x,y),z);
	}
}

output
------

Enter the first number:
3475
Enter the second number:
3156
Enter the third number:
3732
The smallest value is 3156
