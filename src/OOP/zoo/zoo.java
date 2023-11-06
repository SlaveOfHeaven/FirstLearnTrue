package OOP.zoo;

import OOP.Animals.Cat;
import OOP.Animals.Dog;

public class zoo {
    private Cat cat;
    private Dog dog;

    public zoo(Cat cat, Dog dog) {
        if (cat == null){
            this.cat = new Cat("none",4, "dad");
        }
        this.cat = cat;
        this.dog = dog;
    }

    public void feed(){
        cat.feed("bob", "milk");
        dog.feed("oleg", "meat");
    }
}
