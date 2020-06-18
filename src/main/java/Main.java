import command.Command;
import command.CommandFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cmd = "";
        while (true) {
            System.out.println(">");
            cmd = scanner.nextLine();
            String words[] = cmd.split(" ");
            Command command = CommandFactory.getCommand(words[0]);
            if (command != null) {
                if (words.length == 1) {
                    command.execute(null);
                } else {
                    command.execute(words[1]);
                }
            }
        }

    }

}
