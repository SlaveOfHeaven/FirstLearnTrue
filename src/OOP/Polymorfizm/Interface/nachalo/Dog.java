package OOP.Polymorfizm.Interface.nachalo;

public class Dog implements Movable{
    public void move(){
        System.out.println("собака бежит");
    }
    @Override
    public void back() {
        System.out.println("собака возвращается");
    }
}
