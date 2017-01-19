/**
 * Created by weichueng on 1/19/17.
 */

import java.util.Arrays;
/*
   Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

   solution:
   1) a for loop will condition length of the array, create next index
   2  check the index value = 0 and make sure the next index is not outofranger
   3) check next index value is  not equal 0, than change next index value to current index value, set next index value = 0
   4) if next index value equal, than i using while check the next index value when the value not equal 0
    */
public class MoveZeroes {
    public static void Run(int[] nums) {
        // Write your code here
        for(int i = 0; i < nums.length; i++)
        {
            int j = i +1;
            if(nums[i]==0 && j < nums.length)
            {

                if(nums[j] != 0)
                {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
                else
                {
                    while (nums[j] == 0 && j < nums.length -1)
                    {
                        j++;
                    };

                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
        }
    }
}
