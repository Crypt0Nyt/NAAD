package Tasks0._5_Strings;

//Program to Create random strings

import java.util.Random;

public class J05 {
    public static void main(String[] args) {

        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";

        String alphaNumeric = upperAlphabet + lowerAlphabet + numbers;

        StringBuilder sb = new StringBuilder();

        Random random = new Random();

        int length = 10;

        for(int i = 0; i < length; i++) {

            int index = random.nextInt(alphaNumeric.length());
            char randomChar = alphaNumeric.charAt(index);

            sb.append(randomChar);
        }

        String randomString = sb.toString();
        System.out.println("Random String is: " + randomString);

    }
}


