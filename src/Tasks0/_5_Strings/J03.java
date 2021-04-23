package Tasks0._5_Strings;

//Program to Check if a String is Numeric

public class J03 {
    public static void main(String[] args) {

        String string = "353829.5";
        boolean numeric = true;

        try {
            Double num = Double.parseDouble(string);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric)
            System.out.println(string + " is a number");
        else
            System.out.println(string + " is not a number");

    }
}
