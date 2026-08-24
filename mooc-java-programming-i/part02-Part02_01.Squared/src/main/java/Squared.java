
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer number = Integer.valueOf(scanner.nextLine());
        number = number * number;
        System.out.println(number);

    }
}
