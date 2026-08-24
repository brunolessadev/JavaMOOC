
import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = Integer.valueOf(scanner.nextLine());

        printFromNumberToOne(number);

    }

    public static void printFromNumberToOne(int number) {
        for (int i = number; i > 0; i--) {
            System.out.println(i);
        }
    }

}
