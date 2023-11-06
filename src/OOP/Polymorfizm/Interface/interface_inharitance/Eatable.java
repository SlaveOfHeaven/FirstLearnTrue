package OOP.Polymorfizm.Interface.interface_inharitance;

public interface Eatable {
    default void eat(){
        System.out.println("Существо ест");
    };
}
