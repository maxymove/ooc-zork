package command;

public class EchoCommand implements Command {

    public void execute(String arg) {
        System.out.printf("You type:%s\n", arg);
    }
}
