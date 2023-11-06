package OOP.Polymorfizm.Interface.Practics;

public class Duck implements Swimable, Flyable {
    @Override
    public void swim(){
        System.out.println("Утка плывет");
    }
    @Override
    public void fly(){
        System.out.println("Утка летит");
    }
}
