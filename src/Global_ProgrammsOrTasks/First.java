package Global_ProgrammsOrTasks;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class First {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //Список 1
        ArrayList<Integer> list1 = new ArrayList<>(); //создание переменной arraylist
        System.out.print("\nВведите количество чисел в списке 1: ");
        for(int c1 = s.nextInt(); c1>0; c1--) { //c1 - количество символов списка
            System.out.print("Введите число списка 1: ");
            list1.add(s.nextInt()); //добавление в список числа с клавиатуры
        }
        Collections.sort(list1); //сортировка списка
        /*System.out.print("\nСортированный список 1:");
        for(Integer i: a1){
            System.out.print(" " + i + ",");
        }*/
        //Список 2
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("\nВведите количество чисел в списке 2: ");
        for(int c2 = s.nextInt(); c2>0; c2--) {
            System.out.print("Введите число списка 2: ");
            list2.add(s.nextInt());
        }
        Collections.sort(list2);
        /*System.out.print("\nСортированный список 2:");
        for(Integer i: a2){
            System.out.print(" " + i + ",");
        }*/
        int s1 = ((list1.size()) + (list2.size())); //счет общего количества чисел обоих списков
        if ((0 <= s1) && (s1<=50)){
            ArrayList<Integer> list3 = new ArrayList<>();
            list3.addAll(list1); //добавление одного списка полностью в другой
            list3.addAll(list2);
            Collections.sort(list3);
            System.out.print("\nОбъеденение списков:");
            for(Integer i: list3){ //перебор чисел списка arraylist
                System.out.print(" " + i + ",");
            }
        }
        else System.out.println("Cлишком много символов для обоих списков! (количество чисел не должно превышать 50)");
    }
}
