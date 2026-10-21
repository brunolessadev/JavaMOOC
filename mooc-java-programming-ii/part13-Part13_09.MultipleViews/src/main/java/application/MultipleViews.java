package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class, args);
    }

    @Override
    public void start(final Stage window) throws Exception {
        // --- PRIMEIRA VISTA (BorderPane) ---
        BorderPane firstLayout = new BorderPane();
        Label firstLabel = new Label("First view!");
        Button toSecondButton = new Button("To the second view!");

        firstLayout.setTop(firstLabel);
        firstLayout.setCenter(toSecondButton);
        Scene firstScene = new Scene(firstLayout, 400, 300);

        // --- SEGUNDA VISTA (VBox) ---
        VBox secondLayout = new VBox();
        Button toThirdButton = new Button("To the third view!");
        Label secondLabel = new Label("Second view!");

        secondLayout.getChildren().addAll(toThirdButton, secondLabel);
        final Scene secondScene = new Scene(secondLayout, 400, 300);

        // --- TERCEIRA VISTA (GridPane) ---
        GridPane thirdLayout = new GridPane();
        Label thirdLabel = new Label("Third view!");
        Button toFirstButton = new Button("To the first view!");

        thirdLayout.add(thirdLabel, 0, 0);
        thirdLayout.add(toFirstButton, 1, 1);
        final Scene thirdScene = new Scene(thirdLayout, 400, 300);

        // --- EVENTOS DE TRANSIÇÃO ---
        toSecondButton.setOnAction((event) -> {
            window.setScene(secondScene);
        });

        toThirdButton.setOnAction((event) -> {
            window.setScene(thirdScene);
        });

        toFirstButton.setOnAction((event) -> {
            window.setScene(firstScene);
        });

        // Configuração inicial da janela
        window.setScene(firstScene);
        window.show();
    }
}