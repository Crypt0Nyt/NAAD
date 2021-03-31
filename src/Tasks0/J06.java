package Tasks0;
//Program to swap two numbers
public class J06 {
    public static void main(String[] args) {

        int num1 = 6;
        int num2 = 9;

        //using temporary variable
        System.out.println("USING TEMPORARY VARIABLE \nBefore Swapping: \nnum1 = " + num1 + "\nnum2 = " + num2);
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping: \nnum1 = " + num1 + "\nnum2 = " + num2);

        num1 = 6;
        num2 = 9;
        //without using temporary variable
        System.out.println();
        System.out.println("WITHOUT USING TEMPORARY VARIABLE \nBefore Swapping: \nnum1 = " + num1 + "\nnum2 = " + num2);
        num1 = num1 - num2;
        num2 = num1 + num2;
        num1 = num2 - num1;
        System.out.println("After Swapping: \nnum1 = " + num1 + "\nnum2 = " + num2);
    }
}