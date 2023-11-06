package BaseStart;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.SimpleTimeZone;

public class StringFunctions {
    public static void main(String [] args){
        String text = "Hello world!";

        //Вверхний регистр
        String textupper = text.toUpperCase();
        System.out.println(textupper);

        //Нижний регистр
        String textlower = text.toLowerCase();
        System.out.println(textlower);

        //Длина строки
        int  textLen = text.length();
        System.out.println(textLen);

        //Есть ли в тексте текст?
        boolean texthello = text.contains("Hello");
        System.out.println(texthello);

        //Замена всей строки
        String replstxt = text.replaceAll("l", "q");
        System.out.println(replstxt);

        //Повторить n раз
        String repeatTxt = text.repeat(10);
        System.out.println(repeatTxt);

        //Разбить текст на массив String
        String names = "bomja;kiol;avel;lonpik";
        String[] arraystostr = names.split(";");
        System.out.println(Arrays.toString(arraystostr));

        //Объединение строк
        String word1 = "hi ";
        String word2 = "Bro";
        String reslt = word1+word2;
        System.out.println(reslt);

        //Начинается на подстрочку
        boolean startswithHel = text.startsWith("Hel");
        System.out.println("startswithHel");

        //Заканчивается на подстрочку
        boolean endwithHel = text.startsWith("orld");
        System.out.println("endwithHel");

        //Обрезка строки
        String firsFiveLetters = text.substring(0,7);
        System.out.println(firsFiveLetters);

        String name = "kolokol";
        int age = 12341;
        String phrase = String.format("Меня зовут %s. Мне %d лет.", name, age);
        System.out.println(phrase);
        String carMark = "Audi";
        String carModel = "Q3";
        double prise = 15_000.000;
        boolean hasAuto = true;
        String phras = """
                Привет, я менеджер салона %s
                У нас есть модель - %s за %f
                Есть ли у неё автоматическая коробка передач?
                %s
                """.formatted(carMark,carModel,prise,hasAuto ? "Да": "Нет");
        System.out.println(phras);
    }


}
