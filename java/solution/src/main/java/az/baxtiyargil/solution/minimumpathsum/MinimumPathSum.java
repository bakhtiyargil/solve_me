package az.baxtiyargil.solution.minimumpathsum;

public class MinimumPathSum {

    private static final int[][] arr = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
    private static final int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6}};
    private static final int[][] arr2 = new int[][]{{0, 0}, {0, 0}};
    private static final int[][] arr3 = new int[][]{{1, 2}, {1, 1}};

    public static void main(String[] args) {
        test();
    }

    private static int minPathSum(int rowIndex, int columnIndex, int[][] arr) {
        if (rowIndex == 0 && columnIndex == 0) {
            return arr[0][0];
        }

        int up = Integer.MAX_VALUE;
        int left = Integer.MAX_VALUE;

        if (rowIndex > 0) {
            up = minPathSum(rowIndex - 1, columnIndex, arr);
        }

        if (columnIndex > 0) {
            left = minPathSum(rowIndex, columnIndex - 1, arr);
        }

        return arr[rowIndex][columnIndex] + Math.min(up, left);
    }

    private static void test() {
        System.out.println(minPathSum(arr.length - 1, arr[0].length - 1, arr));
        System.out.println(minPathSum(arr1.length - 1, arr1[0].length - 1, arr1));
        System.out.println(minPathSum(arr2.length - 1, arr2[0].length - 1, arr2));
        System.out.println(minPathSum(arr3.length - 1, arr3[0].length - 1, arr3));
    }
}