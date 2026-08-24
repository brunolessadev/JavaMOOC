
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer one = 0;

        while(true){
            System.out.println("Give a number:");
            Integer number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            }else {
                one = (one + number);
            }
        }
        System.out.println("Sum of the numbers: " + one);

    }
}
