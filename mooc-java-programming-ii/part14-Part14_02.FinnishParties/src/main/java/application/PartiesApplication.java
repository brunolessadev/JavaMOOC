package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PartiesApplication extends Application {

    public static void main(String[] args) {
        launch(PartiesApplication.class,args);
    }

    @Override
    public void start(Stage window) throws Exception {
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);

        xAxis.setLabel("Year");
        yAxis.setLabel("Relative support (%)");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");

        try {
            List<String> lines = Files.readAllLines(Paths.get("partiesdata.tsv"));
            String[] years = lines.get(0).split("\t");

            for (int i = 1; i < lines.size(); i++) {
                String[] pieces = lines.get(i).split("\t");
                String partyName = pieces[0];

                XYChart.Series<Number, Number> data = new XYChart.Series<>();
                data.setName(partyName);

                for (int j = 1; j < years.length; j++) {
                    int year = Integer.parseInt(years[j]);

                    if (!pieces[j].equals("-")) {
                        double rating = Double.parseDouble(pieces[j]);
                        data.getData().add(new XYChart.Data<>(year, rating));
                    }
                }

                lineChart.getData().add(data);
            }
        } catch (Exception e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        Scene scene = new Scene(lineChart, 640, 480);
        window.setScene(scene);
        window.show();
    }
}
