package Recursion;
public class Fibonacci {
    
    //O( 2pow(n) )
    public static int fibo(int n){
        if(n<=1){
            return n;
        }
        return fibo(n-2) + fibo(n-1);
    }

    //using memoization  O(n)
    static int[] intArray = new int[]{ -1,-1,-1,-1,-1,-1,-1,-1,-1,-1 };
    public static int fib(int n){
        if(n <= 1){
            intArray[n] = n;
            return n;
        }else{
            if(intArray[n-2] == -1 )
                intArray[n-2] = fib(n-2);
            if(intArray[n-1] == -1 )
                intArray[n-1] = fib(n-1);
            return intArray[n-2] + intArray[n-1];
        }   
    }

    public static void main(String[] args) {
        int a = 5;
        System.out.println(fibo(a));
        System.out.println(fib(a));
    }
}
