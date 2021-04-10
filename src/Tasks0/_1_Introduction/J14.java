package Tasks0._1_Introduction;

//Program to Check if a String is Empty or Null

public class J14 {
    public static void main(String[] args) {
        String string1 = null;
        String string2 = "";
        String string3 = " ";

        System.out.println("string1 is " + isNullEmpty(string1));

        System.out.println("string2 is " + isNullEmpty(string2));

        System.out.println("string3 is " + isNullEmpty(string3));

    }
    public static String isNullEmpty(String string){
        if(string == null){
            return "Null";
        }
        else if(string.trim().isEmpty()){
            return "Empty";
        }
        else{
            return "Neither Null nor empty";
        }
    }

}
