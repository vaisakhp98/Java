import java.io.*;
import java.util.*;

class SmallestThree{
	public static void main(String[] args){
		System.out.print("Enter the first number : ");
		Scanner fnumber = new Scanner(System.in);
		int fnum =fnumber.nextInt();

		System.out.print("Enter the second number : ");
		Scanner snumber = new Scanner(System.in);
		int snum = snumber.nextInt();

		System.out.print("Enter the third number : ");
		Scanner tnumber = new Scanner(System.in);
		int tnum = tnumber.nextInt();
		
		if(fnum < snum && fnum < tnum){
			System.out.println(fnum + "is the smallest");
		}
		else if (snum < fnum && snum < tnum){
			System.out.println(snum + "is the smallest");
		}
		else{
			System.out.println(tnum + "is the smallest");
		}
	}	
}