package personalisedmealplangenerator;


// Main Class
public class PersonalizedMealPlan {
    public static void main(String[] args) {
        MealPlanGenerator generator = new MealPlanGenerator();

        // Creating meal plans
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal("Vegetable Stir Fry"));
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal("Quinoa Salad"));
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal("Grilled Salmon with Avocado"));
        Meal<HighProteinMeal> proteinMeal = new Meal<>(new HighProteinMeal("Chicken Breast with Broccoli"));

        // Adding meals to generator
        generator.addMeal(vegMeal);
        generator.addMeal(veganMeal);
        generator.addMeal(ketoMeal);
        generator.addMeal(proteinMeal);

        // Display meal plans
        System.out.println("Personalized Meal Plans:");
        generator.displayMealPlans();

        // Validate meals
        System.out.println("\nValidating Meals:");
        System.out.println("Is " + vegMeal.getMeal().getMealName() + " valid? " + MealPlanGenerator.validateMeal(vegMeal.getMeal()));
        System.out.println("Is " + ketoMeal.getMeal().getMealName() + " valid? " + MealPlanGenerator.validateMeal(ketoMeal.getMeal()));
    }
}
