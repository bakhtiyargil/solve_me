package az.baxtiyargil.solution.foodrating;

public class FoodRatings {

    private final String[] foods;
    private final String[] cuisines;
    private final int[] ratings;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        this.foods = foods;
        this.cuisines = cuisines;
        this.ratings = ratings;
    }

    public void changeRating(String food, int newRating) {
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(food)) {
                ratings[i] = newRating;
            }
        }
    }

    public String highestRated(String cuisine) {
        int highestRaiting = 0;
        StringBuilder highestRaitingFood = new StringBuilder();


        for (int i = 0; i < ratings.length; ++i) {
            if (cuisines[i].equals(cuisine)) {
                if (ratings[i] > highestRaiting) {
                    highestRaiting = ratings[i];
                    highestRaitingFood.setLength(0);
                    highestRaitingFood.append(foods[i]);
                } else if (ratings[i] == highestRaiting) {
                    if (foods[i].compareTo(highestRaitingFood.toString()) < 0) {
                        highestRaiting = ratings[i];
                        highestRaitingFood.setLength(0);
                        highestRaitingFood.append(foods[i]);
                    }
                }
            }
        }
        return highestRaitingFood.toString();
    }
}