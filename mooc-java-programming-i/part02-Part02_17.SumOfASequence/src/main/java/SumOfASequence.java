
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int total = 0;

        Integer n = Integer.valueOf(scanner.nextLine());

        while(i < n){
            i++;
            total = total + i;
        }
        System.out.println(total);
    }
}
