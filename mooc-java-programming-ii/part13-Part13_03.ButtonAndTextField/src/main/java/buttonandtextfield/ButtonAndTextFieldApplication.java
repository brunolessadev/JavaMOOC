package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class ButtonAndTextFieldApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {
        Button button = new Button("Button");
        TextField textField = new TextField();

        VBox componentGroup = new VBox();
        componentGroup.getChildren().add(button);
        componentGroup.getChildren().add(textField);

        Scene view = new Scene(componentGroup);

        window.setScene(view);
        window.show();

    }


    public static void main(String[] args) {

        launch(ButtonAndTextFieldApplication.class, args);
    }


}
