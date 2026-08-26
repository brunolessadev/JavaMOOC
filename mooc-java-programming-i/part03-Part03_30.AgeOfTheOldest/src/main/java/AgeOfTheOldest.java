
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;

        while (true){
            String text = String.valueOf(scanner.nextLine());
            if(text.equals("") || text.equals(" ")){
                break;
            }

            String[] pieces = text.split(",");
            int age = Integer.valueOf(pieces[1]);

            if(age > oldest){
                oldest = age;
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
