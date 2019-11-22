/**
 * Dish
 */
public class Dish {

private String name;
private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Dish(String name, double price){
        this.name = name;
        this.price= price;
    }

    public Dish(String name){
        this(name, 10);
    }

    public Dish(){
        this("",0);
    }

    public void printDishDetails(){
        if(getName() != "" && getPrice() != 0){
            System.out.println("Dish: " + getName());
            System.out.println("Price: "+ getPrice());
        }
        else{
            System.out.println("Dish undefined");
        }
    }

}