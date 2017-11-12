import items.*;

public class MealBuilder {
    public Meal prepareDishI () {
        Meal meal = new Meal();
        meal.setName("Kurczak z ryzem. ");
        meal.addItem(new Kurczak());
        meal.addItem(new Ryz());
        meal.addItem(new Surowka());
        return meal;
    }

    public Meal prepareDishII () {
        Meal meal = new Meal();
        meal.setName("Schabowy z ziemniakami. ");
        meal.addItem(new Schabowy());
        meal.addItem(new Ziemniaki());
        meal.addItem(new Surowka());
        return meal;
    }

    public Meal prepareDishIII () {
        Meal meal = new Meal();
        meal.setName("Kurczak z frytkami. ");
        meal.addItem(new Kurczak());
        meal.addItem(new Frytki());
        meal.addItem(new Surowka());
        return meal;
    }
}
