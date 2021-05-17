package Recursion;

public class factorial {

    //factorial using recursion
    public static int factUsingRecursion(int n){
        if(n == 0)
            return 1;
        else
            return factUsingRecursion(n-1)*n;
    }
    
    //factorial using loop
    public static int factUsingLoop(int n){
        int i;
        int fac = 1;
        for(i=n;i>=1;i--){
            fac = fac*i;
        }

        return fac;
        
    }
    public static void main(String[] args) {
        int a = 5;
        int res1 = factUsingRecursion(a);
        System.out.println(res1);
        int res2 = factUsingLoop(a);
        System.out.println(res2);

    }
}
