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
    
}
