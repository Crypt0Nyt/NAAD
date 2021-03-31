package Tasks0;
//Program to check whther a number is even or odd
import java.util.Scanner;

public class J07 {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = input.nextInt();

            if(num % 2 == 0)
                System.out.println(num + " is even");
            else
                System.out.println(num + " is odd");
    }
}
