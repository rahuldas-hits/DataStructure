package Array;

import java.util.HashSet;
import java.util.Set;

public class StringSegmentation {

    private static Set<String> dictionary = new HashSet<>();

    public static boolean word(String wrd){
        int size = wrd.length();

        if(size == 0)
        return true;

        for (int i = 1; i <= size; i++) {
            //System.out.println("substring is " + wrd.substring(0, i));
            //System.out.println("substring is " + wrd.substring(i, size));
            if( dictionary.contains(wrd.substring(0,i) ) && word(wrd.substring(i,size)) ) 
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String temp_dictionary[] = {"mobile","samsung","sam","sung",
                            "man","mango","icecream","and",
                            "go","i","like","ice","cream"};

        for (String string : temp_dictionary) {
            dictionary.add(string);
        }

        System.out.println(word("cream"));

        // for (int i = 0; i < temp_dictionary.length; i++) {
        //     System.out.println(temp_dictionary[i]);
        // }
    }
}
