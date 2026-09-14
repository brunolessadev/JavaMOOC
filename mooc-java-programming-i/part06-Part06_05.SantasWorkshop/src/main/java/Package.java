import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> giffts;

    public Package(){

        this.giffts = new ArrayList<>();
    }

    public void addGift (Gift gift){
        giffts.add(gift);
    }

    public int totalWeight(){
        int total = 0;
        for ( Gift gift : this.giffts){
            total = total + gift.getWeight();
        }
        return total;
    }

}
