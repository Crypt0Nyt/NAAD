package Tasks0._4_Arrays;

//Program to Calculate Average Using Arrays

public class J01{
    public static void main(String[] args) {
        double[] numArray = { 67.2, 69.5, 23, 53.5, 24.1, 32, 52.7};
        double sum = 0;

        for (double num: numArray){
            sum += num;
        }

        double average = sum/ numArray.length;
        System.out.format("The average is: %.2f", average);

    }
}
