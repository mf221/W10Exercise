/**
 * W10Exercise1
 */
public class W10Exercise1 {

    public static void main(String[] args) {
        Dish tacos = new Dish("tacos", 6);
        Dish nachos= new Dish("nachos");
        Dish hotDog= new Dish();

        tacos.printDishDetails();
        System.out.println("");
        nachos.printDishDetails();
        System.out.println("");
        hotDog.printDishDetails();
    }
}