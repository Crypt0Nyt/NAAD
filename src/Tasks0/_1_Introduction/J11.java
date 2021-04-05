package Tasks0._1_Introduction;

//Program to Find the Frequency of Character in a String

public class J11 {
    public static void main(String[] args) {
        String str = "I am awesome";
        char ch = 'a';
        int count = 0;

        for(int i=0; i< str.length() ; i++ ){
            if(ch == str.charAt(i)){
                ++count;
            }
        }
        System.out.println("The frequency of the character a is: " + count);
    }

}
