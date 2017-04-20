import java.util.ArrayList;
import java.util.List;

/**
 * Created by ken on 4/19/17.
 */
public class Permutation {

    public List<List<Integer>> run(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (nums == null) {
            return result;
        }

        if (nums.length == 0) {
            result.add(new ArrayList<Integer>());
            return result;
        }
        List<Integer> list = new ArrayList<Integer>();
        permutationHelper(nums, list, result);
        return result;
    }

    private void permutationHelper(int[] nums, List<Integer> list, List<List<Integer>> result) {

        if (list.size() == nums.length) {
            result.add(new ArrayList<Integer>(list));
        }

        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            permutationHelper(nums, list, result);
            list.remove(list.size() - 1);
        }
    }
}
