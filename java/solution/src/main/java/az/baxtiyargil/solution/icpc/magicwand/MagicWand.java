package az.baxtiyargil.solution.icpc.magicwand;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MagicWand {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var allCount = scanner.nextInt();
        Map<Integer[][], Integer[]> toysMap = new LinkedHashMap<>();

        for (int i = 0; i < allCount; i++) {
            boolean hasOdd = false;
            boolean hasEven = false;
            var toySize = scanner.nextInt();
            Integer[] arr = new Integer[toySize];
            for (int j = 0; j < toySize; j++) {
                var num = scanner.nextInt();
                arr[j] = num;
                if (num % 2 == 0) hasEven = true;
                else hasOdd = true;
            }
            toysMap.put(new Integer[][]{{i}, {hasOdd && hasEven ? 1 : 0}}, arr);
        }

        toysMap.forEach((s, integers) -> {
            wandSort(integers, s[1][0] == 1);
            System.out.println();
        });
    }

    private static void wandSort(Integer[] arr, boolean sort) {
        if (sort) {
            Arrays.sort(arr);
        }
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
    }
}
