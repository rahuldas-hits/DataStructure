import java.util.function.Function;

// Your First Program

class TailHead{

    public static void fun1(int x){
        
        if (x > 0) {
            System.out.println("Value is : " + x);
            fun1(x-1);    
        }

    }
    public static void main(String args[]){
        System.out.println("Tail Head");
        int a = 3;
        fun1(a);
        
    }
}