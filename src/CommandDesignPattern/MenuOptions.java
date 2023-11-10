package CommandDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MenuOptions {

    private List<ActionListenerCommand> menus = new ArrayList<>();

    public void addToMenu(ActionListenerCommand command) {
        menus.add(command);
    }

    public void executeCommands() {
        for(ActionListenerCommand command : menus) {
            command.execute();
        }
    }
}
