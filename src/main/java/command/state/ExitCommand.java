package command.state;

import command.Command;

public class ExitCommand implements Command {

    public void execute(String arg) {
        System.exit(0);
    }
}
