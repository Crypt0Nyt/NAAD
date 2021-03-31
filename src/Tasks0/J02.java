package Tasks0;

import java.util.Scanner;

public class J02 {

    //Program to Add Two Integers
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number = ");
        int num2 = input.nextInt();

        System.out.println();
        System.out.println("Sum of num1 and num2 is: " + (num1 + num2));
    }
}
