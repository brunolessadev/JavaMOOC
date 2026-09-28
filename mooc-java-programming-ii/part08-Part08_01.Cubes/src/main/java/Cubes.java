
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cube;
        int conversion;
        while (true){
            String input = scanner.next();
            if (input.equals("end")){
                break;
            }
            conversion = Integer.parseInt(input);
            cube = conversion * conversion * conversion;
            System.out.println(cube);
        }

    }
}
