package Array;

public class LinearSearch {

    public static int src(int num){
        // declares and initialize an Array of integers.
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
        
        System.out.println("calling the display function");

        for(int i=0;i<arr.length;i++){
            if(num == arr[i]){
                System.out.println("Index value is " + i);
                move(arr,i);
                return 1;
            }
        }
        //display(arr);
        return 0;
    }


    public static void move(int[] arr, int index){
        for(int i=0;i<arr.length;i++){
            
            //System.out.println("Index value in called function is " + index);
            //System.out.println("Index value in called function is " + i);
            //move index n to n-1 and n to n+1
            if(i == index){
                int temp = arr[index-1];
                arr[index-1] = arr[index];
                arr[index] = temp;
                display(arr);
            }
            //display(arr);
        }
    }

    public static void display(int [] arry){
        for(int i=0; i < arry.length-1; i++){
            System.out.println(arry[i]);
        }
        //return 0;
    }

    public static void main(String[] args) {
        int a = 70;
        //System.out.println(src(a));
        int res = src(a);
        if(res == 1){
            System.out.println("Found!!!!!");
        }else{
            System.out.println("Not Found!!!!!");
        }
    }
}
