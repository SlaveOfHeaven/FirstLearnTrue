package OOP.Polymorfizm.Interface.Dependency_Inversion;

public class DogZoo {
    private Dog dog1; //переименование sift + F6
    private Dog dog2;

    public DogZoo(Dog dog1, Dog dog2){
        System.out.println("Конструктор для любых собак");
        this.dog1 = dog1;
        this.dog2 = dog2;
    }
    public DogZoo(Poodle poodle, Shepherd shepherd){
        System.out.println("Конструктор для Пуделя и Овчарки");
        this.dog1 = poodle;
        this.dog2 = shepherd;
    }
}
