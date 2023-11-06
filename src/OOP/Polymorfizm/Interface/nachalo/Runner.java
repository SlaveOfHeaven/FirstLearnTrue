package OOP.Polymorfizm.Interface.nachalo;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();



        Movable[] movables = new Movable[2];
        movables[0]=car;
        movables[1]=dog;
        for (Movable movable : movables) {
            movable.move();
            movable.back();
        }

    }
}
