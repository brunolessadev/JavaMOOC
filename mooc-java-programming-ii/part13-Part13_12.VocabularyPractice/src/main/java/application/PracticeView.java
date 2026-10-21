package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class PracticeView {

    private Dictionary dictionary;
    private String word;

    public PracticeView(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.word = this.dictionary.getRandomWord();
    }

    public Parent getView() {
        GridPane layout = new GridPane();
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));

        Label instructionLabel = new Label("Translate the word '" + this.word + "'");
        TextField translationField = new TextField();
        Button checkButton = new Button("Check");
        Label feedbackLabel = new Label();

        layout.add(instructionLabel, 0, 0);
        layout.add(translationField, 0, 1);
        layout.add(checkButton, 0, 2);
        layout.add(feedbackLabel, 0, 3);

        checkButton.setOnAction((event) -> {
            String translation = translationField.getText();
            String correctTranslation = this.dictionary.get(this.word);

            if (translation.trim().equals(correctTranslation)) {
                feedbackLabel.setText("Correct!");
            } else {
                feedbackLabel.setText("Incorrect! The correct translation is " + correctTranslation);
            }

            // Sorteia uma nova palavra para a próxima tentativa
            this.word = this.dictionary.getRandomWord();
            if (this.word == null) {
                instructionLabel.setText("No words in the dictionary!");
                translationField.setDisable(true);
                checkButton.setDisable(true);
            } else {
                instructionLabel.setText("Translate the word '" + this.word + "'");
                translationField.clear();
            }
        });

        return layout;
    }
}