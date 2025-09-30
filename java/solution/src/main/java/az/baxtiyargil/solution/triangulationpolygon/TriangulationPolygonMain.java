package az.baxtiyargil.solution.triangulationpolygon;

public class TriangulationPolygonMain {

    public static void main(String[] args) {
        var triangPoly = new TriangulationPolygon();
        test3(triangPoly);
    }

    private static void test1(TriangulationPolygon triangPoly) {
        var sum = triangPoly.minScoreTriangulation(new int[]{3, 7, 4, 5});
        System.out.println(sum);
    }

    private static void test2(TriangulationPolygon triangPoly) {
        var sum = triangPoly.minScoreTriangulation(new int[]{1, 2, 3});
        System.out.println(sum);
    }

    private static void test3(TriangulationPolygon triangPoly) {
        var sum = triangPoly.minScoreTriangulation(new int[]{1, 3, 1, 4, 1, 5});
        System.out.println(sum);
    }
}
