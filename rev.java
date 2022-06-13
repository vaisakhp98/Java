import java.util.*;
class rev
{
	public static void main(String args[])
	{
		int n,rev=0;
		System.out.println("Enter a number: ");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		int temp=n;
		while(temp!=0)
		{
			rev=rev*10;
			rev=rev+temp%10;
			temp=temp/10;
		}
		System.out.println("Reverse of "+n+" is "+rev);
	}
}

output
------

Enter a number:
3987
Reverse of 3987 is 7893