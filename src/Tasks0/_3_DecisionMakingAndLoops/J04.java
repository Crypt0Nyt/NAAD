package Tasks0._3_DecisionMakingAndLoops;

//Program to Count Number of Digits in an Integer

public class J04 {
    public static void main(String[] args) {
        int count = 0, num = 76654387;

        while (num != 0) {
            
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);

    }
}