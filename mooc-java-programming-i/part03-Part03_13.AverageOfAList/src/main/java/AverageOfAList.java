
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> listNumbers = new ArrayList<>();

        while(true){
            Integer input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
            listNumbers.add(input);
        }
        if(!listNumbers.isEmpty()){
            int sum = 0;
            for (int i = 0; i < listNumbers.size(); i++) {
                sum = sum + listNumbers.get(i);
            }
            Double average = ((double) sum)/ listNumbers.size();
            System.out.println("Average: " + average);
        }
    }
}
