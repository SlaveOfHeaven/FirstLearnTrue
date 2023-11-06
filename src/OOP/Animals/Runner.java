package OOP.Animals;

import OOP.zoo.zoo;

public class Runner {
        public static void main(String[] args) {
            Dog dog = new Dog();
            Cat cat = new Cat("black", 10, "Youri");
            zoo Zoo = new zoo(cat, dog);
            Zoo.feed();
//        Dog dog = new Dog("muhtar", -12, "Polegt");
//        System.out.println(dog);
//        dog.setWeight(-10);
//        System.out.println(dog);
//        System.out.println(dog.getOwner());
//        Dog dog1 = new Dog();
//        System.out.println(dog1);
        }
    }




