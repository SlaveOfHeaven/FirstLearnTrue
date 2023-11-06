package OOP.Polymorfizm.Interface.Functional_interfaces;

@FunctionalInterface
public interface Sounding {
    void makeSound();
    default void doSomething(){

    }
}
