import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            String inputName = scanner.nextLine();
            
            if(inputName.isEmpty()){
                break;
            }

            int inputDuration = Integer.parseInt(scanner.nextLine());

            programs.add(new TelevisionProgram(inputName, inputDuration));
        }

        int maxDuration = Integer.parseInt(scanner.nextLine());

        for (TelevisionProgram info : programs){
            if(info.getDuration() <= maxDuration){
                System.out.println(info.getName() + ", " + info.getDuration() + " minutes");
            }
        }

    }
}
