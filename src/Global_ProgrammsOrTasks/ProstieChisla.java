package Global_ProgrammsOrTasks;

public class ProstieChisla {
    public static void main(String[] args) {

        int i,j;
        boolean checker;

        System.out.print("Простые числа в диапозоне 2 - 100: ");

        for (i = 2; i<100; i++){
            checker = true;

            for (j = 2; j < i; j++){
                if (i % j == 0) {checker = false; break;}
            }
            if (checker)System.out.print(i + ", ");
        }
    }

}
