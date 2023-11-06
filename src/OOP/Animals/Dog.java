package OOP.Animals;

import java.util.Arrays;

public class Dog {
    //значение по умолчанию
    private String name = "Lord";
    private int weight = 50;
    private String owner = "Andrey";
    //блок инициализации(пишет -собака создаласть- при -new Dog-)
    {
        System.out.println("Собака создалась!");
    }

    public Dog(){
    }

    //перегрузка конструктора
    public Dog(String name, int weight, String owner) {
        if (weight<1){
            this.weight =5;
        } else {
            this.weight = weight;
        }
        this.name = name;
        this.owner = owner;
    }

    public void setWeight(int newWeight) {
        if (newWeight < 1) {
            this.weight = 5;
        } else {
            this.weight = newWeight;
        }
    }
    public String getOwner(){
        return  "Mr." + owner;
    }
    public void feed(String giver, String  ...product){
        System.out.printf("%s дал еду собаке. Пёс поел %s \n",giver, Arrays.toString(product));
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                '}';
    }
}

