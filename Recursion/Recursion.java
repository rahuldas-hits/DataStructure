package Recursion;

public class Recursion {
    public static int function1(int a){
        if(a>0){
            System.out.println(a);
            function2(a-1);
        }
        return a;
    }

    public static int function2(int b){
        if(b>1){
            System.out.println(b);
            function1(b/2);
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 20;
        function1(n); 
    }
}
