package az.baxtiyargil.solution.icpc.yetanotherarray;

import java.util.Scanner;

public class YetAnotherArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int testCases = scanner.nextInt();
        for (int t = 0; t < testCases; t++) {
            int n = scanner.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextLong();
            long min = Long.MAX_VALUE;
            double mx = Math.pow(10, 18);

            for (long num : arr) {
                for (long j = 2; j <= mx; j++) {
                    if (findGcd(num, j) == 1) {
                        min = Math.min(min, j);
                        break;
                    }
                }
            }

            System.out.println(min == Long.MAX_VALUE ? -1 : min);
        }
    }

    private static long findGcd(long a, long b) {
        if (a > b) {
            return findGcd(b, a);
        }
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
