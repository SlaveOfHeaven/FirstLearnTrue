package OOP.inheritance.Nasledovanie.TaskProf.GuideCountries;

public class Countries {
    private long countHumans;
    private String language;
    private String continent;

    public Countries(long countHumans, String language, String continent) {
        this.countHumans = countHumans;
        this.language = language;
        this.continent = continent;
    }

    public long getCountHumans() {
        return countHumans;
    }

    public String getLanguage() {
        return language;
    }

    public String getContinent() {
        return continent;
    }
}
