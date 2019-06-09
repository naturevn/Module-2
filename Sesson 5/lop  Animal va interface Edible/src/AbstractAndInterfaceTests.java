import Edible.Edible;
import animal.Animal;
import animal.Chicken;
import animal.Tiger;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].makeSound());
            if (animals[i] instanceof Chicken) {
                Edible edible = (Chicken) animals[i];
                System.out.println("Thit: " + edible.howToEat());
            } else {
                Edible edible = (Tiger) animals[i];
                System.out.println("Thit: " + edible.howToEat());
            }
        }
    }
}
