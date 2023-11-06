package OOP.Recursion;

public class Recursion {
    public int sum(int number) {
        if (number < 1) {
            return 0;
        }
        int result = number + sum(number-1);
        return result;
    }
    // number = 10 -> result = 10 + sum(9)
    //number = 9 -> result = 9 + sum(8)
    //...
    //number = 1 -> result = 1 +sum(0)
    //number = 0 - > return 0
}
