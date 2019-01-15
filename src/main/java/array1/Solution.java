package array1;

public class Solution {

    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length-1] == 6;
    }

    public boolean sameFirstLast(int[] nums) {
        if (nums.length == 0){
            return false;
        }
        return nums[0] == nums[nums.length-1];
    }

}
