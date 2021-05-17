package Recursion;

public class NestedRecursion {
    public static int Rec(int n){
        if(n>100)
            return n-10;
        else
            return Rec(Rec(n+11));  
        
    }

    public static void main(String[] args) {
        int result = Rec(99);
        System.out.println(result);
    }
}
