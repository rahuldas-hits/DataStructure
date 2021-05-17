package Recursion;

public class SumOfNNumber {

    //using recursion
    public static int sumOfNaturalNumberUsingRecursion(int n){
        if(n==0)
            return 0;
        else
            return sumOfNaturalNumberUsingRecursion(n-1) + n;
    }

    //using loop
    public static int sumOfNaturalNumberUsingLoop(int n){
        int i = 1;
        int sum = 0;
        for(i = 1; i <= n;i++){
            sum = sum + i;
        }
        return sum;
    }

    //using formula
    public static int sumOfNaturalNumberUsingFormula(int n){
        if(n > 1 ){
            return (n*(n+1))/2;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        int a = 3;
        int res = sumOfNaturalNumberUsingRecursion(a);
        System.out.println("Sum using recursive "+res);
        int res1 = sumOfNaturalNumberUsingLoop(a);
        System.out.println("Sum using loop "+res1);
        int res2 = sumOfNaturalNumberUsingFormula(a);
        System.out.println("Sum using formula "+res2);
    }
}
