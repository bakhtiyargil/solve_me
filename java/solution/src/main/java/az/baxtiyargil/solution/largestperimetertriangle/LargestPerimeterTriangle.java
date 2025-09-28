package az.baxtiyargil.solution.largestperimetertriangle;

import java.util.Arrays;

public class LargestPerimeterTriangle {

    public static void main(String[] args) {
        int per = largestPerimeter(new int[]{2, 1, 2});
        System.out.println(per);
    }

    public static int largestPerimeter(int[] nums) {
        if (nums == null || nums.length < 3) {
            return 0;
        }
        Arrays.sort(nums);
        for (int lastIndex = nums.length - 1; lastIndex > 0; lastIndex--) {
            if (nums[lastIndex] < nums[lastIndex - 1] + nums[lastIndex - 2]) {
                return nums[lastIndex] + nums[lastIndex - 1] + nums[lastIndex - 2];
            }
            if (lastIndex - 2 == 0) {
                break;
            }
        }
        return 0;
    }
}
