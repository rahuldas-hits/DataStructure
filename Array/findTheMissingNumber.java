package Array;

public class findTheMissingNumber {

    public static int sumOfNatNum(int[] A){
        int sum = 0;
        int n = A.length + 1;
        sum = (n*(n+1))/2;

        int total = 0;
        for(int i =0;i<A.length;i++){
            total = total + A[i];
        }

        int val = sum-total;
        return val;
    }


    public static void main(String[] args) {
        int[] a = new int[] {1,3,4,2,6,7};
        System.out.println("Missing Number is ::" + sumOfNatNum(a) );
    }
}
