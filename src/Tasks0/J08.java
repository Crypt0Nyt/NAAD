package Tasks0;
//Program to Check Whether an Alphabet is Vowel or Consonant
public class J08 {
    public static void main(String[] args) {
        char ch = 'g';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");

        }
    }
}