package Tasks0;
//Program to print ascii value of character (user input)
import java.util.Scanner;

public class J04 {
    public static void main(String[] args) {
        Scanner intput = new Scanner(System.in);
        System.out.print("Enter the character value: ");
        char ch = intput.next().charAt(0);
        int ascii = ch;
        int castAscii = (int) ch;

        System.out.println();
        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}
