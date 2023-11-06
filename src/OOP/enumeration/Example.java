package OOP.enumeration;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        OldCountry[] oldCountries = Runner.getOldCountries();
        System.out.println(Country.ARGENTINE.getName());
        System.out.println(Country.valueOf("JAPAN").getCountPeople());
        System.out.println(Arrays.toString(Country.values()));
    }

}
