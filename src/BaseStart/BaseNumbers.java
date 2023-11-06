package BaseStart;
import java.util.Scanner;
public class BaseNumbers {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите первое число:");
            double num1 = scan.nextDouble();
            System.out.println("Введите второе число:");
            double num2 = scan.nextDouble();
            System.out.println("Введите действие:");
            String action = scan.nextLine();
            action = scan.nextLine();
            double res;
            switch (action) {
                case "+":
                    res = num1 + num2;
                    System.out.println("Результат = " + res);
                    break;
                case "-":
                    res = num1 - num2;
                    System.out.println("Результат = " + res);
                    break;
                case "*":
                    res = num1 * num2;
                    System.out.println("Результат = " + res);
                    break;
                case "/":
                    if (num2 == 0) {System.out.println("На нуль делить нельзя!"); break;}
                    else {    res = num1 / num2;
                        System.out.println("Результат = " + res);
                        break;}
                case "%":
                    if (num2 == 0) {System.out.println("На нуль делить нельзя!"); break;}
                    else {    res = num1 % num2;
                        System.out.println("Результат = " + res);
                        break;}
                default:
                    System.out.println("Извините я пока не знаю такого действия");
                    break;
            }
        }
    }
/*
byte - от -128 до 127 - 1 байт
short - от -32768 до 32767 - 2 байта
int - от -2147483648 до 2147483647 - 4 байта
long - от -9223372036854775808 до 9223372036854775807 - 8 байт

цифры с точкой -
float - 2.1234f
double - 21.24124123

один символ -
char

текст -
String

True - False -
boolean
 */

/*
        Scanner w = new Scanner(System.in);
        System.out.println("введите имя");
        String age = w.nextLine();
        System.out.println("ваше имя: " + age);

        Scanner q = new Scanner(System.in);
        System.out.println("введите возраст");
        int awe = q.nextInt();
        System.out.println("вам "+ awe + " лет");


 */
