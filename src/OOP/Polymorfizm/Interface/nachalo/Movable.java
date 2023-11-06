package OOP.Polymorfizm.Interface.nachalo;

public interface Movable {
    void move(); //всегда public

    default void back(){
        System.out.println("вернуться");
    }
}
