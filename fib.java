import java.util.*;
class fib
{
	public static void main(String args[])
	{
		int max=10,first=0,second=1,i=1;
		System.out.println("Fibonacci series of "+max+" numbers: ");
		while(i<=max)
		{
			System.out.println(first+"  ");
			int sum=first+second;
			first=second;
			second=sum;
			i++;
		}
	}
}

output
------

Fibonacci series of 10 numbers:
0
1
1
2
3
5
8
13
21
34