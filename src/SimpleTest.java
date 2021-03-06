import sample.Ingredient;
import sample.IngredientsDetails;
import sample.Recipe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class SimpleTest {
    public static void main(String[] args) {
        System.out.println("hello there user");
        Recipe glaze = new Recipe();
        Ingredient powderedSugar = new Ingredient("powderedSugar", 1000);
        Ingredient water = new Ingredient("water", 0);

        glaze.addIngredients(powderedSugar);
        glaze.addIngredients(water);

        Recipe tea = new Recipe();
        Ingredient teaLeaf = new Ingredient("teaLeaf", 0);
        water = new Ingredient("water", 0);
        Ingredient lemon = new Ingredient("lemon", 0);

        tea.addIngredients(teaLeaf);
        tea.addIngredients(water);
        tea.addIngredients(lemon);

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

        blankLine();

        water.countCalories();
        glaze.countCalories();

        blankLine();

        glaze.setPortions(0);
        glaze.caloriesPerPortion();



    }

    //todo quick concept on persistence.
    @Override
    public String showIngredients(){
        String book = "";
        for (int i = 0; i < list.size(); i++) {
            book = list.get(i).getName() + " " + list.get()i.getAmount + " " + list.get(i).getMeasurement();

        }
        return book;
    }
    void saveForADoC() throws FileNotFoundException {
        java.io.File file = new File("name");
        Scanner input = new Scanner(file);

        for (int i = 0; i < listOfRecipes; i++) {
            Writer fileWriter = new FileWriter("name", true);
            fileWriter.write(recipe.getName + "\n" + showIngredients() + "\n" + recipe.getDescription);
        }

    }
    public static void blankLine(){
        System.out.println("\n");
    }





}

