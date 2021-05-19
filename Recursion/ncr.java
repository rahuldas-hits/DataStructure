package Recursion;

public class ncr {

    //using factorial

    //using recursion
    public static int ncr1(int n, int r){
        if(r == 0 || n == r)
            return 1;
        else 
            return ncr1(n-1,r-1) + ncr1(n-1,r);
    }

    public static void main(String[] args) {
        int n = 4;
        int r = 2;
        System.out.println("ncr1 value is "+ ncr1(n,r));
    }
    
}
