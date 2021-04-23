package Tasks0._3_DecisionMakingAndLoops;

//Program to Check Whether a Character is Alphabet or Not

import java.util.Scanner;

public class J01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the character: ");

        char ch = input.next().charAt(0);
        if (Character.isAlphabetic(ch)) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");

        }
    }
}

