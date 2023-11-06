package OOP.taskRestoraunt;

public class RunRestaurants {
    public static void main(String [] args){
        WebOfRestaurants BreadAndSosiski = new WebOfRestaurants();
        WebOfRestaurants GoodProducts = new WebOfRestaurants();
        System.out.printf("Сосисок в сети Ресторанов: %s\nХлеба в сети Ресторанов: %s" +
                "\n___________________________\n", WebOfRestaurants.getSosiski(), WebOfRestaurants.getBread());
        GoodProducts.GiveFood();
        BreadAndSosiski.GetMoreProducts();
        System.out.printf("Сосисок в сети Ресторанов: %s\nХлеба в сети Ресторанов: %s" +
                "\n___________________________\n", WebOfRestaurants.getSosiski(), WebOfRestaurants.getBread());
        BreadAndSosiski.GiveFood();
        System.out.printf("Сосисок в сети Ресторанов: %s\nХлеба в сети Ресторанов: %s" +
                "\n___________________________\n", WebOfRestaurants.getSosiski(), WebOfRestaurants.getBread());
        BreadAndSosiski.GiveFood();
        System.out.printf("Сосисок в сети Ресторанов: %s\nХлеба в сети Ресторанов: %s" +
                "\n___________________________\n", WebOfRestaurants.getSosiski(), WebOfRestaurants.getBread());
        GoodProducts.GetMoreProducts();
        BreadAndSosiski.GiveFood();
        System.out.printf("Сосисок в сети Ресторанов: %s\nХлеба в сети Ресторанов: %s" +
                "\n___________________________\n", WebOfRestaurants.getSosiski(), WebOfRestaurants.getBread());
    }
}
