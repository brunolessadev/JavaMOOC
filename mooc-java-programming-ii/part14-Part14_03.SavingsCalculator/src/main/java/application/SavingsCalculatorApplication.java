
package application;

import java.util.Locale;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();

        LineChart<Number, Number> lineChart =
                new LineChart<>(xAxis, yAxis);

        lineChart.setTitle("Savings calculator");
        lineChart.setAnimated(false);

        layout.setCenter(lineChart);

        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(10));

        // Monthly savings
        BorderPane savingsContainer = new BorderPane();

        Label savingsLabel = new Label("Monthly savings");
        Slider savingsSlider = new Slider(25, 250, 25);

        // Creates the additional component expected by the TMC tests.
        savingsSlider.setShowTickMarks(true);

        Label savingsValue = new Label(
                String.format(Locale.US, "%.2f", savingsSlider.getValue())
        );

        savingsContainer.setLeft(savingsLabel);
        savingsContainer.setCenter(savingsSlider);
        savingsContainer.setRight(savingsValue);

        // Yearly interest rate
        BorderPane yearlyContainer = new BorderPane();

        Label yearlyLabel = new Label("Yearly interest rate");
        Slider yearlySlider = new Slider(0, 10, 0);

        // Applies the same correction to the interest rate slider.
        yearlySlider.setShowTickMarks(true);

        Label yearlyValue = new Label(
                String.format(Locale.US, "%.2f", yearlySlider.getValue())
        );

        yearlyContainer.setLeft(yearlyLabel);
        yearlyContainer.setCenter(yearlySlider);
        yearlyContainer.setRight(yearlyValue);

        vBox.getChildren().addAll(
                savingsContainer,
                yearlyContainer
        );

        layout.setTop(vBox);

        XYChart.Series<Number, Number> savingsSeries =
                new XYChart.Series<>();

        savingsSeries.setName("Savings");

        XYChart.Series<Number, Number> yearlyInterestSeries =
                new XYChart.Series<>();

        yearlyInterestSeries.setName("Savings with interest");

        lineChart.getData().addAll(
                savingsSeries,
                yearlyInterestSeries
        );

        savingsSlider.valueProperty().addListener(
                (observable, oldValue, newValue) -> {
                    savingsValue.setText(
                            String.format(Locale.US, "%.2f",
                                    newValue.doubleValue())
                    );

                    updateChart(
                            savingsSlider.getValue(),
                            yearlySlider.getValue(),
                            savingsSeries,
                            yearlyInterestSeries
                    );
                }
        );

        yearlySlider.valueProperty().addListener(
                (observable, oldValue, newValue) -> {
                    yearlyValue.setText(
                            String.format(Locale.US, "%.2f",
                                    newValue.doubleValue())
                    );

                    updateChart(
                            savingsSlider.getValue(),
                            yearlySlider.getValue(),
                            savingsSeries,
                            yearlyInterestSeries
                    );
                }
        );

        updateChart(
                savingsSlider.getValue(),
                yearlySlider.getValue(),
                savingsSeries,
                yearlyInterestSeries
        );

        Scene scene = new Scene(layout, 640, 480);

        window.setScene(scene);
        window.show();
    }

    private void updateChart(
            double savings,
            double yearlyInterest,
            XYChart.Series<Number, Number> savingsSeries,
            XYChart.Series<Number, Number> yearlyInterestSeries) {

        savingsSeries.getData().clear();
        yearlyInterestSeries.getData().clear();

        double savingsTotal = 0;
        double interestTotal = 0;

        for (int year = 0; year <= 30; year++) {
            savingsSeries.getData().add(
                    new XYChart.Data<>(year, savingsTotal)
            );

            yearlyInterestSeries.getData().add(
                    new XYChart.Data<>(year, interestTotal)
            );

            savingsTotal += savings * 12;

            interestTotal = (interestTotal + savings * 12)
                    * (1 + yearlyInterest / 100.0);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
