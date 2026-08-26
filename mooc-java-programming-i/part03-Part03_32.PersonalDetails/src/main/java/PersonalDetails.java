
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String longestName = "";
        int sumOfBirthYears = 0;
        int count = 0;

        while (true) {
            String text = scanner.nextLine();

            if (text.equals("")) {
                break;
            }

            String[] pieces = text.split(",");
            String name = pieces[0];
            int birthYear = Integer.parseInt(pieces[1]);

            if (name.length() > longestName.length()){
                longestName = name;
            }
            sumOfBirthYears = sumOfBirthYears + birthYear;
            count++;
        }
        System.out.println("Longest name: " + longestName);
        if (count > 0) {
            System.out.println("Average of the birth years: " + ((double) sumOfBirthYears / count));
        }
    }
}

