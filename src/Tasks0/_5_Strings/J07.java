package Tasks0._5_Strings;

//Program to Iterate through each characters of the string.

public class J07 {
    public static void main(String[] args) {
        String name = "StarDust";

        System.out.println("Characters in " + name + " are:");

        for(int i = 0; i<name.length(); i++) {
            char a = name.charAt(i);
            System.out.print(a + ", ");
        }
    }
}
