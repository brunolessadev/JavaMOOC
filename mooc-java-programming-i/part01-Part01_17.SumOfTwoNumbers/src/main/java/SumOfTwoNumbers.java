
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        Integer first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        Integer second = Integer.valueOf(scanner.nextLine());

        Integer total = first + second;
        System.out.println("The sum of the numbers is " + total);
    }
}
