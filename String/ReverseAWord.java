package String;
import java.util.*;

public class ReverseAWord {

    public static String reverse(String sentence){
        String newSen = "";
        Stack<String> stk = new Stack<String>();
        int startIndex, endIndex =0 ;

        int size = sentence.length();

        if(size == 0)
            return "";
        
        startIndex = 0;
        for (int i = 0; i < size; i++) {
            
            if(sentence.charAt(i) == 32 || i == size-1){
                endIndex = i;
                int temp = endIndex;
                stk.push(sentence.substring(startIndex, endIndex+1));
                startIndex = temp;
                // System.out.print("this is whitespace");
            }
        }    

        while(!stk.isEmpty()){
            System.out.print(" "+ stk.pop() );
        }

        return newSen;
    }

    public static void main(String[] args) {
        String test = "Hello World Again";
        reverse(test);
    }
}
