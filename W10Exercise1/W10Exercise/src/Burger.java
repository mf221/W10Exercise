/**
 * Burger
 */
public class Burger extends Dish {

private int weightInPounds;
private boolean isVeggie;

    public int getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(int weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public boolean getIsVeggie() {
        return isVeggie;
    }

    public void setVeggie(boolean isVeggie) {
        this.isVeggie = isVeggie;
    }

    public Burger(String name, double price, int weightInPounds){
        super(name,price);
        this.weightInPounds = weightInPounds;
    }

    public Burger(){
        super();
        this.weightInPounds = 0;
    }

    public void printBurgerDetails(){
        super.printDishDetails();
        System.out.println("Burger Weight: " +getWeightInPounds() + "pounds");
        System.out.println("Suiitable for Vegetarians: " + getIsVeggie());
    }
}