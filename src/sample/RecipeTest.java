package sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @org.junit.jupiter.api.Test
    void showIngredients() {

    }

    @org.junit.jupiter.api.Test
    void showProcess() {
    }

    @org.junit.jupiter.api.Test
    void showRecipe() {
    }
//todo tested
    @org.junit.jupiter.api.Test
    void countCalories() {
        Recipe recipe = new Recipe();
        recipe.setName("SmellyFish");
        recipe.addIngredients("fish", 82);
        recipe.addIngredients("herb", 22);

        assertEquals(104, recipe.countCalories());

        recipe.addIngredients("bayleaf", 314 );
        assertEquals(418, recipe.countCalories());
    }
//todo tested
    @org.junit.jupiter.api.Test
    void caloriesPerPortion() {
        Recipe recipe = new Recipe();
        recipe.setName("SmellyFish");
        recipe.addIngredients("fish", 82);
        recipe.addIngredients("herb", 22);
        recipe.setPortions(4);

        assertEquals(26, recipe.caloriesPerPortion());

        recipe.addIngredients("bayleaf", 314 );
        assertEquals(104.5, recipe.caloriesPerPortion());
    }



    @Test
    void setPortions(int i) {
    }
    @Test
    void setName() {
    }
    @Test
    void setAmount() {
    }
    @Test
    void setMeasurement() {
    }
    @Test
    void setDescription() {
    }

// test kun den første get, siden de alle er struktureret ligeledes.

    //todo tested
    @Test
    void getPortions() {
        Recipe recipe = new Recipe();

        recipe.setPortions(1);
        assertEquals(1, recipe.getPortions());

        recipe.setPortions(3);
        assertEquals(3, recipe.getPortions());

        recipe.setPortions(10);
        assertEquals(10, recipe.getPortions());

    }
    @Test
    void getAmount() {
    }
    @Test
    void getMeasurement() {
    }
    @Test
    void getDescription() {
    }
    @Test
    void getTimeNeeded() {
    }
    //todo tested
    @Test
    void getName() {
        Recipe recipe = new Recipe();

        recipe.setName("grønt");
        assertEquals("grønt", recipe.getName());

        recipe.setName("kød");
        assertEquals("kød", recipe.getName());

        recipe.setName("dessert");
        assertEquals("dessert", recipe.getName());

    }



    @Test
    void setTimeNeeded() {
    }
    @Test
    void addIngredients() {

    }
    @Test
    void testAddIngredients() {
    }


}





