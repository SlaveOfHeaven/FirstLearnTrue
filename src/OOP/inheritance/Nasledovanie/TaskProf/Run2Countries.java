package OOP.inheritance.Nasledovanie.TaskProf;

import OOP.inheritance.Nasledovanie.TaskProf.GuideCountries.Countries;
import OOP.inheritance.Nasledovanie.TaskProf.GuideCountries.CountriesGuide;

public class Run2Countries {
    public static void main(String[] args) {
        Countries france = CountriesGuide.FRANCE;
        System.out.println(france.getCountHumans());
    }
}
