package OOP.inheritance.Nasledovanie.TaskProf.prof;

public abstract class OfficeWorker extends Worker {
    public void drinkCoffee(){
        System.out.println("Пьет кофе.");
    }
    public OfficeWorker(boolean isMan){
        super(isMan);
    }
}
