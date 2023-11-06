package OOP.enumeration;

public enum Country {
    JAPAN("Япония", 140_000_00L, "Японский"),
    GREECE("Греция", 10_000_00L, "Греческий"),
    ARGENTINE("Аргентина", 47_000_00L, "Испанский");
    private String name;
    private long countPeople;
    private String language;

    Country(String name, long countPeople, String language) {
        this.name = name;
        this.countPeople = countPeople;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public long getCountPeople() {
        return countPeople;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", countPeople=" + countPeople +
                ", language='" + language + '\'' +
                '}';
    }
}
