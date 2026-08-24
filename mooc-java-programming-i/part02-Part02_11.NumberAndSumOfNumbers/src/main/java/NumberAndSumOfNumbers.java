
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer one = 0;
        Integer two = 0;

        while(true){
            System.out.println("Give a number: ");
            Integer number = Integer.valueOf(scanner.nextLine());

            if(number == 0){
                break;
            }else {
                one = one +1;
                two = two + number;
            }
        }
        System.out.println("Number of numbers: " + one);
        System.out.println("Sum of the numbers: " + two);
    }
}
