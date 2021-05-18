package Recursion;

public class Taylor {
    
    static double p=1;
    static double f=1;
    
    public static double TaylorSeries(double x, double n){
        if(n==0){
            return 1;
        }else{
            double r = TaylorSeries(x,n-1);
            p = p*x;
            f = f*n;
            return r + (p/f);
        }
    }

    public static void main(String[] args) {
        double a = 1;
        double b = 10;
        double res = TaylorSeries(a,b);
        System.out.println(res);
    }

}
