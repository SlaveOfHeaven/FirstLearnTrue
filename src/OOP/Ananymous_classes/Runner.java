package OOP.Ananymous_classes;

import OOP.Polymorfizm.Interface.Functional_interfaces.Sounding;

import java.util.logging.SocketHandler;

public class Runner {
    public static void main(String[] args) {
        Alive dog = new Alive() { //анонимный класс
            @Override
            public void eat() {
                System.out.println("Dog Eat");
            }

            @Override
            public void breath() {
                System.out.println("Dog Breath");
            }
        };
        dog.breath();
        dog.eat();

        Animal cat = new Animal() {
            @Override
            public void eat() {
                System.out.println("кот ест");
            }
        };
        System.out.println("TEST");
        System.out.println();
        System.out.println();
        cat.eat();
    }
}
