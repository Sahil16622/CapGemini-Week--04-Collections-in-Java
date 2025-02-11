package personalisedmealplangenerator;

// Generic Meal Class
class Meal<T extends MealPlan> {
    private T meal;

    public Meal(T meal) {
        this.meal = meal;
    }

    public T getMeal() {
        return meal;
    }

    @Override
    public String toString() {
        return "Meal: " + meal.getMealName();
    }
}