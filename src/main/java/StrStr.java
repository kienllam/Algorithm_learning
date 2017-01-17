/**
 * Created by ken on 1/16/17.
 */
public class StrStr {
    public int run(String source, String target) {
        // write your code here
        if (source == null || target == null)
            return -1;

        if (source.length() < target.length()){
            return -1;
        }

        if(source.length() == 0 || target.length() == 0 ) {
            return 0;
        }

        int firstMatchIndex = 0;
        for (int i = 0, j = 0; i < source.length(); i++){
            if (source.charAt(i) == target.charAt(j)) {
                if (j == 0){
                    firstMatchIndex = i;
                }
                if (j == target.length() -1){
                    return firstMatchIndex;
                }
                j++;
            }
            else{
                if (j != 0 )
                    i--;
                j = 0;
            }
        }
        return -1;
    }
}
