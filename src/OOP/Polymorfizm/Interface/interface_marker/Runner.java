package OOP.Polymorfizm.Interface.interface_marker;

public class Runner {
    public static void main(String[] args) {
        Bird bird = new Bird();
        AirPlane airPlane = new AirPlane();
        if (bird instanceof Alive){System.out.println("Этот объект живой");}
        if (airPlane instanceof Alive){System.out.println("Этот объект живой");}
        else System.out.println("Этот объект не живой");
    }
}
