import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner){
        this.jokeManager = manager;
        this.scanner = scanner;
    }

    public void start(){
        while (true){
            System.out.println(
                    "Commands:\n" +
                    " 1 - add a joke\n" +
                    " 2 - draw a joke\n" +
                    " 3 - list jokes\n" +
                    " X - stop");
            String input = scanner.nextLine();
            if (input.equals("X")){
                break;

            }else if(input.equals("1")){
                System.out.println("Write the joke to be added:");
                String inputAdd = scanner.nextLine();
                jokeManager.addJoke(inputAdd);

            }else if(input.equals("2")){
                System.out.println(jokeManager.drawJoke());

            }else if(input.equals("3")){
                System.out.println("Printing the jokes.");
                jokeManager.printJokes();
            }
        }
    }
}
