public class TreeResursion {

    public static int func1(int n){
        if(n>0){
            System.out.print(n);
            //System.out.print(",");
            func1(n-1);
            func1(n-1);
        }
        return n;
    }

    public static void main(String[] args) {
        int n = 3;
        func1(n);
        //System.out.println("***"+ n);
    }
}
