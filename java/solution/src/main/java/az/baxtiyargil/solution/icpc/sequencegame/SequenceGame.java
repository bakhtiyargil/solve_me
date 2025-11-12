package az.baxtiyargil.solution.icpc.sequencegame;

import java.util.Arrays;
import java.util.Scanner;

public class SequenceGame {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int testCases = scanner.nextInt();
        for (int t = 0; t < testCases; t++) {
            int n = scanner.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextLong();
            int x = scanner.nextInt();
            yesNo(arr, x);
        }
    }

    private static void yesNo(long[] arr, long x) {
        Arrays.sort(arr);
        var min = arr[0];
        var max = arr[arr.length - 1];

        if (x >= min && x <= max) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
