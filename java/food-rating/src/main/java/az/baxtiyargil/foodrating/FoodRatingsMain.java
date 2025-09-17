package az.baxtiyargil.foodrating;

public class FoodRatingsMain {
    public static void main(String[] args) {
        wrong1();
    }

    public static void test() {
        FoodRatings foodRatings = new FoodRatings(
                new String[]{"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"},
                new String[]{"korean", "japanese", "japanese", "greek", "japanese", "korean"},
                new int[]{9, 12, 8, 15, 14, 7});
        System.out.println(foodRatings.highestRated("korean"));
        System.out.println(foodRatings.highestRated("japanese"));

        foodRatings.changeRating("sushi", 16);
        System.out.println(foodRatings.highestRated("japanese"));

        foodRatings.changeRating("ramen", 16);
        System.out.println(foodRatings.highestRated("japanese"));

    }

    public static void wrong1() {
        FoodRatings foodRatings = new FoodRatings(
                new String[]{"emgqdbo","jmvfxjohq","qnvseohnoe","yhptazyko","ocqmvmwjq"},
                new String[]{"snaxol","snaxol","snaxol","fajbervsj","fajbervsj"},
                new int[]{2,6,18,6,5});

        foodRatings.changeRating("qnvseohnoe", 11);
        System.out.println(foodRatings.highestRated("fajbervsj"));

        foodRatings.changeRating("emgqdbo", 3);
        foodRatings.changeRating("jmvfxjohq", 9);
        foodRatings.changeRating("emgqdbo", 14);

        System.out.println(foodRatings.highestRated("fajbervsj"));
        System.out.println(foodRatings.highestRated("snaxol"));
    }

    public static void wrong2() {
        FoodRatings foodRatings = new FoodRatings(
                new String[]{"cpctxzh", "bryvgjqmj", "wedqhqrmyc", "ee", "lafzximxh", "lojzxfel", "flhs"},
                new String[]{"wbhdgqphq", "wbhdgqphq", "mxxajogm", "wbhdgqphq", "wbhdgqphq", "mxxajogm", "mxxajogm"},
                new int[]{15, 5, 7, 16, 16, 10, 13});

        foodRatings.changeRating("lojzxfel", 1);
        System.out.println(foodRatings.highestRated("mxxajogm"));
        System.out.println(foodRatings.highestRated("wbhdgqphq"));
        System.out.println(foodRatings.highestRated("mxxajogm"));
    }
}
