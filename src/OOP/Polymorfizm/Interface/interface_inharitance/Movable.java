package OOP.Polymorfizm.Interface.interface_inharitance;

public interface Movable {
    void move();

    default void eat(){
        System.out.println("существо ест в движении");
    }
}
