package ProxyDesignPattern;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }
    @Override
    public void display() {
        System.out.println("Displaying image with file name " + fileName);
    }

    private void loadFromDisk() {
        System.out.println("Loading the image from disk");
    }
}
