public class StaticGlobal {

    public static int fun(int n){
        if(n > 0 ){
            return fun(n-1) + n;
        }
        return n;
    }

    //Static varaiable
    public static int x;
    public static int fun2(int n){
        if(n > 0 ){
            x++;
            return fun2(n-1) + x;
        }
        return n;
    }


    //Global variable
    public static int y;
    public static int fun3(int n){
        if(n > 0 ){
            y++;
            return fun3(n-1) + y;
        }
        return n;
    }


    public static void main(String[] args) {
        int x = 5;
        int res = fun(x);
        int res2 = fun2(x);
        int res4 = fun2(x);
        int res3 = fun3(x);
        int res5 = fun3(x);
        System.out.println("Result is " + res);
        System.out.println("Result is " + res2);
        System.out.println("Result is " + res4);
        System.out.println("Result is " + res3);
        System.out.println("Result is " + res5);
    }
}
