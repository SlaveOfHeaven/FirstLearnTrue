package OOP.Polymorfizm.Interface.instanceof_ex;

public class Runner {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal[] zoo = {cat,dog};
        for (Animal animal : zoo) {
            if (animal instanceof Cat cat1){ //instanceof проверяет является ли animal - Cat и преобразовывает его
                cat1.sayMeow();
                //((Cat) animal).sayMeow();
            }
        }


    }
}
