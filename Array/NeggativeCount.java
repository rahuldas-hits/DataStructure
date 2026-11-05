public class NeggativeCount {
    
   
    public static void main(String args[]){
        int arr[] = {-1, 2, -3, 4, -5};
        int result = new NeggativeCount().countNegatives(arr);
        System.out.println("Count of negative numbers in the array is: " + result);
    }
     public int countNegatives(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        return count;
    }
}
