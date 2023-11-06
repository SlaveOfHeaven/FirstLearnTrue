package OOP.inheritance.Nasledovanie.TaskProf;

import OOP.inheritance.Nasledovanie.TaskProf.prof.Buhgalter;
import OOP.inheritance.Nasledovanie.TaskProf.prof.Defender;
import OOP.inheritance.Nasledovanie.TaskProf.prof.Secretary;

public class Run {
    public static void main(String[] args) {
        System.out.println("\n_________________________________\n");
        //Охранник
        System.out.println("Информация о Охраннике.");
        Defender defender = new Defender(true);
        defender.canDefend();
        defender.work();
        defender.getCash();
        System.out.println("\n_________________________________\n");

        //Секретарь
        System.out.println("Информация о Секретаре.");
        Secretary secretary = new Secretary(false);
        secretary.work();
        secretary.drinkCoffee();
        secretary.getCash();
        System.out.println("\n_________________________________\n");

        //Бухгалтер
        System.out.println("Информация о Бухгалтере.");
        Buhgalter buhgalter = new Buhgalter(false);
        buhgalter.drinkCoffee();
        buhgalter.work();
        buhgalter.getCash();
        System.out.println("\n_________________________________\n");
    }
}
