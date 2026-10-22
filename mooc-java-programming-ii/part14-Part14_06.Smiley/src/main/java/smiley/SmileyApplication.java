package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application{


    public static void main(String[] args) {
        launch(SmileyApplication.class,args);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();

        Canvas canvas = new Canvas(400, 400);
        GraphicsContext painter = canvas.getGraphicsContext2D();

        painter.setFill(Color.WHITE);
        painter.fillRect(0,0,400,400);

        painter.setFill(Color.BLACK);

        painter.fillRect(100, 100, 50, 50);
        painter.fillRect(250, 100, 50, 50);

        painter.fillRect(100, 250, 50, 50);
        painter.fillRect(150, 300, 100, 50);
        painter.fillRect(250, 250, 50, 50);

        layout.setCenter(canvas);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.setTitle("Smiley");
        window.show();
    }
}
