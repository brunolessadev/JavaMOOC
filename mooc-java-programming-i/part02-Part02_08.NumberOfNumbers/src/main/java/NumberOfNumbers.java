
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ones = 0;

        while (true) {
            System.out.println("Give a number:");
            Integer number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }
            ones = ones + 1;

        }
        System.out.println("Number of numbers: " + ones);
    }
}
