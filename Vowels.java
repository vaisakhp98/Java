import java.util.*;
class vowels
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=obj.nextLine();
		System.out.println("Number of vowels in the string : "+countvowels(str)+"\n");
	}
	public static int countvowels(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				count++;
			}
		}
		return count;
	}
}

output
------

Enter the string:
thasnirashid
Number of vowels in the string : 4
		
		