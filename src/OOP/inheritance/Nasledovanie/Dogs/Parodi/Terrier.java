package OOP.inheritance.Nasledovanie.Dogs.Parodi;

public class Terrier extends Dog {

    public Terrier() {
        super(26);
    }
    @Override
    public void breath() {
        System.out.println("Терьер дышит");
    }

    @Override
    public void run() {
        System.out.println("Терьер быстро бежит");

    }
}
