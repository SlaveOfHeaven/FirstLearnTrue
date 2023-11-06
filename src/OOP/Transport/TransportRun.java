package OOP.Transport;

public class TransportRun {
    public static void main(String[] args){
        //ООП классы и объекты
        Transport MERS = new Transport(300.12f, 3000, "Black", new byte[] {0, 0, 0});
        //  MERS.set(300.12f, 3000, "Black", new byte[] {0, 0, 0});
        //    MERS.speed = 300.12f;
        //   MERS.weight = 3000;
        //    MERS.color = "Black";
        //   MERS.coord = new byte[] { 0, 0, 0 };

        Transport Matiz = new Transport(1200, new byte[] { 100, 0, 100 });
//        Matiz.speed = 700.5f;
//        Matiz.weight = 1200;
//        Matiz.color = "Green";
//        Matiz.coord = new byte[] { 100, 0, 100 };

        // System.out.println("Matiz speed: " + Matiz.speed + "\n" + "MERS speed: " + MERS.speed);
        // String res2 = Matiz.set();
        // System.out.println(res2);
    }
}
