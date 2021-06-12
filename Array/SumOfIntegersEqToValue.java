package Array;
import java.util.Set;
import java.util.HashSet;

public class SumOfIntegersEqToValue {
    
    static boolean findSumOfTwo(int[] A, int val){
        Set<Integer> foundval = new HashSet<Integer>();
        for(Integer a : A){
            if(foundval.contains(val-a)){
                return true; 
            }
            foundval.add(a);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] v = new int[] {5, 7, 1, 2, 8, 4, 3};
        int[] test = new int[] {3, 20, 1, 2, 7};
        for(int i = 0; i<test.length; i++){
            boolean output = findSumOfTwo(v, test[i]);
            System.out.println(output);
        }
        
    }

}
