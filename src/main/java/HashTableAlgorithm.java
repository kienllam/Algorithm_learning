import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ken on 12/17/16.
 */
public class HashTableAlgorithm {
    public int lengthOfLongestSubString(String s){
        if (s == null || s.isEmpty()){
            return 0;
        }

        Set<Character> lookup = new HashSet<Character>();
        int start = 0;
        int maxLength = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (lookup.contains(c)){
                int j = start;
                while (s.charAt(j) != c && j < s.length()){
                    lookup.remove(s.charAt(j));
                    j++;
                }
                start = j + 1;
            }
            else{
                lookup.add(c);
            }
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }

    public int lengthOfLongestSubString(String s, int version){
        /**
         * abcabce
         *       ^
         *   ^
         * i = 0, 1, 2, 3, 4, 5
         * start = 0, 0, 0, 1, 2, 3
         * lookup = {["a", 0], ["b", 1], ["c", 2]}
         * maxLength = 1, 2, 3
         *
         * eee
         *   ^
         * i = 0, 1, 2
         * start = 0, 1, 2
         * lookup = {["e", 0], ["e", 1] }
         * maxLength = 1, 1
         *
         * abcbad
         * ^  ^
         * i = 0, 1, 2,
         * start = 0, 0, 0
         * lookup = {["a", 0], ["b", 1], ["c", 2]  }
         * maxLength = 1, 2, 3
         */

        if (s == null || s.isEmpty()){
            return 0;
        }

        int maxLength = 0;
        int start = 0;
        HashMap<Character, Integer> lookup = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (lookup.containsKey(c) && i >= start) {
                start = lookup.get(c) + 1;
            }
            lookup.put(c, i);

            maxLength = Math.max(maxLength, i - start + 1);
        }

        return maxLength;
    }
}
