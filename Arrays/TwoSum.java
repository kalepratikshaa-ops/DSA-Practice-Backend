package Arrays;
import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
    public static int[] TwoSum(int[] nums, int target){
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if (map.containsKey(complement)){
                return new int[] {map.get(complement),i};

            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    public static void main (String[] args){
        int[] nums = {2,3,4,5,23};
        int target=5;
        int[] result=TwoSum(nums,target);
        System.out.println("Indices:"+Arrays.toString(result));

    }
    
}
