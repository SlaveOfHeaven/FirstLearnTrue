package BaseStart;

public class PracticStringFunctions {
public static void main(String [] args){
    String text = "my name is Giovanni Giorgio";
    String [] arrtx1 = text.substring(11).toLowerCase().split(" ");
    for (String s : arrtx1) {
        System.out.println(s + " - " + s.length());
    }
}
}
