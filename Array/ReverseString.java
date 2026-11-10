public class ReverseString {
    public static void main(String[] args){
        ReverseString solution = new ReverseString();
        char[] s = {'h', 'e', 'l', 'l', 'o'}; // Example input
        solution.reverseString(s);
        System.out.print("Reversed string: ");
        for (char c : s) {
            System.out.print(c);
        }
    }

    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length -1;
        while( start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

    public void reverseString1(char[] s){
       int  l = s.length;
       for(int i =0; i<l/2; i++){
            char temp = s[i];
            s[i] = s[l-1-i];;
            s[l-1-i] = temp;;
       }
    }
    
}
