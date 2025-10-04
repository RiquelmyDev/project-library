package libary;
import java.util.Date;

public class Magazine extends LibraryItem{
    protected String edition;
    protected Date currentDate;

    public Magazine(String edition, Date currentDate, String name, int publicationYear){
        super(name, publicationYear);
        this.edition = edition;
        this.currentDate = currentDate;
    }


    @Override
    public void showItems(){
        super.showItems();
        System.out.println("this is " + edition + " edition");
        System.out.println("The magazine was published in : " + currentDate);
    }
}
