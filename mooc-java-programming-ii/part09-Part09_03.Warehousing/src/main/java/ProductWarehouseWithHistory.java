public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        this.history = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        this.history.add(initialBalance);
    }

    public String history() {
        return this.history.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double result = super.takeFromWarehouse(amount);
        this.history.add(getBalance());
        return result;
    }

    public void printAnalysis() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
    }
}