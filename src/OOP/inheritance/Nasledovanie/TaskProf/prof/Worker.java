package OOP.inheritance.Nasledovanie.TaskProf.prof;

public abstract class Worker {
    private boolean isMan;

    public Worker(boolean isMan) {
        this.isMan = isMan;
    }
    public boolean isMan() {
        return isMan;
    }

    public void work(){
        System.out.println("Работник работает");
    }
    protected abstract void getCash();


}
