package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JokeApplication extends Application{


    public static void main(String[] args) {
        launch(JokeApplication.class, args);
    }

    @Override
    public void start(Stage window) throws Exception {
        final BorderPane layout = new BorderPane();

        HBox menu = new HBox(10);
        menu.setPadding(new Insets(20));

        Button jokeButton = new Button("Joke");
        Button answerButton = new Button("Answer");
        Button explanationButton = new Button("Explanation");

        menu.getChildren().addAll(jokeButton, answerButton, explanationButton);
        layout.setTop(menu);

        final Label jokeView = new Label("What do you call a bear with no teeth?");
        Label answerView = new Label("A gummy bear.");
        Label explanationView = new Label("A gummy bear has no teeth because it is made entirely of candy!");

        layout.setCenter(jokeView);

        jokeButton.setOnAction((event) ->{
            layout.setCenter(jokeView);
        });

        answerButton.setOnAction((event -> {
            layout.setCenter(answerView);
        }));

        explanationButton.setOnAction(event -> {
            layout.setCenter(explanationView);
        });

        Scene scene = new Scene(layout, 400, 250);
        window.setScene(scene);
        window.show();
    }
}
