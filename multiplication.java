import java.util.*;
class multiplication
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=input.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" * "+num+" = "+(i*num));
		}
	}
	
}

output
------

Enter a number:
9
1 * 9 = 9
2 * 9 = 18
3 * 9 = 27
4 * 9 = 36
5 * 9 = 45
6 * 9 = 54
7 * 9 = 63
8 * 9 = 72
9 * 9 = 81
10 * 9 = 90