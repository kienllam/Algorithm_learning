/**
 * Created by ki3u3q6 on 1/19/17.
 */
public class LastPosition {

    public int run(int[] nums, int target){

        if (nums == null || nums.length < 0){
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start + 1 < end){
            int mid = start + (end - start) / 2;
            if (nums[mid] == target){
                start = mid;
            }
            else if (nums[mid] < target){
                start = mid;
            }
            else{
                end = mid;
            }
        }

        if (nums[start] == target){
            return start;
        }

        if (nums[end] == target){
            return end;
        }

        return -1;
    }
}
