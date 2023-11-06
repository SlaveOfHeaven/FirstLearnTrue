package Global_ProgrammsOrTasks.CodeWars;

public class Banjo {
    public static String areYouPlayingBanjo(String name){
        int r2=2;
        char n =0;
        int z=2;
        if (r2 == 0);
        else if (n == 82)
        {z=1; System.out.println("Nope!" + name + " plays banjo");}
        else if (n == 114)
        {z = 2; System.out.println("Nope! Remember lower case counts too!" + name + " plays banjo");}
        else
        {z = 3; System.out.println("Nope!" + name + " does not play banjo");}
        if (z == 1)
            return ("Nope!" + name + " plays banjo");
        else if (z==2)
            return ("Nope! Remember lower case counts too!" + name + " plays banjo");
        else
            return("Nope!" + name + " does not play banjo");
    }
}
