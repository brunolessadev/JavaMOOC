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
            String inputCommand = scanner.nextLine();

            if(inputCommand.equals("stop")){
                break;

            }else if (inputCommand.equals("add")){

                System.out.print("To add: ");
                String inputAdd = scanner.nextLine();
                todoList.add(inputAdd);

            } else if (inputCommand.equals("list")) {

                todoList.print();

            } else if (inputCommand.equals("remove")) {

                System.out.print("Which one is removed? ");
                String inputRemove = scanner.nextLine();
                todoList.remove(Integer.parseInt(inputRemove));

            }
        }
    }
}
