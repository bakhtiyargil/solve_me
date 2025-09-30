package az.baxtiyargil.solution.triangulationpolygon;

public class TriangulationPolygon {

    int firstProduct = 1;
    int secondProduct = 1;

    public int minScoreTriangulation(int[] values) {
        int arrLength = values.length;
        if (arrLength < 3) {
            return firstProduct;
        }
        if (arrLength == 3) {
            for (int v : values) {
                firstProduct = v * firstProduct;
            }
            return firstProduct;
        }

        if (arrLength % 2 == 0) {
            for (int i = 0; i < arrLength - 1; ) {
                if (i == arrLength - 2) {
                    firstProduct = values[i] * values[arrLength - 1] * firstProduct;
                } else {
                    firstProduct = values[i] * firstProduct;
                }
                i += 2;
            }
        } else {
            for (int i = 0; i < arrLength - 1; ) {
                firstProduct = values[i] * firstProduct;
                i += 2;
            }
        }
        firstProduct = firstProduct + (values[0] * values[1] * values[2]);

        if (arrLength % 2 == 0) {
            for (int i = 1; i <= arrLength + 1; ) {
                if (i == arrLength+1) {
                    secondProduct = values[0] * values[arrLength - 1] * secondProduct;
                } else {
                    secondProduct = values[i] * secondProduct;
                }
                i += 2;
            }
        } else {
            for (int i = 0; i < arrLength - 1; ) {
                secondProduct = values[i] * secondProduct;
                i += 2;
            }
        }
        secondProduct = secondProduct + (values[1] * values[2] * values[3]);

        return Math.min(firstProduct, secondProduct);
    }
}
