import org.shapes.*;
import java.util.*;
class pack
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of the square: ");
		int s=sc.nextInt();
		square sq=new square(s);
		System.out.println("Area of square: "+sq.area());
		System.out.println("Enter the radius of circle: ");
		int r=sc.nextInt();
		circle1 c1=new circle1(r);
		System.out.println("Area of circle: "+c1.area());
		System.out.println("Enter the base and height of the triangle: ");
		int b=sc.nextInt();
		int h=sc.nextInt();
		triangle t=new triangle(b,h);
		System.out.println("Area of square: "+t.area());
	}
}

output
------

Enter the side of the square:
4
Area of square: 16
Enter the radius of circle:
5
Area of circle: 78.5
Enter the base and height of the triangle:
4
5
Area of square: 10.0	