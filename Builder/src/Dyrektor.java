public class Dyrektor {
    private MealBuilder mealBuilder;

    public Dyrektor() {
        mealBuilder = new MealBuilder();
    }

    public Meal setDishI () {
        return mealBuilder.prepareDishI();
    }
    public Meal setDishII () {
        return mealBuilder.prepareDishII();
    }
    public Meal setDishIII () { return mealBuilder.prepareDishIII();
    }
}