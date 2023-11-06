package OOP.AutoPractise;

public class Auto {
    private String mark;
    private int maxSpeed =220;

    {
        System.out.println("Машина успешно создана!");
    }

    public Auto(String mark) {
        this.mark = mark;
    }

    public Auto(String mark, int maxSpeed) {
        if (maxSpeed<=0){
            this.maxSpeed = 100;
        }
        else{
            this.maxSpeed =maxSpeed;}
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void razgn100km(){
        double speed = 110d/(this.maxSpeed/20d);
        System.out.printf("Разгон до 100км/ч: %s с\n__________________________________\n",speed);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "mark='" + mark + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

