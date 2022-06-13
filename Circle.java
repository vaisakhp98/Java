import java.util.*;
class circle
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of radius:");
		int r=obj.nextInt();
		System.out.println("Area of a circle="+(Math.PI)*r*r);
		System.out.println("Perimeter of a circle="+2*(Math.PI)*r);
	}
}
	