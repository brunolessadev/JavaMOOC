
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        if(!list.isEmpty()){
            System.out.print("Search for? ");
            Integer indexSearch = Integer.valueOf(scanner.nextLine());

            for (int i = 0; i < list.size(); i++) {
                if(indexSearch == list.get(i)){
                    System.out.println( list.get(i) + " is at index " + i);
                }
            }
        }
    }
}
