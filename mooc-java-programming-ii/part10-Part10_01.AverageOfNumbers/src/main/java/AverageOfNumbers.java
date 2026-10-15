
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");

        while(true){

            String input = String.valueOf(scanner.nextLine());

            if (input.equals("end")){
                break;
            }

            integerArrayList.add(Integer.parseInt(input));

        }

        double average = integerArrayList.stream()
                .mapToInt(i -> i)
                .average()
                .orElse(0.0);

        System.out.println("average of the numbers: " + average);

    }
}
