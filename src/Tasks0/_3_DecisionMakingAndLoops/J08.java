package Tasks0._3_DecisionMakingAndLoops;

//Program to Count the Number of Vowels and Consonants in a Sentence

import java.util.Scanner;

public class J08 {
    public static void main(String[] args) {
        int vovel = 0, consonant = 0, digit = 0, space = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the line: ");
        String str1 = input.nextLine();

        str1 = str1.toLowerCase();

        for(int i = 0 ; i < str1.length() ; ++i) {
            char ch = str1.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                ++vovel;
            }
            else if(ch >= 'a' && ch <= 'z'){
                ++consonant;
            }
            else if(ch>='0' && ch <= '9'){
                ++digit;
            }
            else if(ch == ' '){
                ++space;
            }


        }
        System.out.println("Vovels = " + vovel);
        System.out.println("Consonants = " + consonant);
        System.out.println("Digits = " + digit);
        System.out.println("White spaces = " + space);
    }
}
