package OOP.inheritance.Nasledovanie.TaskProf.prof;

public class Defender extends Worker {
    public Defender(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getCash() {
        System.out.println("Охранник получает зарплату - 15000 рублей.");
    }
    public void canDefend(){
        System.out.println("Умеет сторожить.");
    }
    @Override
    public void work(){
        System.out.println("Сторожит.");
    }
}
