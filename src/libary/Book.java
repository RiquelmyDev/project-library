package libary;

public class Book extends LibraryItem{
    protected String author;
    protected int numberPages;




    @Override
    public void showItems(){
        super.showItems();
        System.out.println("Author: " + author);
        System.out.println("Number of pages: " + numberPages);
    }
}

