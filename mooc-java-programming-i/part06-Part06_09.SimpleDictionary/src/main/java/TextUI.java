import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start(){

        while (true){
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if(input.equals("end")){
                System.out.println("Bye bye!");
                break;
            } else if (input.equals("add")) {

                System.out.print("Word: ");
                String word = scanner.nextLine();

                System.out.print("Translation: ");
                String translation = scanner.nextLine();

                simpleDictionary.add(word,translation);

            } else if (input.equals("search")) {
                System.out.print("To be translated: ");
                String wordToTranslate = scanner.nextLine();
                String translation = simpleDictionary.translate(wordToTranslate);
                if(translation != null){
                    System.out.println("Translation: " + simpleDictionary.translate(wordToTranslate));
                }else {
                    System.out.println("Word " + wordToTranslate + " was not found");
                }

            } else {
                System.out.println("Unknown command");
            }
        }
    }

}
