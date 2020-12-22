package sample;

public class Ingredient {

    enum diet{
        GLUTEN,
        SUGAR,
        MEAT
    }

    diet Diet = diet.GLUTEN;
    private String name;
    private double calories;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public Ingredient(String name, double calories) {
        this.name = name;
        this.calories = calories;
    }

    public Ingredient() {
    }

    public boolean calorieHeavy(){
        if (calories >= 100){
            System.out.println(this.getName() + " is calorie heavy");
            return true;
        } else {
            System.out.println(this.getName() + " is not calorie heavy");
            return false;
        }
    }
    public double countCalories(){


        return this.getCalories();
    }




}
