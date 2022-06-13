import java.util.*;
class fibuser
{
	public static void main(String args[])
	{
		int max,first=0,second=1;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		max=obj.nextInt();
		System.out.println("Fibanocci series of "+max+" numbers:");
		for(int i=1;i<=max;i++)
		{
			System.out.print(first+"  ");
			int sum=first+second;
			first=second;
			second=sum;
		}
	}
}

output
-----

Enter the limit:
10
Fibanocci series of 10 numbers:
0  1  1  2  3  5  8  13  21  34
		