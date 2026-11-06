import java.util.Random;

public class MergeSortAnArray {
    public static void main(String args[]){
        Random rand = new Random();
        int[] numbers = new int[100000];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before Sorting: ");
        
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

        mergeSort(numbers);
     
        System.out.println("\nAfter Sorting: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }

    public static void mergeSort(int[] numbers){
          
        int arrLength = numbers.length;
        int mid = arrLength / 2;
        int[] left = new int[mid];
        int[] right = new int[arrLength - mid];
        
        if (numbers.length < 2) {
            return;
        }

        for(int i=0; i<mid; i++){
            left[i] = numbers[i];
        }

        for(int i=mid; i<arrLength; i++){
            right[i - mid] = numbers[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(numbers, left, right);
          
    }

    public static void merge(int[] numbers, int[] left, int[] right){
        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0, j = 0, k = 0;
        while( i < leftSize && j < rightSize){
            if(left[i] <= right[j]){
                numbers[k] = left[i];
                i++;
            }else{
                numbers[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < leftSize){
            numbers[k] = left[i];
            i++;
            k++;
        }

        while(j < rightSize){
            numbers[k] = right[j];
            j++;
            k++;
        }
    }
}

