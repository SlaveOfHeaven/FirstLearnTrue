package OOP.ClassObject.equals_and_hashcode;

public class Child extends Object{
    private String name;
    private int year;

    public Child(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Началось сравнение " + this.getName());
        if (obj == null) {
            return false;
        }
        if (obj instanceof Child child1){
            return this.getName().equals(child1.getName()) && this.getYear()==(child1.getYear());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getYear() % 2;
    }
}
