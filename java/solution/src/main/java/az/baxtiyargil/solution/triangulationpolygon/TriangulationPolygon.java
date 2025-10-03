package az.baxtiyargil.solution.triangulationpolygon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TriangulationPolygon {

    public int minScoreTriangulation(int[] values) {
        var min = minScoreTriangulation2(values);
        int[] shiftedValues = values.clone();
        for (int i = 0; i < values.length - 1; i++) {
            shiftedValues = shift(shiftedValues);
            var newMin = minScoreTriangulation2(shiftedValues);
            min = Math.min(min, newMin);
        }
        return min;
    }

    private int minScoreTriangulation2(int[] values) {
        int localSum = 0;
        var partialPolygon = new ArrayList<Integer>();
        int arrLength = values.length;
        if (arrLength < 3) {
            return 0;
        }
        if (arrLength == 3) {
            return localSum + (values[0] * values[1] * values[2]);
        }
        outer:
        for (int i = 0; i < arrLength - 1; ) {
            partialPolygon.add(values[i]);
            localSum = localSum + (values[i] * values[i + 1] * values[i + 2]);
            i += 2;
            if (i == arrLength - 1 || i == arrLength - 2) {
                partialPolygon.add(values[i]);
                if (arrLength == 4 || ((partialPolygon.size() + 1 == 4) && (arrLength != 5))) {
                    partialPolygon.add(values[arrLength - 1]);
                }
                localSum = localSum + minScoreTriangulation2(
                        partialPolygon.stream().mapToInt(Integer::intValue).toArray()
                );
                break outer;
            }
        }
        return localSum;
    }

    private int[] shift(int[] values) {
        //box int to Integer
        List<Integer> shifted = Arrays.stream(values)
                .boxed()
                .collect(Collectors.toList());
        //shift the first element to the end of the list
        shifted.add(shifted.removeFirst());

        //unbox Integer to int
        return shifted.stream().mapToInt(Integer::intValue).toArray();
    }
}
