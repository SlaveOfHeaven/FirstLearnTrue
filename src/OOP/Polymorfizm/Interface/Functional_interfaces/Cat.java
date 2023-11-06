package OOP.Polymorfizm.Interface.Functional_interfaces;

public class Cat implements Sounding {
    @Override
    public void makeSound() {
        System.out.println("Кошка мяукат");
    }
}
