
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> stringArrayList = new ArrayList<>();

        while(true){

            String input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }
            stringArrayList.add(input);

        }

        /*

        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));
        }

         */

        stringArrayList
                .forEach(System.out::println);

    }
}
