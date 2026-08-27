
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){

            String inputFirstName = scanner.nextLine();

            if(inputFirstName.isEmpty()){
                break;
            }

            String inputLastName = scanner.nextLine();

            String inputIdNumber = scanner.nextLine();


            infoCollection.add(new PersonalInformation(inputFirstName, inputLastName, inputIdNumber));
        }
        for (PersonalInformation info : infoCollection){
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }
    }
}
