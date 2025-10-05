package library;

public class Book extends LibraryItem{
    protected String author;
    protected int numberPages;

    // TENHO QUE DEFINIR O CONSTRUTOR DA CLASSE LIVRO
    public Book(String title, int publicationYear, String author, int numberPages) {
        super(title, publicationYear);
        this.author = author;
        this.numberPages = numberPages;
    }



    @Override
    public void showItems(){
        super.showItems();
        System.out.println("Author: " + author);
        System.out.println("Number of pages: " + numberPages);
    }
}

