package az.baxtiyargil.solution.triangulationpolygon;

public class TriangulationPolygonMain {

    public static void main(String[] args) {
        var triangPoly = new TriangulationPolygon();
        test1(triangPoly);
        test2(triangPoly);
        test3(triangPoly);
        test4(triangPoly);
        test5(triangPoly);
        test6(triangPoly);
        test7(triangPoly);
        test8(triangPoly);
    }

    private static void test1(TriangulationPolygon triangPoly) {
        var sum = triangPoly.minScoreTriangulation(new int[]{1, 2, 3});
        System.out.println("Test 1: " + sum);
    }

    private static void test2(TriangulationPolygon triangPoly) {
        var sum = triangPoly.minScoreTriangulation(new int[]{3, 7, 4, 5});
        System.out.println("Test 2: " + sum);
    }

    private static void test3(TriangulationPolygon triangPoly) {
        var sum = triangPoly.minScoreTriangulation(new int[]{1, 3, 1, 4, 1, 5});
        System.out.println("Test 3: " + sum);
    }

    private static void test4(TriangulationPolygon triangPoly) {
        var sum = triangPoly.minScoreTriangulation(new int[]{3, 1, 2, 4, 6, 7, 8});
        System.out.println(sum);
    }

    private static void test5(TriangulationPolygon triangPoly) {
        var sum = triangPoly.minScoreTriangulation(new int[]{4, 3, 4, 3, 5});
        System.out.println(sum);
    }

    private static void test6(TriangulationPolygon triangPoly) {
        var sum = triangPoly.minScoreTriangulation(new int[]{2, 2, 2, 2, 1});
        System.out.println(sum);
    }

    private static void test7(TriangulationPolygon triangPoly) {
        var sum = triangPoly.minScoreTriangulation(new int[]{3, 1, 4, 5, 4});
        System.out.println(sum);
    }

    private static void test8(TriangulationPolygon triangPoly) {
        var sum = triangPoly.minScoreTriangulation(new int[]{5, 5, 5, 4, 2, 5});
        System.out.println(sum);
    }
}
