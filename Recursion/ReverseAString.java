package Recursion;

public class ReverseAString {
    
    public static String Rev(String str){
        if(str == "" ){
            return "";    
        }    
        return Rev(str.substring(1, str.length() - 1) ) + str.charAt(0);
    }

    public static void main(String[] args) {
        String a = "Hello";
        System.out.println(Rev(a));
    }
}
