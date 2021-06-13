package Array;
import java.util.*;

public class SlidingWindow {
    
    public static int maxSum(int[] arr, int k, int size){
        if(size < k){
            return -1;
        }    

        int sum = 0;
        for(int i=0;i<k;i++)
            sum +=arr[i];

        int window_sum = sum;
        for(int i =k;i<size;i++){
            window_sum += arr[i] - arr[i-k];
            sum = Math.max(sum, window_sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,8,9,0};
        int k = 4;
        int size = arr.length;
        System.out.println("Maximum sum is : " + maxSum(arr,k,size));
    }
}
