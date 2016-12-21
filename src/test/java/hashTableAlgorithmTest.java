import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by ken on 12/17/16.
 */


public class hashTableAlgorithmTest {

    @Test
    public void testLengthOfLongestSubString(){
        //assertEquals(3, new HashTableAlgorithm().lengthOfLongestSubString("abcabcbb"));
        //assertEquals(3, new HashTableAlgorithm().lengthOfLongestSubString("pwwkew"));
        assertEquals(1, new HashTableAlgorithm().lengthOfLongestSubString("eeee", 1));
    }


}
