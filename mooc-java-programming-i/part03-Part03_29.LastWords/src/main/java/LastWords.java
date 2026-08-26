
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = String.valueOf(scanner.nextLine());
            if (text.equals("") || text.equals(" ")) {
                break;
            }

            String[] pieces = text.split(" ");

            int index = pieces.length;
            System.out.println(pieces[index-1]);

            }
        }
    }

