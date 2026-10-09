import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double>  historicalStorage;

    public ChangeHistory() {
        this.historicalStorage = new ArrayList<>();
    }

    public void add(double status){
        historicalStorage.add(status);
    }

    public void clear(){
        historicalStorage.clear();
    }

    public double maxValue() {
        if (this.historicalStorage.isEmpty()) {
            return 0.0;
        }

        double max = this.historicalStorage.get(0);
        for (double value : this.historicalStorage) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public double minValue() {
        if (this.historicalStorage.isEmpty()) {
            return 0.0;
        }

        double min = this.historicalStorage.get(0);
        for (double value : this.historicalStorage) {
            if (value < min) { // < em vez de >
                min = value;
            }
        }
        return min;
    }

    public double average() {
        if (this.historicalStorage.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (double value : this.historicalStorage) {
            sum += value;
        }
        return sum / this.historicalStorage.size();
    }

    @Override
    public String toString() {
        return this.historicalStorage.toString();
    }
}
