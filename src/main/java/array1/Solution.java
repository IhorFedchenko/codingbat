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

    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public int[] rotateLeft3(int[] nums) {
        int[] result = new int[3];
        result[2] = nums[0];
        result[0] = nums[1];
        result[1] = nums[2];
        return result;
    }
}