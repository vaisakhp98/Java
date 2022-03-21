import java.io.*;
import java.util.*;

class ProductOfNums{
    public static void main(String[] args){
        Scanner First = new Scanner(System.in);
        System.out.print("1st Number :");
        int first = First.nextInt();
        
        Scanner Second = new Scanner(System.in);
        System.out.print("2nd Number :");
        int second = Second.nextInt();

        System.out.println("The Product of " + first + " and " + second + " = " + first*second);
    }
}