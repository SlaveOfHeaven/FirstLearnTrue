package OOP.enumeration;

public class OldCountry {
    private String name;
    private long countPeople;
    private String language;

    public String getName() {
        return name;
    }

    public long getCountPeople() {
        return countPeople;
    }

    public String getLanguage() {
        return language;
    }

    public OldCountry(String name, long countPeople, String language) {
        this.name = name;
        this.countPeople = countPeople;
        this.language = language;
    }
}
