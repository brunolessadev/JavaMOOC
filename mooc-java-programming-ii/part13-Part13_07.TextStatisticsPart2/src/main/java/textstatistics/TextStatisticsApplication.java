package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class TextStatisticsApplication extends Application{


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class,args);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();
        TextArea textArea = new TextArea();
        Label letters = new Label("Letters: 0 ");
        Label words = new Label("Words: 0 ");
        Label wordsLongest = new Label("The longest word is: " );
        HBox hBox = new HBox(letters, words, wordsLongest);

        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            letters.setText("Letters: " + newValue.length());

            String[] arrayList = newValue.split(" ");
            String longest = arrayList[0];

            for (int i = 0; i < arrayList.length; i++) {
                if (longest.length() < arrayList[i].length()){
                    longest = arrayList[i];
                }
            }

            words.setText("Words: " + arrayList.length);
            wordsLongest.setText("The longest word is: " + longest);

        });

        layout.setCenter(textArea);
        layout.setBottom(hBox);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();

    }
}
