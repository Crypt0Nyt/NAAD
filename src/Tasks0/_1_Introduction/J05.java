package Tasks0;

import java.util.Scanner;

//Program to Compute Quotient and Remainder (user input)
public class J05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int dividend = input.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        int quotient = dividend/divisor;
        int remainder = dividend % divisor;

        System.out.println();
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);

    }
}
