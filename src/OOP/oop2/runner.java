package OOP.oop2;

import java.util.Arrays;

public class runner {
    public static void main (String [] args){
        car audi = new car("audi");
        car bmv = new car("bmv");
        car kia = new car("kia");
        System.out.println("Количество машин: " + car.getCountCars());
        car.printBrands();
        System.out.println(car.BMW_INFO);
        System.out.println(Arrays.toString(car.BRAND_DISCRIPTIONS));
    }
}
