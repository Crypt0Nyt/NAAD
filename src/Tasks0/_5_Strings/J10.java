package Tasks0._5_Strings;

//Program to Check if a string contains a substring

public class J10 {
    public static void main(String[] args) {
        String original = "Vibe like rainbow";
        String str1 = "rainbow";
        String str2 = "Rainbow";

        boolean result = original.contains(str1);
        if(result) {
            System.out.println(str1 + " is present in the string.");
        }
        else {
            System.out.println(str1 + " is not present in the string.");
        }

        result = original.contains(str2);
        if(result) {
            System.out.println(str2 + " is present in the string.");
        }
        else {
            System.out.println(str2 + " is not present in the string.");
        }
    }
}

