
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {

            String input = String.valueOf(scanner.nextLine());

            if (input.equals("end")) {
                break;
            }

            integerArrayList.add(Integer.parseInt(input));

        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");

        String choice = scanner.nextLine();

        if (choice.equals("n")) {
            double average = integerArrayList.stream()
                    .mapToInt(i -> i)
                    .filter(i -> i < 0)
                    .average()
                    .orElse(0.0);

            System.out.println("Average of the negative numbers: " + average);


        } else if (choice.equals("p")) {
            double average = integerArrayList.stream()
                    .mapToInt(i -> i)
                    .filter(i -> i > 0)
                    .average()
                    .orElse(0.0);

            System.out.println("Average of the positive numbers: " + average);
        }
    }
}
