public class MergeSortedArray {
    public static void main(String args[]){
        int[] num1 = {1, 3, 5, 7, 9};
        int[] num2 = {2, 4, 6, 8, 10};
        int m = num1.length;
        int n = num2.length;
        int[] mergedArray = merge(num1, m, num2, n);
        System.out.println("Merged Array: ");
        for(int i = 0; i < mergedArray.length; i++){
            System.out.print(mergedArray[i] + " ");
        }
    }    

    public static int[] merge(int[] num1, int m , int[] num2, int n){
        int i=0, j=0, k=0;
        int[] mergedArray = new int[m+n];
        while(i < m && j < n){
            if(num1[i] < num2[j]){
                mergedArray[k] = num1[i];
                i++;
            }else{
                mergedArray[k] = num2[j];
                j++;
            }
            k++;
        }
        while(i < m){
            mergedArray[k] = num1[i];
            i++;
            k++;
        }
        while(j < n){
            mergedArray[k] = num2[j];
            j++;
            k++;
        }
        return mergedArray;
    }

    public static void mergeInPlace(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;     // Last valid element in nums1
        int j = n - 1;     // Last element in nums2
        int k = m + n - 1; // Last available index in nums1

        // Compare from the back and place the larger element at index k
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // Copy remaining elements from nums2 (if any)
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
