package Tasks0._1_Introduction;

//Program to find the roots of the quadratic equations

public class J10 {
    public static void main(String[] args) {
        //a, b, c are the coefficients of a quadratic equation
        double a = 1, b = -4, c = 4;
        double D = (b * b) - (4 * a * c);

        //if roots are real and distinct or equal
        if (D >= 0)
        {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Roots of the equation are: " + root1 + " and " + root2);
        }

        //if roots are imaginary
        else
        {
            double realPart = -b / (2 * a);
            double imgPart = (Math.sqrt(D)) / (2 * a);
            System.out.println("Roots of the equation are: " + realPart + "+" + imgPart + "i and " + realPart + "+" + imgPart + "i");
        }
    }


}

