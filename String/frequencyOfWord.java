package String;

import java.util.Map;
import java.util.TreeMap;

public class frequencyOfWord {

    public static void findFrequncy(String str){
        
        Map<String,Integer> mp = new TreeMap<>();

        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i])+1);
            }else{
                mp.put(arr[i], 1);
            }
        }

        int max = 0;
        for (Map.Entry<String,Integer> entry :mp.entrySet() ){
            //System.out.println(entry.getKey() + "- " +entry.getValue());
            if(max < entry.getValue()){
                max = entry.getValue();
            }
            
        }
        System.out.println("max valie is" +max);
     //   return max;
    }

    public static void main(String[] args) {
        String str = "Consequat adipisicing consectetur minim labore Consequat adipisicing consectetur minim labore";
        findFrequncy(str);
    }
    
}
