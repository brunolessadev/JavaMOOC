import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            String inputName = scanner.nextLine();

            if(inputName.isEmpty()){
                break;
            }

            int inputPages = Integer.parseInt(scanner.nextLine());
            int inputAge = Integer.parseInt(scanner.nextLine());

            books.add(new Book(inputName, inputPages, inputAge));
        }

        System.out.print("What information will be printed? ");
        String infoPrinted = scanner.nextLine();

        if(infoPrinted.equals("everything")){
            for (Book info : books){
                System.out.println(info.name + ", " + info.pages + " pages, " + info.age );
            }
        } else if (infoPrinted.equals("name")) {
            for (Book info : books){
                System.out.println(info.name);
            }
        }


    }
}
