public class SecondLargestDigitInAString {
    public static void main(String args[]){
        //String str = "dfa12321afd";
        String str = "abc111"; 
        int result = new SecondLargestDigitInAString().secondHighest(str);
        System.out.println("Second largest digit in the string is: " + result);
    }
    public int secondHighest(String s) {
        int firstlargest = -1;
        int secondlargest = -1;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int digit = ch - '0';
                if(digit > firstlargest){
                    secondlargest = firstlargest;
                    firstlargest = digit;
                } else if(digit > secondlargest && digit != firstlargest){
                    secondlargest = digit;
                }
            }
        }
        if(secondlargest == -1){
            return -1;
        }
        
        return secondlargest;
    }
}
