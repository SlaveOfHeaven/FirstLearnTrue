package OOP.inheritance.Nasledovanie.Dogs;

import OOP.inheritance.Nasledovanie.Dogs.Parodi.Dog;
import OOP.inheritance.Nasledovanie.Dogs.Parodi.Puddle;
import OOP.inheritance.Nasledovanie.Dogs.DEFENDED.Shepherd;
import OOP.inheritance.Nasledovanie.Dogs.Parodi.Terrier;

public class Ruunner_Dog {
    public static void main(String[] args) {
        System.out.println(Dog.LATIN_NAME);
        //Пудель
        System.out.println("\nИнформация о Пуделе");
        Puddle puddle = new Puddle();
        puddle.bark();
        puddle.run();
        puddle.breath();
        System.out.printf("Количество зубов: %d\n",puddle.countTeeth);

        //Овчарка
        System.out.println("\nИнформация о Овчарке");
        Shepherd shepherd = new Shepherd();
        shepherd.bark();
        shepherd.run();
        shepherd.breath();
        System.out.printf("Количество зубов: %d\n",shepherd.countTeeth);
        shepherd.beAngry();

        //Терьер
        System.out.println("\nИнформация о Терьере");
        Terrier terrier = new Terrier();
        terrier.bark();
        terrier.run();
        terrier.breath();
        System.out.printf("Количество зубов: %d\n",terrier.countTeeth);
    }


}
