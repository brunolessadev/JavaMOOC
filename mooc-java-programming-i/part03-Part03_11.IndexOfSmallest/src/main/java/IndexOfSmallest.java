
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> listNumbers = new ArrayList<>();
        while(true){

            int input = Integer.valueOf(scanner.nextLine());
            if(input == 9999){
                break;
            }
            listNumbers.add(input);
        }
        System.out.println("");

        if(!listNumbers.isEmpty()){
            int smallTest = listNumbers.get(0);

            for (int number : listNumbers){
                if(number < smallTest){
                    smallTest = number;
                }
            }
            System.out.println("Smallest number: " + smallTest);
            for (int i = 0; i < listNumbers.size(); i++) {
                if(listNumbers.get(i) == smallTest){
                    System.out.println("Found at index: " + i);
                }
            }
        }
    }
}
