package Tasks0._3_DecisionMakingAndLoops;

//Program to Make a Simple Calculator Using switch...case

import java.util.Scanner;

public class J07 {
    public static void main(String[] args) {

        char operator;
        Double num1, num2, result;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = input.nextDouble();

        System.out.print("Choose an operator: +, -, *, or / :");
        operator = input.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = input.nextDouble();

        switch (operator){
            case'+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result );
                break;

            case'-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case'*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;


            case'/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;

            default:
                System.out.println("Invalid Operator!");
                break;
        }
        input.close();


    }
}
