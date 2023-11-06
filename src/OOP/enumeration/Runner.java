package OOP.enumeration;

public class Runner {
    public static void main(String[] args) {

    }
    public static OldCountry[] getOldCountries(){
        OldCountry[] oldCountries = new OldCountry[3];
        oldCountries[0] = new OldCountry("Япония", 140_000_00L, "Японский");
        oldCountries[1] = new OldCountry("Греция", 10_000_00L, "Греческий");
        oldCountries[2] = new OldCountry("Аргентина", 47_000_00L, "Испанский");
        return oldCountries;
    }
}
