import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cardArrayList = new ArrayList<>();

    public void add(Card card){
        cardArrayList.add(card);
    }

    public void print(){
        cardArrayList.stream()
                .forEach(System.out::println);
    }

    public void sort(){
        Collections.sort(cardArrayList);
    }

    public void sortBySuit() {
        Collections.sort(cardArrayList, new BySuitInValueOrder());
    }


    @Override
    public int compareTo(Hand other) {
        int thisSum = 0;
        for (Card card : this.cardArrayList) {
            thisSum += card.getValue();
        }

        int otherSum = 0;
        for (Card card : other.cardArrayList) {
            otherSum += card.getValue();
        }

        return thisSum - otherSum;
    }
}
