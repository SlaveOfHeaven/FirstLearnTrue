package OOP.inheritance.Nasledovanie.Dogs.Parodi;

import OOP.inheritance.Nasledovanie.Dogs.Alive;

public abstract class Dog extends Alive {
    protected final int countLegs = 4; //пакет и классы наследники
    public int countTeeth;

    public static final String LATIN_NAME = "Canis familiaris";//конст

    public Dog(int countTeeth) {
        this.countTeeth = countTeeth;
    }

    public void bark(){
        System.out.println("ГАВ!!!");
    }
    public void beAngry(){
        System.out.println("РРРРРРРРР!!!!");
    }

    public abstract void run();

    public final void eat(){ //нельзя менять

    }
}
