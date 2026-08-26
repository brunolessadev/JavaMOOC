
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            String text = String.valueOf(scanner.nextLine());
            if (text.equals("") || text.equals(" ")) {
                break;
            }

            String[] pieces = text.split(" ");
            System.out.println(pieces[0]);
            }
        }
    }

