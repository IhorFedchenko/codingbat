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

    public int[] makePi() {
        return new int[]{3,1,4};
    }


    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length-1] == b[b.length-1];
    }

}
