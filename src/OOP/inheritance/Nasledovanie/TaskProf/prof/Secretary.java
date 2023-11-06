package OOP.inheritance.Nasledovanie.TaskProf.prof;

public class Secretary extends OfficeWorker{
    public Secretary(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getCash() {
        System.out.println("Секретарь получает зарплату - 30000 рублей.");
    }
    @Override
    public void work() {
        System.out.println("Печатает документы.");
    }
}
