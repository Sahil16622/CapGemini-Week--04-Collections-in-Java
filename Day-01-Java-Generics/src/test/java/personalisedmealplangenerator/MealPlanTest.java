package personalisedmealplangenerator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class MealPlanTest {

    @Test
    void testMealCreation() {
        // Creating meal objects
        VegetarianMeal vegMeal = new VegetarianMeal("Vegetable Stir Fry");
        VeganMeal veganMeal = new VeganMeal("Quinoa Salad");

        // Checking meal names
        assertEquals("Vegetable Stir Fry", vegMeal.getMealName());
        assertEquals("Quinoa Salad", veganMeal.getMealName());
    }

    @Test
    void testMealValidation() {
        // Creating meals
        VegetarianMeal validMeal = new VegetarianMeal("Grilled Paneer");
        VeganMeal invalidMeal = new VeganMeal(""); // Invalid meal (empty name)

        // Validating meals
        assertTrue(MealPlanGenerator.validateMeal(validMeal));
        assertFalse(MealPlanGenerator.validateMeal(invalidMeal));
    }

    @Test
    void testMealPlanGenerator() {
        MealPlanGenerator generator = new MealPlanGenerator();

        // Adding a meal
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal("Vegetable Curry"));
        generator.addMeal(vegMeal);

        // Ensuring the meal is added (size should be 1)
        assertEquals(1, generator.mealPlans.size());
    }

    @Test
    void testDisplayMealPlans() {
        MealPlanGenerator generator = new MealPlanGenerator();
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal("Avocado Toast"));
        generator.addMeal(veganMeal);

        // Capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        generator.displayMealPlans();

        // Restore normal output
        System.setOut(System.out);

        // Check expected output
        String expectedOutput = "Meal: Avocado Toast\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
}

