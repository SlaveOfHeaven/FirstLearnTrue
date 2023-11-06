package OOP.inheritance.Nasledovanie.TaskProf.prof;

public class Buhgalter extends OfficeWorker {
    public Buhgalter(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getCash() {
        System.out.println("Бухгалтер получает зарплату - 50000 рублей.");
    }
    @Override
    public void work(){
        System.out.println("Считает налоги.");
    }
}
