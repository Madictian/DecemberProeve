import sample.Ingredient;
import sample.IngredientsDetails;
import sample.Recipe;

public class SimpleTest {
    public static void main(String[] args) {
        System.out.println("hello there user");
        Recipe tea = new Recipe();
        Ingredient powderedSugar = new Ingredient("powderedSugar", 1000);
        Ingredient water = new Ingredient("water", 0);

        tea.addIngredients(powderedSugar);
        tea.addIngredients(water);

        Recipe glaze = new Recipe();
        Ingredient teaLeaf = new Ingredient("teaLeaf", 0);
        water = new Ingredient("water", 0);
        Ingredient lemon = new Ingredient("lemon", 0);

        glaze.addIngredients(teaLeaf);
        glaze.addIngredients(water);
        glaze.addIngredients(lemon);

        tea.showIngredients();
        glaze.showIngredients();

        glaze.setDescription("- you're gonna want to mix the powdered sugar and water, and then coat the cake");
        tea.setDescription("- you dip the teabag with leaves in it into the boiling water. wait 2 minutes and done");

        blankLine();

        glaze.showProcess();
        tea.showProcess();

        blankLine();

        glaze.showRecipe();

        tea.showRecipe();

        IngredientsDetails sausage = new IngredientsDetails(1,1,1);
        sausage.setName("sausage");
        IngredientsDetails lemons = new IngredientsDetails(100, 0,0);
        lemons.setName("lemons");

        sausage.goodForColds();
        lemons.goodForColds();

    }
    public static void blankLine(){
        System.out.println("\n");
    }





}

