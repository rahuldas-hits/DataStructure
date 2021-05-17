// Recursion program to understand the flow only

class TailHead{

    public static void fun1(int x){
        if (x > 0) {
            System.out.println("func1 Value is : " + x);
            fun1(x-1);    
        }
    }

    public static void fun2(int x){   
        if (x > 0) {
            System.out.println("func2 Value is : " + x);
            fun2(x-1);    
        }
    }

    public static void main(String args[]){
        System.out.println("Tail Head");
        int a = 3;
        fun1(a);
        fun2(a);
        
    }
}