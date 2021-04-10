package Tasks0._1_Introduction;

// Program to Remove All Whitespaces from a String

import java.util.Scanner;

public class J12 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter the string: ");

        String input = str.nextLine();
        System.out.println("Your string with white spaces is: " + input);

        input = input.replaceAll("\\s" , "");

        System.out.println("Your string without white spaces is: " + input);
        str.close();


    }
}

