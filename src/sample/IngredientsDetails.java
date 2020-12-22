package sample;

public class IngredientsDetails extends Ingredient{
    private int cVitamin;
    private int magnesium;
    private int chalk;

    public IngredientsDetails(String name, double calories, int cVitamin, int magnesium, int chalk) {
        super(name, calories);
        this.cVitamin = cVitamin;
        this.magnesium = magnesium;
        this.chalk = chalk;
    }

    public IngredientsDetails(int cVitamin, int magnesium, int chalk) {
        this.cVitamin = cVitamin;
        this.magnesium = magnesium;
        this.chalk = chalk;
    }
    public boolean goodForColds(){
        if (cVitamin > 5){
            System.out.println(this.getName() + " is good against colds");
            return true;
        } else {
            System.out.println(this.getName() + " is not great against colds");
            return true;
        }
    }
}
