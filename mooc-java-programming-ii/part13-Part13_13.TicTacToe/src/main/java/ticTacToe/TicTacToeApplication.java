package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();
        layout.setPadding(new Insets(10, 10, 10, 10));

        Label turnLabel = new Label("Turn: X");
        turnLabel.setFont(Font.font(20));
        layout.setTop(turnLabel);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);

        Button[][] buttons = new Button[3][3];
        final String[] turn = {"X"};
        final boolean[] gameEnded = {false};

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                Button btn = new Button(" ");
                btn.setFont(Font.font("Monospaced", 40));
                buttons[row][col] = btn;

                btn.setOnAction((event) -> {
                    if (gameEnded[0] || !btn.getText().equals(" ")) {
                        return;
                    }

                    btn.setText(turn[0]);

                    if (checkWin(buttons, turn[0]) || isBoardFull(buttons)) {
                        gameEnded[0] = true;
                        turnLabel.setText("The end!");
                        return;
                    }

                    if (turn[0].equals("X")) {
                        turn[0] = "O";
                    } else {
                        turn[0] = "X";
                    }

                    turnLabel.setText("Turn: " + turn[0]);
                });

                grid.add(btn, col, row);
            }
        }

        layout.setCenter(grid);

        Button resetButton = new Button("Reset");
        resetButton.setFont(Font.font(14));
        resetButton.setOnAction((event) -> {
            turn[0] = "X";
            gameEnded[0] = false;
            turnLabel.setText("Turn: X");
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    buttons[r][c].setText(" ");
                }
            }
        });

        layout.setBottom(resetButton);
        BorderPane.setAlignment(resetButton, Pos.CENTER);
        BorderPane.setMargin(resetButton, new Insets(10, 0, 0, 0));

        Scene scene = new Scene(layout, 320, 420);
        window.setScene(scene);
        window.show();
    }

    private boolean checkWin(Button[][] buttons, String symbol) {
        for (int i = 0; i < 3; i++) {
            if (buttons[i][0].getText().equals(symbol) &&
                    buttons[i][1].getText().equals(symbol) &&
                    buttons[i][2].getText().equals(symbol)) {
                return true;
            }
            if (buttons[0][i].getText().equals(symbol) &&
                    buttons[1][i].getText().equals(symbol) &&
                    buttons[2][i].getText().equals(symbol)) {
                return true;
            }
        }

        if (buttons[0][0].getText().equals(symbol) &&
                buttons[1][1].getText().equals(symbol) &&
                buttons[2][2].getText().equals(symbol)) {
            return true;
        }

        if (buttons[0][2].getText().equals(symbol) &&
                buttons[1][1].getText().equals(symbol) &&
                buttons[2][0].getText().equals(symbol)) {
            return true;
        }

        return false;
    }

    private boolean isBoardFull(Button[][] buttons) {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (buttons[r][c].getText().equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class, args);
    }
}