public class MoveZeros {

    public static void main(String args[]) {
        int[] arr = {0,10,3,12};
        moveZero(arr);
        System.out.println("After moving zeros to the end of the array");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void moveZero(int[] arr) {
        int n= arr.length;

        int k = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0 ){
                arr[k] = arr[i];
                k++;
            }
        }
        while(k < n) {
            arr[k] = 0;
            k++;
        }
    }
}

