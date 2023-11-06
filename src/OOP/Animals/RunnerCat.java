package OOP.Animals;

public class RunnerCat {
    public static void main(String [] args){
        Cat cat = new Cat("Black", 12, "Petr");
//        System.out.println(cat);
//        cat.destroySofa("Петра");
        String animal = cat.hunt(   false);
        String resH2 = cat.hunt(   false, false);
        cat.hunt("День");
        System.out.println(animal);
        System.out.println(resH2);
        cat.feed("Олег", "корм", "молоко", "мясо");
    }
}
