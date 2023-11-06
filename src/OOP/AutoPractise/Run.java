package OOP.AutoPractise;

public class Run {
    public static void main(String [] args){
        Auto ZvorykinCar = new Auto("ZvorykinCar");
        Auto SuperCar = new Auto("SuperCar", 400);
        Garage garage = new Garage();
        garage.setAuto1(ZvorykinCar);
        garage.setAuto2(SuperCar);
        System.out.println("_______________________________");
        garage.giveAutosinfo();
    }
}
