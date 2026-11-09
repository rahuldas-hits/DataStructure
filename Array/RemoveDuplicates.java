public class RemoveDuplicates {
    
    public static void main(String[] args) {
        RemoveDuplicates solution = new RemoveDuplicates();
        int[] nums = {1,1,1, 1, 2, 2, 3, 4, 4, 5}; // Example input
        int newLength = solution.removeDuplicatesFromArray(nums);
        System.out.println("New length after removing duplicates: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeDuplicatesFromArray(int[] nums) {
        int count = 0;
        for(int i =0; i< nums.length; i++){
            if (i < nums.length-1 && nums[i] == nums[i+1] ){
                continue;
            }else{
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
