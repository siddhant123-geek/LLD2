package CommandDesignPattern;

public class OpenAction implements ActionListenerCommand {

    private Image image;

    public OpenAction(Image image) {
        this.image = image;
    }
    @Override
    public void execute() {
        image.open();
    }
}
