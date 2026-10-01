import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start(){
        while (true){
            System.out.print("Command: ");
            String command = scanner.nextLine();

            switch (command){
                case "stop":
                    return;
                case "add":
                    System.out.print("To add: ");
                    String inputAdd = scanner.nextLine();
                    todoList.add(inputAdd);
                    break;
                case "list":
                    todoList.print();
                    break;
                case "remove":
                    System.out.print("Which one is removed? ");
                    int inputRemove = Integer.parseInt(scanner.nextLine());
                    todoList.remove(inputRemove);
                    break;
            }
        }
    }
}
