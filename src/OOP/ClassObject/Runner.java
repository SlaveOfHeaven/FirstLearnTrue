package OOP.ClassObject;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("Mypka");
        Class<? extends Cat> aClass = cat.getClass();
        System.out.println(aClass.getName());
        System.out.println(cat.toString());
    }
}
