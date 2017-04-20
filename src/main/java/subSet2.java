import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ken on 4/17/17.
 */
public class subSet2 {
    /**
     * Problem: Given a collection of integers that might contain duplicates, nums, return all possible subsets
     * Note: The solution set must not contain duplicate subsets
     * @return
     */
    public ArrayList<ArrayList<Integer>> run (int[] nums) {
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();

        if (nums == null || nums.length == 0) {
            return results;
        }

        Arrays.sort(nums);

        ArrayList<Integer> subset = new ArrayList<Integer>();
        subsetHelper(nums, 0, subset, results);
        return results;
    }

    public void subsetHelper(int[] nums,
                             int startIndex,
                             ArrayList<Integer> subset,
                             ArrayList<ArrayList<Integer>> results) {
        // deep copy subset & add to results
        results.add(new ArrayList<Integer>(subset));

        for (int i = startIndex; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1] && i > startIndex) {
                continue;
            }
            subset.add(nums[i]);
            subsetHelper(nums, i+1, subset, results);
            subset.remove(subset.size() - 1);

        }
    }
}



