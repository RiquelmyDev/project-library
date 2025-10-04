package libary;

public class DigitalMedia extends LibraryItem {
    protected String fileType;
    protected double storageMB;


    @Override
    public void showItems(){
        super.showItems();
        System.out.println("the file type is : " + fileType);
        System.out.println("this file occupies" + storageMB + " in memory.");
    }
}