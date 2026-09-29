import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int total = 0;

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 0) {
                if (counter > 0) {
                    System.out.println((double) total / counter);
                    break;
                }
                System.out.println("Cannot calculate the average");
                break;
            } else if (input > 0) {
                total = total + input;
                counter++;
            }

        }

    }
}
