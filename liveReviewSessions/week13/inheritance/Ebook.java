package week13.inheritance;

public class Ebook extends Book{

    int sizeAtMemory;
    int pages;


    public Ebook(String title, String type, String author, double price, int sizeAtMemory, int pages) {
        super(title, type, author, price);
        this.sizeAtMemory = sizeAtMemory;
        this.pages = pages;
    }


}
