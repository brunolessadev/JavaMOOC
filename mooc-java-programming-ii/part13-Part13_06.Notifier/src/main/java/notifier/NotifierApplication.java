package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;


public class NotifierApplication extends Application{


    public static void main(String[] args) {
        launch(NotifierApplication.class,args);
    }

    @Override
    public void start(Stage window) throws Exception {

        VBox layout = new VBox();
        TextField textField = new TextField();
        Button button = new Button();
        Label label = new Label();

        button.setOnAction((event) -> {
            String text = textField.getText();
            label.setText(text);
        });

        layout.getChildren().addAll(textField, button, label);

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.show();


    }
}
