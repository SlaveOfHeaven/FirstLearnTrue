package OOP.Polymorfizm.Interface.interface_inharitance;

public interface Alive extends Eatable, Movable{

    @Override
    default void eat() {
        Eatable.super.eat();
    }
}
