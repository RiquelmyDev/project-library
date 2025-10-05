package library;

public class DigitalMedia extends LibraryItem {
    protected String fileType;
    protected double storageMB;

    // mais uma vez, criando o construtor
    public DigitalMedia(String fileType, double storageMB, String title, int publicationYear){
        super(title, publicationYear);
        this.fileType = fileType;
        this.storageMB = storageMB;
    }

    @Override
    public void showItems(){
        super.showItems();
        System.out.println("the file type is : " + fileType);
        System.out.println("this file occupies" + storageMB + " in memory.");
    }
}