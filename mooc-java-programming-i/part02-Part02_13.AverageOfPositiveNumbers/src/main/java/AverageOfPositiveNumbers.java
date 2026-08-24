
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = 0;
        int two = 0;
        int number = 0;

        while(true){
            System.out.println("Give a number:");
            number = Integer.parseInt(scanner.nextLine());

            if( number == 0){
                break;
            }else if(number > 0){
                one = one + 1;
                two = two + number;
            }
        }

        if(one > 0){
            double three = ((double) two /one);
            System.out.println(three);
        }else {
            System.out.println("Cannot calculate the average");
        }
    }
}
