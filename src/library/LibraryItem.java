package library;

public class LibraryItem {
    protected String title;
    protected int publicationYear;

    public LibraryItem(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getItem(){
        return title;
    }

    public int getPublicationYear(){
        return publicationYear;
    }

    public void showItems(){
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}