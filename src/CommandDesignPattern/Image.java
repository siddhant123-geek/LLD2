package CommandDesignPattern;

// Actions performed on this entity
public class Image {

    public void save() {
        System.out.println("Image saved to gallery");
    }

    public void open() {
        System.out.println("Image opened");
    }
}
