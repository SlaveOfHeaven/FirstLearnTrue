package Global_ProgrammsOrTasks;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Trird {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.print("\nВведите количество чисел в списке: ");
        for(int c1=s.nextInt();c1>0;c1--){ //c1 - количество символов списка
            System.out.print("Введите число списка: ");
            nums.add(s.nextInt());
        }
        int s1 = nums.size(); //считает количество всех символов списка
        if ((1 < s1) && (s1<=(3*104))) {
            for(Integer i: nums){
                int p = Collections.frequency(nums, i); //нахождение количества повторов элементов списка
                if(p==1)
                    System.out.println("\nЧисло которое не повторяется: " + i);
            }
        }
        else System.out.println("Неверное количество символов для списка! (количество чисел должно быть больше 0, но не превышать 3*104)");
    }
}
/*else if(p>1) continue;
else System.out.println(Введены неверные числа списка! (только одно число не должно повторяться));*/