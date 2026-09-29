
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean running = true;
        int first = 0;
        int second = 0;
        int amount = 0;

        while (running) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine().trim();
            if(input.isEmpty()) continue;


            String[] parts = input.split(" ");
            String command = parts[0];
            if(parts.length >= 2) {
                try{
                    amount = Integer.parseInt(parts[1]);
                }catch (Exception e){
                    continue;
                }
            }

            switch (command){
                case "quit":
                    running = false;
                    break;
                case "add":
                    if (amount > 0){
                        first += amount;
                        if(first > 100){
                            first = 100;
                        }
                    }
                    break;
                case "move":
                    if (amount > 0){
                        if (amount > first){
                            amount = first;
                        }
                        first -= amount;
                        second += amount;

                        if (second > 100){
                            second = 100;
                        }
                    }
                    break;

                case "remove":
                    if (amount > 0){
                        second -= amount;
                        if (second < 0){
                            second = 0;
                        }
                    }
            }
        }
    }

}
