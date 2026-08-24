
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.println("First number?");
        Integer first = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        Integer last = Integer.valueOf(scanner.nextLine());


        for (int i  = first; i < last + 1; i++ ){
            sum = sum + i;
        }
        System.out.println("The sum is: " + sum);
    }
}
