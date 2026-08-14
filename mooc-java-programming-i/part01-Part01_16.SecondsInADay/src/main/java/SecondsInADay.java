
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        Integer days = Integer.valueOf(scanner.nextLine());

        Integer second = days * 24 * 60 *60;

        System.out.println(second);

    }
}
