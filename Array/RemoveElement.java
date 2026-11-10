public class RemoveElement {
    public static void main(String[] args){
        int[] nums = {1, 3,2,2,3,2};
        int val = 3;
        RemoveElement solution = new RemoveElement();
        int newLength = solution.removeElement(nums, val);
        for(int i=0; i < newLength; i++){
            System.out.print(nums[i] + " ");
        }

        System.out.println("\nNew length after removing " + val + ": " + newLength);

        for(int i=0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }

    // public int removeElement(int[] nums, int val){
    //     int count = 0;
    //     for(int i=0; i < nums.length;i++){
    //         if(nums[i] != val){
    //             count++;
    //         }else{
    //             nums[i] = nums[nums.length-1];
    //             i--;
    //             nums = java.util.Arrays.copyOf(nums, nums.length-1);
    //         }
    //     }
    //     return count;
    //  }

      public int removeElement(int[] nums, int val) {
       int k = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k;
    }
}
