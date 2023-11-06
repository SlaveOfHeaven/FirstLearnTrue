package OOP.Polymorfizm.Interface.nachalo;

public class Car implements Movable{
    public void move(){
        System.out.println("машина едет");
    }
    public void turnOff(){
        System.out.println("машина выключиламь");
    }

    @Override
    public void back() {
        System.out.println("машина возвращается");
    }
}
