package OOP.BookPractise;

public class RunBook {
    public static void main(String []args){
        Book book = new Book("Л.з.ы.а.ф.к.и", "Гризли Бред", 734, true);
        book.strok();//1
        book.strok(92);//2
        book.information();//3
    }
}
