package OOP.inheritance.Nasledovanie.Dogs.Parodi;

public class Puddle extends Dog {
    public Puddle() {
        super(28);
    }
    @Override
    public void breath() {
        System.out.println("Пудель дышит");
    }

    public void run(){
        System.out.println("Cобака бежит медленно");

    }

}
