
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        int one = 0;
        int two = 0;
        double three = 0;
        int four = 0;
        int five = 0;


        while(true){
            System.out.println("Give numbers:");
            Integer number = Integer.valueOf(scanner.nextLine());
            if(number == -1){
                break;
            }else {
                one = one + number;
                two = two + 1;
                if(number % 2 ==0){
                    four = four + 1;
                }else {
                    five = five +1;
                }
            }
        }
        three = (double) one / two;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + one);
        System.out.println("Numbers: " + two);
        System.out.println("Average: " + three);
        System.out.println("Even: " + four);
        System.out.println("Odd: " + five);
    }
}
