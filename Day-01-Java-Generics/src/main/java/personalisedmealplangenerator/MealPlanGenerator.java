package personalisedmealplangenerator;
import java.util.ArrayList;
import java.util.List;

// Meal Plan Generator
class MealPlanGenerator {
    public List<Meal<? extends MealPlan>> mealPlans = new ArrayList<>();

    public void addMeal(Meal<? extends MealPlan> meal) {
        mealPlans.add(meal);
    }

    public void displayMealPlans() {
        for (Meal<? extends MealPlan> meal : mealPlans) {
            System.out.println(meal);
        }
    }

    // Generic Method to validate a meal
    public static <T extends MealPlan> boolean validateMeal(T meal) {
        return meal.getMealName() != null && !meal.getMealName().isEmpty();
    }
}
