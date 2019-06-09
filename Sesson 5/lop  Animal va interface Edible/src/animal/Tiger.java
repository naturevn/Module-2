package animal;

import Edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Tiger: roarrrr";
    }

    @Override
    public String howToEat() {
        return "Chicken";
    }
}
