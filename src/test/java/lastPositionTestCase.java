import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ki3u3q6 on 1/19/17.
 */
public class lastPositionTestCase {


    @Test
    public void test(){
        int[] testData = new int[]{1,2,2,3,4,5,6};
        assertEquals(5, new LastPosition().run(testData, 5) );
    }
}
