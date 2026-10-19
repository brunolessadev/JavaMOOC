package mooc.logic;

import mooc.ui.UserInterface;

public class ApplicationLogic {

    private final UserInterface userInterface;

    public ApplicationLogic(UserInterface userInterface){
        this.userInterface = userInterface;
    }

    public void execute(int times){
        for (int i = 0; i < times; i++) {
            System.out.println("Application logic is working");
            userInterface.update();
        }
    }
}
