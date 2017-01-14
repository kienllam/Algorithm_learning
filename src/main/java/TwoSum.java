import java.util.HashMap;
import java.util.Map;

/**
 * Created by ken on 12/28/16.
 */


public class TwoSum {
    /*
    give a array of integer and target number. find out the sum of two numbers equal to target but return the number not the indexes

    solution:
    1) using a hash table, a key will be number, and value will be the index.
    2) a for loop will condition length of the array,
    3) inside the loop need a if condition with the logic target - value of the current index
        and check the result with the hash table.
        * if we found the hash table contain the key equal to the value of target - value of current index
        * that mean we found the second number that can add with first number and equal to the target
     */

    public int[] run(int[] nums, int target){
        int[] res = new int[2];

        Map<Integer, Integer> lookup = new HashMap<Integer, Integer>();

        if (nums == null || nums.length < 2){
            return res;
        }

        for (int i = 0; i < nums.length; i++){
            lookup.put(nums[i], i);
        }

        for (int index1 = 0; index1 < nums.length; index1++){
            if (lookup.containsKey(target - nums[index1])){
                int index2 = lookup.get(target - nums[index1]);
                if (index1 != index2){
                    res[0] = nums[index1];
                    res[1] = nums[index2];
                }
            }
            else {
                lookup.put(nums[index1], index1);
            }
        }
        return res;
    }


    public int[] run (int[] nums, int target, int version){

        int[] res = new int[2];
        if (nums == null || nums.length < 0)
            return res;

        Map<Integer, Integer> lookups = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            if (lookups.containsKey(nums[i])){
                res[0] = lookups.get(nums[i]);
                res[1] = i;
            }
            else {
                lookups.put(target - nums[i], i);
            }
        }
        return res;
    }
}
