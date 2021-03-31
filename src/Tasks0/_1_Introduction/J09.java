package Tasks0;
//Program to Find the Largest Among Three Numbers
public class J09 {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 3;
        int num3 = 2;

        if( num1 >= num2 && num1 >= num3)
            System.out.println("The largest number is: " + num1 );

        else if (num2 >= num1 && num2 >= num3)
            System.out.println("The largest number is: " + num2 );

        else
            System.out.println("The largest number is: " + num3 );
    }

}
