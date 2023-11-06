package Global_ProgrammsOrTasks;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.loadLibrary;
import static java.lang.System.out; //#9


public class Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //#1
/*         System.out.print("#1 Введите колчество символов массива: ");
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Введите число массива %d:  ", i+1);
            int c = scan.nextInt();
            a[i] = c;
        }
        System.out.print("Простые числа массивa: ");
        for (int i = 0; i < a.length; i++) {
            boolean t= true;
            if (a[i] == 1) t=false;
            else {
                for (int j = 2; j <= a[i] / 2; j++){
                    if ((a[i])%j==0) {t=false;
                        break;
                    }
                }
            }
            if (t) {
                if (a[i] == 0) {
                } else {
                    System.out.print(a[i] + "; ");
                }
            }
        }
*/

        //#2
/*        System.out.print("#2 Введите колчество символов массива: ");
        int n2 = scan.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            System.out.printf("Введите число массива %d:  ", i+1);
            int c2 = scan.nextInt();
            a2[i] = c2;
        }
        System.out.print("Счастливые числа в массиве:");
        for (int i = 0; i < a2.length; i++) {
            if (a2[i]==1||a2[i]==3||a2[i]==7||a2[i]==9||a2[i]==13||a2[i]==31||a2[i]==37||a2[i]==43||a2[i]==67||a2[i]==73||a2[i]==79||a2[i]==127||a2[i]==151||a2[i]==163||a2[i]==193||a2[i]==211||a2[i]==223||a2[i]==241||a2[i]==283||a2[i]==307||a2[i]==331||a2[i]==349||a2[i]==367||a2[i]==409||a2[i]==421||a2[i]==433||a2[i]==463||a2[i]==487||a2[i]==541||a2[i]==577||a2[i]==601||a2[i]==613||a2[i]==619||a2[i]==631||a2[i]==643||a2[i]==673||a2[i]==727||a2[i]==739||a2[i]==769||a2[i]==787||a2[i]==823||a2[i]==883||a2[i]==937||a2[i]==991||a2[i]==997||a2[i]==1009||a2[i]==1021||a2[i]==1039||a2[i]==1087||a2[i]==1093||a2[i]==1117||a2[i]==1123)
                System.out.print(a2[i] + "; ");
            else break;

        }
*/
/*        //#3
        Random rn3 = new Random();
        int r3 = rn3.nextInt(9 + 1);
        if (r3==0) System.out.println("#3 Нуль");
        else if(r3==1) System.out.println("#3 Один");
        else if(r3==2) System.out.println("#3 Два");
        else if(r3==3) System.out.println("#3 Три");
        else if(r3==4) System.out.println("#3 Четыре");
        else if(r3==5) System.out.println("#3 Пять");
        else if(r3==6) System.out.println("#3 Шесть");
        else if(r3==7) System.out.println("#3 Семь");
        else if(r3==8) System.out.println("#3 Восемь");
        else System.out.println("#3 Девять");
*/
        //#4
/*      int a4,b4,c4,c41,n4;
        System.out.println("#4 Введите последовательно a,b,c,n:");
        a4 = scan.nextInt();
        b4 = scan.nextInt();
        c4 = scan.nextInt();
        n4 = scan.nextInt();
        if ((Math.pow(a4,n4)+Math.pow(b4,n4)) == Math.pow(c4,n4)) System.out.println("Возможно только для n=1, n=2");
        else System.out.println((Math.pow(a4,n4)+ "+" + Math.pow(b4,n4)) + "!=" + Math.pow(c4,n4) + "      - Теория Ферма верна");
*/
        //#5
/*        double n,z;
        System.out.println("#5 Введите n для выражения: n-n/2+n/3-n/4+...+n/9999-n/10000");
        n5= scan.nextInt();
        z5=n5;
        for(int i =2;i<10000;i+=2){
        z5-=n5/i;
            if (i==10000) break;
            else z5+=n5/(i+1);
        }
        System.out.println("Итог вычислений = " + z5);
*/
        //#6
        //внизу принадлежащие #6 методы
/*        System.out.print("#6 Введите колчество символов массива: ");
        int n6 = scan.nextInt();
        int[] a6 = new int[n6];
        for (int i = 0; i < a6.length; i++) {
            System.out.printf("Введите число массива %d:  ", i+1);
            int c6 = scan.nextInt();
            a6[i] = c6;
        }
        System.out.println("Числа ряда Фибоначи в массиве:");
        for (int i = 0; i < a6.length; i++) {
            if (f(a6[i])) System.out.print((a6[i]) + "; ");
            else;
        }
*/
/*        //#7
          //внизу принадлежащие #7 методы
        System.out.print("#7 Введите колчество символов массива: ");
        int n7 = scan.nextInt();
        int[] a7 = new int[n7];
        for (int i = 0; i < a7.length; i++) {
            System.out.printf("Введите число массива %d:  ", i+1);
            int c7 = scan.nextInt();
            a7[i] = c7;
        }
        System.out.print("Числа-полиндромы массива: ");
        for (int i = 0; i < a7.length; i++) {
            String z7 = Integer.toString(a7[i]);
            if (p(z7)) System.out.print(a7[i] + " ;");
        }
*/
        //#8
