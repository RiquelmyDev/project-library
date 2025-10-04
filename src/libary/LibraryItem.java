package libary;

public class LibraryItem {
    protected String item;
    protected int publicationYear;

    public LibraryItem(String item, int publicationYear) {
        this.item = item;
        this.publicationYear = publicationYear;
    }

    public String getItem(){
        return item;
    }

    public int getPublicationYear(){
        return publicationYear;
    }

    protected void showItems(){
        System.out.println(item);
        System.out.println(publicationYear);
    }
}