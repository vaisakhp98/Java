import java.util.*;

class Vowels
{
	public static void main(String args[]){
		int count = 0;
		String vowels = "aeiou";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		for(int i = 0; i < str.length(); i++){
			if(vowels.contains(String.valueOf(str.charAt(i))))
			{
				count++;
			}
		}
		System.out.println("No of vowels: " + count);
	}
}