/*
        System.out.print("#8 Введите колчество символов массива: ");
        int t8 = scan.nextInt();
        int[] a8 = new int[t8];
        for (int i = 0; i < a8.length; i++) {
            System.out.printf("Введите число массива %d:  ", i+1);
            int c8 = scan.nextInt();
            a8[i] = c8;
        }
        int m8,n8,x8;
        double m81,n81,x81,p8;
        for(int i = 0; i < a8.length; i++){
            if(i < a8.length-1 && a8[i]>=0 && a8[i+1]>=0) { n8 = a8[i] ; m8 = a8[i+1] ;n81 = a8[i] ; m81 = a8[i+1] ;x8=m8/n8; x81=m81/n81; p8=x81-x8;  System.out.print("Дробная часть p = " + p8); break;}
            else if ((i == a8.length-1 && (a8[i])<0)||(a8.length>1 && i == a8.length-1 && (a8[i-1])<0)) {System.out.println("В массиве нет двух подряд идущих положительных чисел"); break;}
            else if (a8.length == 1)System.out.println("Недостаточно чисел массива");
        }
*/
        //#9
/*        System.out.print("#9 Введите колчество символов массива: ");
        int n9 = scan.nextInt();
        int[] a9 = new int[n9];
        for (int i = 0; i < a9.length; i++) {
            System.out.printf("Введите число массива %d:  ", i+1);
            int c9 = scan.nextInt();
            a9[i] = c9;
        }
        for (int i = 0; i < a9.length; i++) {
            if (a9[i]>=0) {
                for (int l9 = 0;l9 < a9[i]+1;l9++)
                {
                    int t9 = 1;
                    out.print(t9);
                    for (int k9 = 1; k9 <= l9; k9++) {
                        t9 *= (l9 - k9 + 1);
                        t9 /= k9;
                        out.print(" ");
                        out.print(t9);
                    }
                    out.println();
                }
            }
            else if(i != a9.length-1)continue;
            else if (a9[i]==0) out.println("1");
            else System.out.println("В массиве все числа меньше 0"); break;
        }
*/
        //#10
/*        int n10,s10;
        System.out.println("#10 Введите число: ");
        n10 = scan.nextInt();
        System.out.println("Введите систему счисления(2, 5, 16): ");
        s10 = scan.nextInt();
        if (s10==2){
            String d10 = Long.toBinaryString(n10);
            System.out.println("Число в двоичной системе счисления: " + d10);
        }
        else if (s10==5){
            String p10 = Long.toString(n10,s10);
            System.out.println("Число в пятеричной системе счисления: "+ p10);
        }
        else if (s10==16){
            String h10 = Long.toHexString(n10);
            System.out.println("Число в шестнадцатеричной системе счисления: " + h10);
        }
        else System.out.println("Вы ввели систему счисления не являющейся 2,5 или 16");
*/

        //#11 (Что значит "реализовать путем разделения числа на тройки" ?)
/*        System.out.println("Введите число в 8-ричной системе счисления: ");
        String n11= scan.nextLine();
        System.out.println("Введите систему счисления в которую будет переведено число: ");
        int s11 = scan.nextInt();
        if (s11==2) System.out.println("Число в двоичной системе счисления: " + d(n11));
        else if(s11==16) System.out.println("Число в шестнадцатеричной системе счисления: " + h(n11));
        else System.out.println("Вы ввели систему счисления не являющейся 2 или 16");
*/
        //#12
/*        System.out.println("#12 Введите число в 7-ричной системе счисления: ");
        long n12;
        n12 = Long.parseLong(scan.nextLine(), 7);
        System.out.println("Это число в троичной системе счисления: " + Long.toString(n12, 3));
*/
    }
    //#6 методы
    static boolean kv(int x6)
    {
        int s6 = (int)Math.sqrt(x6);
        return (s6 * s6 == x6);
    }
    static boolean f(int n6)
    {
        return kv(5 * n6 * n6 + 4) || kv(5 * n6 * n6 - 4);
    }
    //#7 методы
    static boolean p(String w) {
        int length = w.length();                              //Двигаемся с обоих концов слова к серидине
        for (int i = 0; i < (length / 2); i++) {              //Cравниваем символы попарно
            if (w.charAt(i) != w.charAt(length - i - 1)) {    //Если найдено несоответствие - слово не палиндром
                return false;
            }
        }
        return true;
    }
    //#11 методы
    static String d(String o) {
        long v = Long.parseLong(o, 8);
        return Long.toString(v, 2);
    }
    static String h(String o) {
        long v = Long.parseLong(o, 8);
        return Long.toString(v, 16);
    }
}
