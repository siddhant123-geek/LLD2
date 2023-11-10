package CommandDesignPattern;

public class SaveAction implements ActionListenerCommand {

    private Image image;

    public SaveAction(Image image) {
        this.image = image;
    }

    @Override
    public void execute() {
        image.save();
    }
}
