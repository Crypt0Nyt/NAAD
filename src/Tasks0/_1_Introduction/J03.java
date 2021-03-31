package Tasks0;

//Program to Multiply two Floating Point Numbers

import java.util.Scanner;

public class J03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a floating point number: ");
        float num1 = input.nextFloat();
        System.out.print("Enter another floating point number: ");
        float num2 = input.nextFloat();

        System.out.println();
        System.out.println("Multiplication of num1 and num2 is: "+ (num1 * num2));

    }
}
