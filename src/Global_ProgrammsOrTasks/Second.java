package Global_ProgrammsOrTasks;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.LinkedHashSet;

public class Second {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> head = new ArrayList<>();
        System.out.print("\nВведите количество чисел в списке: ");
        for(int c1 = s.nextInt(); c1>0; c1--) {
            System.out.print("Введите число списка: ");
            head.add(s.nextInt());
        }
        Collections.sort(head);
        /*System.out.print("\nСортированный список:");
        for(Integer i: a1){
            System.out.print(" " + i + ",");
        }*/
        int s1 = head.size();
        Set<Integer> set = new LinkedHashSet<>(head); //set для удаления повторяющихся элементов
        ArrayList<Integer> head2 = new ArrayList<>(set); //указание в какую переменную выгрузить set
        if ((0 < s1) && (s1<=300)) {
            System.out.print("\nСписок без повторов:");
            Collections.sort(head2);
            for (Integer i : head2) {
                System.out.print(" " + i + ",");
            }
        }
        else System.out.println("Cлишком много символов для списка! (количество чисел не должно превышать 300)");
    }
}