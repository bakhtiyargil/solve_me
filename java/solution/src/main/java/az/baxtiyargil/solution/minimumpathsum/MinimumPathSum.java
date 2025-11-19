package az.baxtiyargil.solution.minimumpathsum;

import java.util.Arrays;

public class MinimumPathSum {

    private static final int[][] arr = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
    private static final int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6}};
    private static final int[][] arr2 = new int[][]{{0, 0}, {0, 0}};
    private static final int[][] arr3 = new int[][]{{1, 2}, {1, 1}};

    public static void main(String[] args) {
        int[][] dp = new int[arr.length][arr[0].length];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(minPathSum(arr.length - 1, arr[0].length - 1, arr, dp));
    }

    private static int minPathSum(int rowIndex, int columnIndex, int[][] arr, int[][] dp) {
        if (rowIndex == 0 && columnIndex == 0) {
            return arr[0][0];
        }
        if (dp[rowIndex][columnIndex] != -1) {
            return dp[rowIndex][columnIndex];
        }

        int up = Integer.MAX_VALUE;
        int left = Integer.MAX_VALUE;
        if (rowIndex > 0) {
            up = minPathSum(rowIndex - 1, columnIndex, arr, dp);
        }
        if (columnIndex > 0) {
            left = minPathSum(rowIndex, columnIndex - 1, arr, dp);
        }
        dp[rowIndex][columnIndex] = arr[rowIndex][columnIndex] + Math.min(up, left);
        return dp[rowIndex][columnIndex];
    }
}