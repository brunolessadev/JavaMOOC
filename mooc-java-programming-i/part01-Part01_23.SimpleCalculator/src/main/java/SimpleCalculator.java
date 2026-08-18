
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        Integer first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        Integer second = Integer.valueOf(scanner.nextLine());

        int total1 = first + second;
        int total2 = first - second;
        int total3 = first * second;
        Double total4 = (double)first / second;

        System.out.println(first + " + " + second + " = " + total1);
        System.out.println(first + " - " + second + " = " + total2);
        System.out.println(first + " * " + second + " = " + total3);
        System.out.println(first + " / " + second + " = " + total4);

    }
}
