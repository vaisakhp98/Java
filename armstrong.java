import java.util.*;
import java.lang.Math;
class armstrong
{
	static void isArmstrong(int n)
	{
		int temp,digits=0,last=0,sum=0;
		temp=n;
		while(temp>0)
		{
			temp=temp/10;
			digits++;
		}
		temp=n;
		while(temp>0)
		{
			last=temp%10;
			sum+=(Math.pow(last,digits));
			temp=temp/10;
		}
		if(n==sum)
			System.out.print("its Armstrong");
		else
			System.out.print("its not Armstrong");
	}
	public static void main(String args[])
	{
		int num;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the number: ");
		num=obj.nextInt();
		isArmstrong(num);
	}
}

output
------

Enter the number: 370
its Armstrong	