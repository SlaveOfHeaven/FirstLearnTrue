package BaseStart;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;

public class Collections {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        LinkedList<Float> num = new LinkedList<>();//почти тоже самое только чуть лучше взаимодействует с перемещением и действиями с числами
        num.add(21.4f);
        num.add(2.7f);
        num.add(42.8f);
        for (Float i : num){
            System.out.println(i);
        }
    }
}



//Колекции в Java

/*   ArrayList<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(50);//добавить число в конец массива
        num.add(1,30); //добавить число выбрав ему индекс
       // System.out.println(num.size());// выводит количество символов коллекции
        System.out.println(num.get(1));//выводит выбранный элемент
        num.remove(1);// удаляет выбранный элемент
        //num.clear();//очищает всю коллекцию
        for(Integer i: num){
            System.out.println(i);
        }*/