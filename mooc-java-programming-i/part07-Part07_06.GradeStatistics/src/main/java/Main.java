
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> statistics = new ArrayList<>();
        int[] railings = new int[6];

        double average = 0;
        double sum = 0;
        double passing = 0;
        double sumPassing = 0;
        double percentage = 0;


        System.out.println("Enter point totals, -1 stops:");

        while(true){
            int input = Integer.parseInt(scanner.nextLine());

            if (input == -1){
                break;
            }

            if (input >= 0 && input <= 100){
                statistics.add(input);
            }
        }

        if (!statistics.isEmpty()){
            for (Integer statistic : statistics) {
                sum = (sum + statistic);

                if (statistic >= 50){
                    passing++;
                    sumPassing = (sumPassing + statistic);
                }

                if (statistic < 50) {
                    railings[0]++; // nota 0
                } else if (statistic < 60) {
                    railings[1]++; // nota 1
                } else if (statistic < 70) {
                    railings[2]++; // nota 2
                } else if (statistic < 80) {
                    railings[3]++; // nota 3
                } else if (statistic < 90) {
                    railings[4]++; // nota 4
                } else {
                    railings[5]++; // nota 5
                }

            }

            average = sum / statistics.size();
            System.out.println("Point average (all): " + average);

            if (passing > 0){
                average = sumPassing / passing;
                System.out.println("Point average (passing): " + average);
            }else {
                System.out.println("Point average (passing): -");
            }

            percentage = (passing / statistics.size()) * 100;
            System.out.println("Pass percentage: " + percentage);

            System.out.println("Grade distribution:");


            for (int i = 5; i >= 0 ; i--) {

                System.out.print(i + ": ");
                for (int j = 0; j < railings[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
