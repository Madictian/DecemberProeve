package sample;

import java.util.ArrayList;

public class Recipe {
    private ArrayList<Ingredient> list = new ArrayList<>();
    private String name;
    private double amount;
    private String measurement;
    private String description;
    private double timeNeeded;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTimeNeeded() {
        return timeNeeded;
    }

    public void setTimeNeeded(double timeNeeded) {
        this.timeNeeded = timeNeeded;
    }

    public Recipe(String name, double amount, String measurement, String description, double timeNeeded) {
        this.name = name;
        this.amount = amount;
        this.measurement = measurement;
        this.description = description;
        this.timeNeeded = timeNeeded;
    }

    public Recipe() {
    }

    public void addIngredients(Ingredient ingredient){
        list.add(ingredient);
    }
    public void addIngredients(String name, int calories){
        list.add(new Ingredient(name, calories));
    }

    public void showIngredients(){
        System.out.println("for " + this.getClass() + " you'll need:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("- "+ list.get(i).getName());

        }
    }

    public void showProcess(){
        System.out.println(description);
    }

    public void showRecipe(){
        this.showIngredients();
        this.showProcess();
        System.out.println("\n");
    }

}
