package Tasks0._5_Strings;

//Program to Implement switch statement on strings

public class J09 {
    public static void main(String[] args) {

        String language = "Java";

        switch (language) {

            case "Java":
                System.out.println(language + " is famous for enterprise applications.");
                break;

            case "JavaScript":
                System.out.println(language + " is famous for frontend and backend.");
                break;

            case "Python":
                System.out.println(language + " is famous for ML and AI.");
                break;

            default:
                System.out.println(language + " not found on record.");
                break;
        }
    }
}

