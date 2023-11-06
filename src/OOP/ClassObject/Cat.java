package OOP.ClassObject;

public class Cat extends Object{
    private String catName;

    public Cat(String catName) {
        this.catName = catName;
    }

    @Override
    public String toString() {
        return catName;
    }
}
