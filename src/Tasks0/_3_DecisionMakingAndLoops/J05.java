package Tasks0._3_DecisionMakingAndLoops;

//Program to Reverse a Number

public class J05 {
    public static void main(String[] args) {
        int num = 6969, rev = 0;

        while(num != 0) {

            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + rev);

    }
}
