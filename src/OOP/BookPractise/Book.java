package OOP.BookPractise;

public class Book {
    String nameBook;
    String nameAuthor;
    int pages;
    boolean isDocumental;
    public Book(String nmbook, String nmAutor, int pg, boolean isD){
        this.nameBook = nmbook;
        this.nameAuthor = nmAutor;
        this.pages =pg;
        this.isDocumental = isD;
    }
    public void strok(){
        System.out.println
                ("Количество строк в книге1: " + this.pages *40);
    }
    public void strok(int strokOnPage){
        System.out.println
                ("Количество строк в книге2: " + this.pages * strokOnPage);
    }
    public void information(){
        System.out.printf
                ("%s от %s - %s\n",this.nameBook,this.nameAuthor, this.isDocumental ? "Документальная":"Недокументальная");
    }
}
