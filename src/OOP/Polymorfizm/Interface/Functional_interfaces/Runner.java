package OOP.Polymorfizm.Interface.Functional_interfaces;

public class Runner {
    public static void main(String[] args) {
        Sounding cat = new Cat();
        cat.makeSound();

        Sounding bird = () -> System.out.println("птица поет"); //реализация не создавая класс
        bird.makeSound();
    }
}
