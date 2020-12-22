import sample.Ingredient;
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

    }
    public void blankLine(){
        System.out.println("\n");
    }





}

