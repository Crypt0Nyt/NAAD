package Tasks0._5_Strings;

//Program to Check if two strings are anagram

import java.util.Arrays;
import java.util.Scanner;

public class J04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = input.next();
        System.out.print("Enter the second string: ");
        String str2 = input.next();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){
            char[] chArray1 = str1.toCharArray();
            char[] chArray2 = str2.toCharArray();

            Arrays.sort(chArray1);
            Arrays.sort(chArray2);

            boolean result = Arrays.equals(chArray1,chArray2);

            if(result) {
                System.out.println(str1 + " and " + str2 + " are anagram");
            }
            else{
                System.out.println(str1 + " and " + str2 + " are not anagram");
            }
        }
        else{
            System.out.println(str1 + " and " + str2 + " are not anagram");
        }
    }
}
