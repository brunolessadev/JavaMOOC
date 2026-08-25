
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

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

            Integer greaTest = list.get(0);

            for (int i = 0; i < list.size(); i++) {
                if(greaTest < list.get(i)){
                    greaTest = list.get(i);
                }
            }

            System.out.println("The greatest number: " + greaTest);

        }

        // implement finding the greatest number in the list here
    }
}
