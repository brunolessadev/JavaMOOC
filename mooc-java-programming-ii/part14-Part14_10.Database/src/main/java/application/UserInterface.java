package application;

import java.sql.SQLException;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoDao database;
    private Boolean condition = true;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() throws SQLException {
        while (condition) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            System.out.print("> ");
            String command = this.scanner.nextLine();

            switch (command) {
                case "x":
                    System.out.println("Thank you!");
                    condition = false;
                    break;
                case "1":
                    System.out.println("Listing the database contents");
                    for (Todo todo : database.list()) {
                        System.out.println(todo);
                    }
                    break;
                case "2":
                    System.out.println("Adding a new todo");
                    System.out.println("Enter name");
                    String name = this.scanner.nextLine();
                    System.out.println("Enter description");
                    String description = this.scanner.nextLine();
                    database.add(new Todo(name, description, false));
                    break;
                case "3":
                    System.out.println("Which todo should be marked as done (give the id)?");
                    int id = Integer.parseInt(this.scanner.nextLine());
                    database.markAsDone(id);
                    break;
                case "4":
                    System.out.println("Which todo should be removed (give the id)?");
                    int remove = Integer.parseInt(this.scanner.nextLine());
                    database.remove(remove);
                    break;
            }
        }
    }

}