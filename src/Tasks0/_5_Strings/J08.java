package Tasks0._5_Strings;

//Program to Differentiate String == operator and equals() method

public class J08 {
    public static void main(String[] args) {
        String string1 = new String("Watermelon");
        String string2 = new String("Watermelon");

        boolean result1 = (string1 == string2);
        System.out.println("Using == Operator: " + result1);

        boolean result2 = string1.equals(string2);
        System.out.println("Using equals(): " + result2);
    }
}
