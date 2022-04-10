import java.util.*;

class PrimeRange
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int start, end;
		System.out.print("Enter the start: ");
		start = sc.nextInt();
		System.out.print("Enter the end: ");
		end = sc.nextInt();
		System.out.println("Prime nos are: ");
		Prime(start, end);
	}
	public static void Prime(int start, int end)
	{
		for(int i = start; i<=end; i++){
			int count=0;
			for(int j=2; j<=i/2; j++){
				if(i%j==0){
                    count++;
                }
                	
			} 
			if(count==0) System.out.println(i);
		}
	}
}