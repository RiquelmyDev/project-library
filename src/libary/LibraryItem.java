package libary;

public class LibraryItem {
    protected String item;
    protected int publicationYear;

    protected void showItems(){
        System.out.println(item);
        System.out.println(publicationYear);
    }
}