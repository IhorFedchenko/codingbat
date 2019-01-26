package array1;

public class Solution {

    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public boolean sameFirstLast(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        return nums[0] == nums[nums.length - 1];
    }

    public int[] makePi() {
        return new int[]{3, 1, 4};
    }


    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
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

    public int[] reverse3(int[] nums) {
        int[] result = new int[3];
        result[0] = nums[2];
        result[1] = nums[1];
        result[2] = nums[0];
        return result;
    }

    public int[] maxEnd3(int[] nums) {
        if (nums[0] > nums[2]) {
            return new int[]{nums[0], nums[0], nums[0]};
        }

        if (nums[2] > nums[0]) {
            return new int[]{nums[2], nums[2], nums[2]};
        }
        return new int[]{nums[0], nums[0], nums[0]};
    }

    public int sum2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length < 2) {
            return nums[0];
        }
        return nums[0] + nums[1];
    }

    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public boolean has23(int[] nums) {
        return (nums[0] == 2 || nums[1] == 2) || (nums[0] == 3 || nums[1] == 3);
    }

    public boolean no23(int[] nums) {
        return !(nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3);
    }

    public int[] makeLast(int[] nums) {
        int[] result = new int[nums.length * 2];
        result[result.length - 1] = nums[nums.length - 1];
        return result;
    }

    public boolean double23(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        return nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3;
    }

    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
            return nums;
        }

        if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
            return nums;
        }
        return nums;
    }

    public int start1(int[] a, int[] b) {
        int result = 0;
        if (a.length > 0 && a[0] == 1) {
            result++;
        }
        if (b.length > 0 && b[0] == 1) {
            result++;
        }
        return result;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        if (a[0] + a[1] < b[0] + b[1]) {
            return b;
        }
        return a;
    }

    public int[] makeMiddle(int[] nums) {
        return new int[]{nums[(nums.length / 2) - 1], nums[(nums.length / 2)]};
    }

    public int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};
    }
}
