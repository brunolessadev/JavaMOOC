
import java.util.*;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(-5);
        numbers.add(7);
        numbers.add(-2);
        numbers.add(0);
        numbers.add(10);

        System.out.println("Lista original: " + numbers);

        List<Integer> positiveNumbers = positive(numbers);

        System.out.println("Apenas números positivos: " + positiveNumbers);
    }

    public static List<Integer> positive(List<Integer> numbers){

        return numbers.stream()
                .filter(i -> i > 0)
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
