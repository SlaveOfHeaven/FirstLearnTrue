package OOP.Transport;

public class Transport {
    private float speed;
    private Integer weight;
    private String color;
    private byte[] coord;

    public Transport(float _speed, int _weight, String _color, byte[] _coord) {
        System.out.println("object created");
        set(_speed,_weight,_color,_coord);
        System.out.println(set());
    }
    public Transport(int weight, byte[] coord) {
        this.weight = weight;
        this.coord = coord;
        System.out.println(set());
    }

    public void set(float speed, int weight, String color, byte[] coord) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coord = coord;
    }
    public String set() {

        String info = " object speed: " + this.speed + ". object weight: " + this.weight + ". object color: " + this.color + ".\n";
        String infocord = "object coord:\n";
        for( int i = 0; i<coord.length; i++)
            infocord += coord[i] + "\n";
        return  info + infocord;
    }



}
