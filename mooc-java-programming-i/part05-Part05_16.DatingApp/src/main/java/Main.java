import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDate simpleDate = new SimpleDate(1, 1, 1000);

        while (true) {
            System.out.println("Digite um numero para somar os dias ou 0 para encerrar a contagem");
            int input = Integer.parseInt(scanner.nextLine());

            if (input == 0) {
                break;
            }

            // Cria um novo objeto com a nova data sem alterar simpleDate
            SimpleDate novaData = simpleDate.afterNumberOfDays(input);
            System.out.println("Nova data calculada: " + novaData);
            System.out.println("Data original mantida: " + simpleDate);
        }

        System.out.println("Data final no objeto original: " + simpleDate);
    }
}