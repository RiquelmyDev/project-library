package libary;
import java.util.Date;

public class Magazine extends LibraryItem{
    protected String edition;
    protected Date currentDate;


    @Override
    public void showItems(){
        super.showItems();
        System.out.println("this is " + edition + " edition");
        System.out.println("The magazine was published in : " + currentDate);
    }
}
