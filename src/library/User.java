package library;
import java.util.ArrayList;

public class User {
    protected String name;
    protected ArrayList<LibraryItem> barrowedItems;

    public User(String name) {
        this.name = name;
        this.barrowedItems = new ArrayList<>();
    }

    public void lendItem(LibraryItem item){
        this.barrowedItems.add(item);
        System.out.println("Item lend: " + item.title);
    }

    public String getName(){
        return this.name;
    }


    public void viewItems(){
        System.out.println("_______________________________________");
        System.out.println("Here is the list of items loaned by the : " + this.name + " :");
        for (LibraryItem item : this.barrowedItems) {
            item.showItems();
            System.out.println("_______________________________________");
        }
    }

    // itens emprestados do array de bliblioteca (ainda nao fizemos!!!!)

}
