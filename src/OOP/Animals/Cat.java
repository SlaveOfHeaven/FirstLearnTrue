package OOP.Animals;

import java.util.Arrays;

public class Cat {
    private String color;
    private double weigh;
    private String ovnName;
    public Cat(String colorName, double weighCat, String owner) {
        this.color =  colorName;
        this.weigh = weighCat;
        this.ovnName = owner;
    }
    public void destroySofa(String sofaOwner){
        System.out.printf("Кот дерет диван %s\n", sofaOwner);
    }
    public String hunt(boolean isDay){
        if (isDay){
            return "мышь";}
        return "сова";
    }
    public String hunt(boolean isDay, boolean succes){
        if (succes){
            if (isDay){
                return "мышь";}
            return "сова";}
        return "ничего";
    }
    public void hunt(String timesOfDay){
        if (timesOfDay.equals("Утро")){
            System.out.println("Мышь");
        }
        else System.out.println("Комар");
    }
    public void feed(String giver, String  ...product){
        System.out.printf("%s дал еду коту. Кот поел %s \n",giver, Arrays.toString(product));
    }
}

