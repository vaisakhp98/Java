import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str=sc.nextLine();
		int size=str.length();
		boolean ispalindrome=true;
		for(int i=0;i<size/2;i++)
		{
			if(str.charAt(i)!=str.charAt(size-i-1))
			{
				ispalindrome=false;
				break;
			}
		}
		if(ispalindrome)
			System.out.println("The string "+str+" is a palindrome");
		else
			System.out.println("The string "+str+" is not palindrome");
	}
}
