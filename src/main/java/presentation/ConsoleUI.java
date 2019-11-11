package presentation;

import java.util.Scanner;
/**
 *
 * @author TM
 */
public class ConsoleUI implements UI{

    Scanner input = new Scanner(System.in);

    @Override
    public String getInput() {
        return input.nextLine();
    }

    @Override
    public void println(String msg) {
        System.out.println(msg);
    }

    
}