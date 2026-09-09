
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Archive> archiveArrayList = new ArrayList<>();


        String identifier;
        String name = "";

        while (true){
            System.out.println("Identifier? (empty will stop)");
            identifier = String.valueOf(scanner.nextLine());

            if(identifier.isEmpty()){
                break;
            }

            System.out.println("Name? (empty will stop)");
            name = String.valueOf(scanner.nextLine());

            if(name.isEmpty()){
                break;
            }

            Archive item = new Archive(identifier, name);

            if(!archiveArrayList.contains(item)) {
                archiveArrayList.add(new Archive(identifier, name));
            }
        }

        System.out.println("==Items==");
        for (Archive archive : archiveArrayList) {
            System.out.println(archive);
        }
    }
}
