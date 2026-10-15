
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        while(true){
            int input = Integer.parseInt(scanner.nextLine());

            if (input < 0){
                break;
            }

            integerArrayList.add(input);

        }

        integerArrayList.stream()
                .filter(i -> i >= 1 && i <= 5)
                .collect(Collectors.toCollection(ArrayList::new))
                .forEach(System.out::println);

    }
}
