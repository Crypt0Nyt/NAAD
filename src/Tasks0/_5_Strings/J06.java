package Tasks0._5_Strings;

// program to make the first letter of a String capital
public class J06 {
    public static void main(String[] args) {
        String name = "watermelon";

        String first = name.substring(0,1);
        String remaining = name.substring(1,name.length());

        first = first.toUpperCase();

        String str = first + remaining;

        System.out.println("Name: " + str);

    }
}
