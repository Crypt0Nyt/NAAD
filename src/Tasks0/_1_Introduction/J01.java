package Tasks0;

import java.util.Scanner;

//Program to Print an Integer entered by an user

public class J01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        int number = input.nextInt();

        System.out.println("You entered: " + number);
    }
}


