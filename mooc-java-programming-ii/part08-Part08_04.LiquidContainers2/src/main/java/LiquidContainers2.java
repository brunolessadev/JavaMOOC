
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {

        Container first = new Container();
        Container second = new Container();
        int amount = 0;

        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];


            if (command.equals("quit")) {
                break;
            }

            try {
                amount = Integer.parseInt(parts[1]);
            }catch (Exception ignored){
                continue;
            }

            if (command.equals("add")) {
                first.add(amount);
            } else if (command.equals("remove")) {
                second.remove(amount);
            }else if (command.equals("move")) {
                if (amount > first.contains()) {
                    second.add(first.contains());
                    first.remove(first.contains());
                } else {
                    first.remove(amount);
                    second.add(amount);
                }
            }
        }
    }

}
