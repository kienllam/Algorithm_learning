import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ken on 3/24/17.
 */
public class SubSet {

    public ArrayList<ArrayList<Integer>> run (int[] nums) {
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        if (nums == null) {
            return results;
        }

        if (nums.length == 0) {
            results.add(new ArrayList<Integer>());
            return results;
        }

        Arrays.sort(nums);
        ArrayList<Integer> subset = new ArrayList<Integer>();
        subsetHelper(nums, 0, subset, results);
        return results;
    }

    private void subsetHelper(int[] nums,
                              int startIndex,
                              ArrayList<Integer> subset,
                              ArrayList<ArrayList<Integer>> results) {

        results.add(new ArrayList<Integer>(subset));
        for (int i = startIndex; i < nums.length; i++) {
            subset.add(nums[i]);
            subsetHelper(nums, i + 1, subset, results);
            subset.remove(subset.size() - 1);
        }
    }
}
