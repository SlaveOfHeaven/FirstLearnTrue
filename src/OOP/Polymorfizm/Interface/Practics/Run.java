package OOP.Polymorfizm.Interface.Practics;

public class Run {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Duck duck = new Duck();
        AirPlane airPlane = new AirPlane();

        Swimable[] pools = {fish, duck};
        Flyable[] heavens = {duck, airPlane};
        for (Swimable pool : pools) {
            pool.swim();
        }
        for (Flyable heaven : heavens) {
            heaven.fly();
        }
    }
}
