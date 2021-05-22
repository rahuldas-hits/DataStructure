package Array;

public class BinarySearch {

    // declares and initialize an Array of integers.

    public static int binSearch(int low,int high,int key){
        int[] arr = new int[10];

        //assign an array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;
        arr[6] = 70;
        arr[7] = 80;
        arr[8] = 90;
        arr[9] = 100;
        //arr[10] = 110; 
        //binSearch(arr,)

        while(low <= high){
            int mid = ((low + high)/2);
            if(key == arr[mid]){
                return mid;
            }else if (key < arr[mid-1]){

                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int low = 0;
        int high = 9;
        int key = 50;
        int res = binSearch(low,high,key);
        System.out.print(res);
    }


}
