import java.util.*;
class StringSort2
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		String temp;	
		System.out.println("Enter the number of strings: ");
		int max = Integer.parseInt(sc.nextLine());
		String[] str = new String[max];
		System.out.println("Enter the Strings: ");
		for(int i = 0;i<max; i++)
		{
			str[i] = sc.nextLine();
		}
		System.out.println("Before sort: ");
		System.out.print(Arrays.toString(str) + "\t");
		for(int i=0; i<max; i++)
		{
			for(int j=i+1; j<max; j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}  
		}		

		System.out.println("\nAfter sort: ");
		System.out.print(Arrays.toString(str) + "\t");
	}
}

output
------

Enter the number of strings:
3
Enter the Strings:
hai
good
morning
Before sort:
[hai, good, morning]
After sort:
[good, hai, morning]
PS D:\thasnis2\java> javac StringSort2.java
PS D:\thasnis2\java> java StringSort2
Enter the number of strings:
3
Enter the Strings:
thasni
sarang
reshma
Before sort:
[thasni, sarang, reshma]
After sort:
[reshma, sarang, thasni]
		
