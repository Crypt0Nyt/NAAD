package Tasks0._3_DecisionMakingAndLoops;

//Java Code To Create Pyramid and Pattern
//Program to print half pyramid using *
//*
//* *
//* * *
//* * * *
//* * * * *

public class J10 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

