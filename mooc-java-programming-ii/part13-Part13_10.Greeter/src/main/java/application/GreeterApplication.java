package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreeterApplication extends Application{


    public static void main(String[] args) {
        launch(GreeterApplication.class, args);
    }

    @Override
    public void start(Stage window) throws Exception {
        VBox firstLayout = new VBox(10);
        firstLayout.setPadding(new Insets(20));

        Label instructionLabel = new Label("Enter your name and start");
        TextField nameField = new TextField();
        Button startButton = new Button("Start");

        firstLayout.getChildren().addAll(instructionLabel, nameField, startButton);
        Scene firstScene = new Scene(firstLayout, 300, 200);

        StackPane secondLayout = new StackPane();
        Label welcomeLabel = new Label();
        secondLayout.getChildren().add(welcomeLabel);
        Scene secondScene = new Scene(secondLayout, 300, 200);

        startButton.setOnAction((event) -> {
            String name = nameField.getText();
            welcomeLabel.setText("Welcome " + name + "!");
            window.setScene(secondScene);
        });


        window.setScene(firstScene);
        window.show();
    }
}
