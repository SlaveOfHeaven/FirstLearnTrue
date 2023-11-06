package OOP.oop2;

public class car {
    private String brand;
    private static int countCars = 0;       //делает значение единым для всех а не отдельным
    public static final String BMW_INFO = "Bmw - Geraman company, created 1928.";
    public static final String AUDI_INFO = "Audi - Geraman company, created 1933.";
    public static final String KIA_INFO = "Kia - Korean company, created 1928.";
    public static final String[] BRAND_DISCRIPTIONS = new String[3];

    static {                                //статический блок
        BRAND_DISCRIPTIONS[0] = BMW_INFO;
        BRAND_DISCRIPTIONS[1] = AUDI_INFO;
        BRAND_DISCRIPTIONS[2] = KIA_INFO;
    }

    public car (String brand){
        this.brand = brand;
        countCars++;
    }

    public static int getCountCars() {
        return countCars;
    }
    public static void printBrands() {      //отвязан от других экземпляров ничего не знает о car brand
        System.out.println("Перечень доступных моделей: audi, bmv, kia");
    }
}
