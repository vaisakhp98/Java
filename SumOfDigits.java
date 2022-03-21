import java.io.*;
import java.util.*;

class SumOfDigits {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = number.nextInt();

        int ld = 0,sum = 0;

        while(num !=0){
            ld = num % 10;
            sum = sum + ld;
            num = num / 10;

        }
        System.out.println("The sum is " + sum);
    }
}
