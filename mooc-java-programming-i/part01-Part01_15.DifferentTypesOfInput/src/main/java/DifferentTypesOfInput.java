
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string: ");
        String text = String.valueOf(scanner.nextLine());

        System.out.println("Give an integer:");
        Integer integer = Integer.valueOf(scanner.nextLine());

        System.out.println("Give a double: ");
        Double floatingPoint = Double.valueOf(scanner.nextLine());

        System.out.println("Give a boolean: ");
        Boolean trueOrFalse = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + floatingPoint);
        System.out.println("You gave the boolean " + trueOrFalse);
    }
}
