import java.util.*;
class pal
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str=ob.nextLine();
		int size=str.length();
		boolean ispalindrome=true;
		for(int i=0;i<size/2;i++)
		{
			if(str.charAt(i)==str.charAt(size-i-1))
				continue;
			else
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

output
------

Enter the string: amma
The string amma is a palindrome
	