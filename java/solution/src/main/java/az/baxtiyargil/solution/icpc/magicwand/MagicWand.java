package az.baxtiyargil.solution.icpc.magicwand;

import java.util.Arrays;

public class MagicWand {

    private static final int[] integers1 = {2, 3, 1, 4};
    private static final int[] integers2 = {3, 2, 1, 3, 4};
    private static final int[] integers3 = {3, 7, 5, 1};
    private static final int[] integers4 = {1000000000, 2};
    private static final int[] integers5 = {1, 3, 5};
    private static final int[] integers6 = {2, 5, 3, 1, 7};
    private static final int[] integers7 = {2, 4, 8, 6};

    public static void main(String[] args) {
        wandSort(integers1);
        wandSort(integers2);
        wandSort(integers3);
        wandSort(integers4);
        wandSort(integers5);
        wandSort(integers6);
        wandSort(integers7);
    }

    private static void wandSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] % 2 != arr[j] % 2) {
                    if (arr[i] > arr[j]) {
                        var a = arr[i];
                        var b = arr[j];
                        arr[i] = b;
                        arr[j] = a;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
