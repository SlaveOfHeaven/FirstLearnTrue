package OOP.inheritance.Nasledovanie.Dogs.DEFENDED;

import OOP.inheritance.Nasledovanie.Dogs.Parodi.Dog;

public final class Shepherd extends Dog {

    public Shepherd() {
        super(2);
    }
    @Override
    public void run() {
        System.out.println("Собака бежит быстро");
    }
    @Override
    public void breath() {
        System.out.println("Овчарка дышит");
    }
    @Override
    public void bark(){
        System.out.println("ГАВ ГАВ ГАВ ГАВ ГАВ!!!");
    }
    @Override
    public void beAngry(){
        //текст из своего метода
        //вызывала бы метод родителя
        //текст из своего метода
        System.out.println("Собака стоит на " + super.countLegs + " лапах.");
        System.out.println("Овчарка увидела чужого человека");
        super.beAngry();
        System.out.println("Овчарка успокоялась");
    }

}
