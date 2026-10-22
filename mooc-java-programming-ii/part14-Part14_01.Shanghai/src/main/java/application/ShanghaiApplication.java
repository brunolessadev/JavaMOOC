package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    @Override
    public void start(Stage stage) {
        NumberAxis xAxis = new NumberAxis(2007, 2017, 1);
        NumberAxis yAxis = new NumberAxis(0, 100, 10);

        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Shanghai ranking");

        XYChart.Series<Number, Number> shanghaiData = new XYChart.Series<>();
        shanghaiData.setName("Shanghai");

        shanghaiData.getData().add(new XYChart.Data(2007, 73));
        shanghaiData.getData().add(new XYChart.Data(2008, 68));
        shanghaiData.getData().add(new XYChart.Data(2009, 72));
        shanghaiData.getData().add(new XYChart.Data(2010, 72));
        shanghaiData.getData().add(new XYChart.Data(2011, 74));
        shanghaiData.getData().add(new XYChart.Data(2012, 73));
        shanghaiData.getData().add(new XYChart.Data(2013, 69));
        shanghaiData.getData().add(new XYChart.Data(2014, 56));
        shanghaiData.getData().add(new XYChart.Data(2015, 51));
        shanghaiData.getData().add(new XYChart.Data(2016, 56));

        lineChart.getData().add(shanghaiData);

        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}