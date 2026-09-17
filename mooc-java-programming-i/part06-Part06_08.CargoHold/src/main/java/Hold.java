import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Hold( int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public int sumWeight() {
        int sumWeight = 0;
        for (Suitcase suitcaseSum : this.suitcases) {
            sumWeight = sumWeight + suitcaseSum.totalWeight();
        }
        return sumWeight;
    }

    public void addSuitcase(Suitcase suitcase){
        if(sumWeight() + suitcase.totalWeight() <= maxWeight){
            suitcases.add(suitcase);
        }
    }

    public void printItems(){
        for (Suitcase suitcase : this.suitcases){
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases " + "(" + sumWeight() + " kg)";
    }
}
