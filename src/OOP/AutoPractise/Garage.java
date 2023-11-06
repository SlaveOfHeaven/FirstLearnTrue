package OOP.AutoPractise;

public class Garage {
    private Auto auto1;
    private Auto auto2;

    public Garage() {
    }

    public void setAuto1(Auto auto1) {
        this.auto1 = auto1;
    }

    public void setAuto2(Auto auto2) {
        this.auto2 = auto2;
    }

    public void giveAutosinfo(){
        getinfoaboutauto(auto1);
        getinfoaboutauto(auto2);
    }
    private void getinfoaboutauto(Auto auto){
        System.out.println(auto.getMark());
        auto.razgn100km();
    }
}
