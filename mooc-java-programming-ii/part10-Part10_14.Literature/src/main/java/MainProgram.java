
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> bookArrayList = new ArrayList<>();

        while(true){
            System.out.print("Input the name of the book, empty stops: ");
            String inputName = String.valueOf(scanner.nextLine());

            if (inputName.isEmpty()){
                break;
            }

            System.out.print("Input the age recommendation: ");
            int inputAge = Integer.parseInt(scanner.nextLine());

            bookArrayList.add(new Book(inputName, inputAge));

        }

        System.out.println(bookArrayList.size() + " books in total.");

        System.out.println("Books:");
        Collections.sort(bookArrayList);
        bookArrayList.stream()
                .forEach(System.out::println);

    }

}
