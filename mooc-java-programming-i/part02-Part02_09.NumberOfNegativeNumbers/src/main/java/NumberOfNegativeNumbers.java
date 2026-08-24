
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ones = 0;

        while(true){
            System.out.println("Give a number:");
            Integer number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            } else if ( number < 0) {
                ones = ones + 1;
            }else {
                continue;
            }
        }
        System.out.println("Number of negative numbers: " + ones);
    }
}
