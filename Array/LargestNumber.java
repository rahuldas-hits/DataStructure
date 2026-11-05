public class LargestNumber {
    
    public int findLargestNumber(int[] arr){
        int largest = arr[0];
        for(int i = 0;i<arr.length; i++){
            if(arr[i] >largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String args[]){
        int arr[] = {0,-1, -2, -3, -4, -5};
        int result = new LargestNumber().findLargestNumber(arr);
        System.out.println("Largest number in the array is: " + result);
    }
}
