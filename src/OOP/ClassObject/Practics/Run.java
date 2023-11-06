package OOP.ClassObject.Practics;

public class Run {
    public static void main(String[] args) {
        User user1 = new User("abllazzing", 11111);
        User user2 = new User("abllazzing", 22222);

        System.out.println((user1.hashCode()) + "\n" + (user2.hashCode()));
        boolean result = false;
        if (user1.equals(user2)){
            result = true;
        }
        System.out.println(result);
    }
}
