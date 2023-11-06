package BaseStart;

import java.util.Scanner;

public class massiv {
    public static void main(String[] args) {
        //Многомерные массивы данных
        char[][] syms = new char[2][2];
        syms[0][0] = 't';
        System.out.println(syms[0][0]);

        byte[][] nums = new byte[][]{
                {2, 7},
                {3, 6},
                {1, 9}
        };
        nums[1][1] = 67;
        System.out.println(nums[1][1]);
    }
}
//Массивы

       /* int[] nums = new int[5];
        Scanner scan = new Scanner(System.in);
        nums[0]=12;
        nums[1]=13;
        nums[2]=14;
        nums[3]=15;
        nums[4]=16;
        int res = nums[1] + nums[3];
        System.out.println(res);

float [] nums2 = new float[] {1.0f,4.1f,5.3f,};
        System.out.println(nums2[1]);

        for(int i = 0; i < nums2.length; i++) {
            System.out.println("element " + nums2[i]);
        }*/

//Применение массивов

        /*int[] arr = new int[4];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите число: ");
            int value = scan.nextInt();
            arr[i] = value;
        }

        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + ",");
        }
    int min = arr[0];
    for(int i = 0; i < arr.length; i++) {
        if (arr[i] < min)
            min = arr[i];
}
        System.out.println("\nМинимальный элемент массива: " + min);*/

//import java.util.Arrays;
//Arrays.sort(a1);