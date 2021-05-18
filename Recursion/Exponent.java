package Recursion;

public class Exponent {
    //using Recursion
    public static int powUsingRecursion(int m, int n){
        if(n==0)
            return 1;    
        if(n%2==0)            
            //return pow((m*m))*(n/2);
            return powUsingRecursion(m*m,n/2);
        else            
            return m*powUsingRecursion(m*m,(n-1)/2);
            //return m*pow((m*m))*(n-1/2);
    }

    //using loop method
    public static int powUsingLoop(int m , int n){
        int pow = 1;
        while(n >= 1){
            pow = pow * m;
            n--;
        }
        return pow;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        int res = powUsingRecursion(a,b);
        System.out.println("Output of exponent using recursion " + res);
        int res2 = powUsingLoop(a,b);
        System.out.println("Output of exponent using loop " + res2);
    }
}
