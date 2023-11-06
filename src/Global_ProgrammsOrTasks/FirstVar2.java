package Global_ProgrammsOrTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;


public class FirstVar2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("\nВведите количество чисел в списке 1: ");
        List list1 = new ArrayList(s.nextInt());
        System.out.print("\nВведите количество чисел в списке 2: ");
        List list2 = new ArrayList(s.nextInt());
        int s1 = ((list1.size()) + (list2.size()));
        if ((0 <= s1) && (s1<=50)){
            for(int c1 = s.nextInt(); c1>0; c1--) {
                System.out.print("Введите число списка 1: ");
                list1.add(s.nextInt());
            }
            Collections.sort(list1);

            for(int c2 = s.nextInt(); c2>0; c2--) {
                System.out.print("Введите число списка 2: ");
                list2.add(s.nextInt());
            }
            Collections.sort(list2);
            List list3 = new ArrayList(s.nextInt());
            list3.addAll(list1);
            list3.addAll(list2);
            Collections.sort(list3);
            System.out.print("\nОбъеденение списков:");
            System.out.print(" " + list3 + ",");
        }
        else System.out.println("Cлишком много символов для обоих списков! (количество чисел не должно превышать 50)");


    }
}
