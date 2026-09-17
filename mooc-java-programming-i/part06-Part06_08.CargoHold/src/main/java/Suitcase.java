import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight = 0;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= this.maxWeight) {
            items.add(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item itemSum : this.items) {
            totalWeight = totalWeight + itemSum.getWeight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {

        if (items.size() == 0) {
            return "no items (" + totalWeight() + " kg)";
        } else if (items.size() == 1) {
            return items.size() + " item (" + totalWeight() + " kg)";
        } else {
            return this.items.size() + " items (" + totalWeight() + " kg)";
        }
    }
    public void printItems(){
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem(){
        if (items.isEmpty()){
            return null;
        }else {
            Item itemHeavier = this.items.get(0);
            for (Item itemsHeavier : this.items){
                if (itemHeavier.getWeight() < itemsHeavier.getWeight()){
                    itemHeavier = itemsHeavier;
                }
            }
            return itemHeavier;
        }
    }
}
