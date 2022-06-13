import java.util.*;
class FibThread implements Runnable
{
	public void run()
	{
		int a=0,b=1,c=0;
		System.out.println("FibThread  -"+a);
		System.out.println("FibThread  -"+b);
		for(int h=1;h<=7;h++)
		{
			c=a+b;
			System.out.println("FibThread  -"+c);
			a=b;
			b=c;
		}
	}
}
class EvenRangeThread implements Runnable
{
	public void run()
	{
		int a=2,b=10;
		for(int k=a;k<=b;k+=2)
			System.out.println("EvenRangeThread --"+k);
	}
}
public class FibEven
{
	public static void main(String args[])
	{
		FibThread ft=new FibThread();
		EvenRangeThread er=new EvenRangeThread();
		Thread t1=new Thread(ft);
		Thread t2=new Thread(er);
		t1.start();
		t2.start();
	}
}

output
------

FibThread  -0
EvenRangeThread --2
EvenRangeThread --4
EvenRangeThread --6
EvenRangeThread --8
EvenRangeThread --10
FibThread  -1
FibThread  -1
FibThread  -2
FibThread  -3
FibThread  -5
FibThread  -8
FibThread  -13
FibThread  -21


		
		
