import java.io.*;
import java.util.*;

class Circle{
    public static void main(String[] args){
        Scanner radius = new Scanner(System.in);
        System.out.print("Enter the Radius :");
        double rad = radius.nextDouble();

        double area = Math.PI * rad * rad;
        double peri = 2 * Math.PI * rad;

        System.out.println("The area of the Circle is " + area);
        System.out.println("The perimeter of the Circle is " + peri);

    }
}