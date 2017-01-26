/**
 * Created by ki3u3q6 on 1/24/17.
 */
public class Sqrt {

    public int run(int target) {

        long start = 1;
        long end = target;
        while (start  + 1 < end){
            long mid = start + (end - start) / 2;

            if (mid * mid <= target){
                start = mid;
            }
            else {
                end = mid;
            }
        }

        if (end * end <= target) {
            return (int) end;
        }
        return (int) start;
    }
}
