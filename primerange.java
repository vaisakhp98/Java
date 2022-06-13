import java.util.*;
class primerange
{
	public static void main(String args[])
	{
		int i,count;
		System.out.print("Enter 2 limits: ");
		Scanner obj=new Scanner(System.in);
		int m=obj.nextInt();
		int n=obj.nextInt();
		System.out.print("Prime numbers between "+m+" to "+n+" are: ");
		for(int j=m;j<=n;j++)
		{
			count=0;
			for(i=1;i<=j;i++)
			{
				if(j%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(j+" ");
			}
		}
	}
}		

output
------

Enter 2 limits: 2
20
Prime numbers between 2 to 20 are: 2 3 5 7 11 13 17 19		
	