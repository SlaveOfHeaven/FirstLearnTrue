package OOP.taskRestoraunt;

public class WebOfRestaurants {
    private static int sosiski;
    private static int bread;

    public static int getSosiski() {
        return sosiski;
    }

    public static int getBread() {
        return bread;
    }

    {
        System.out.println("Новый ресторан Создан!");
    }
    public void GiveFood() {
        if (sosiski < 1 || bread < 2) {
            System.out.println("Not enough food");}
        else {
        sosiski--;
        bread -= 2;
            System.out.println("Ресторан успешно покормил посетителей!");}
        }
    public void GetMoreProducts(){
        sosiski+=100;
        bread+=200;
        System.out.println("Ресторан принял партию продуктов");
    }

    @Override
    public String toString() {
        return "WebOfRestaurants{" +
                "sosiski=" + sosiski +
                ", bread=" + bread +
                '}';
    }
}
