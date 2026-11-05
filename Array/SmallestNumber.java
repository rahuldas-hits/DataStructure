public class SmallestNumber {
    public int findSmallestNumber(int[] arr){
        int smallest = 0 ;
        for(int i = 1;i<arr.length; i++){
            if(arr[i] <smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]){
        int arr[] = {-1, 2, -3, 4, -5};
        int result = new SmallestNumber().findSmallestNumber(arr);
        System.out.println("Smallest number in the array is: " + result);
    }
}
