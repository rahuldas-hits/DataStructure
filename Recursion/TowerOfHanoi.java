package Recursion;

public class TowerOfHanoi {

    public static void TOH(int n,int a, int b, int c){
        if(n>0){
            TOH(n-1,a,c,b);
            System.out.println("from " + a + " -> " + c);
            TOH(n-1,b,a,c);
        }
        
    }

    public static void main(String[] args) {
        int n = 3;
        int a = 1;
        int b = 2;
        int c = 3; 
        TOH(n,a,b,c);
    }
    
}
