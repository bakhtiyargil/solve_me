package az.baxtiyargil.solution.minimumpathsum;

public class MinimumPathSum {

    private static final int[][] arr = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
    private static final int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6}};

    public static void main(String[] args) {
        test();
    }

    private static int minPathSum(int i, int j, int[][] arr) {
        int next1 = 0;
        int next2 = 0;

        if (i != 0 && j != 0) {
            next1 = arr[i - 1][j];
            next2 = arr[i][j - 1];
        } else if (i == 0 && j == 0) {
            return arr[0][0];
        } else if (j == 0) {
            next2 = arr[i - 1][j];
        } else {
            next1 = arr[i][j - 1];
        }

        if (next2 > next1) {
            return arr[i][j] + minPathSum(i - 1, j, arr);
        } else {
            return arr[i][j] + minPathSum(i, j - 1, arr);
        }
    }

    private static void test() {
        System.out.println(minPathSum(arr.length - 1, arr[0].length - 1, arr));
        System.out.println(minPathSum(arr1.length - 1, arr1[0].length - 1, arr1));
    }
}