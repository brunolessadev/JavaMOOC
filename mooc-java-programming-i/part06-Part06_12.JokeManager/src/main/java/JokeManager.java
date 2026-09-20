import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokers;

    public JokeManager(){
        this.jokers = new ArrayList<>();
    }

    public void addJoke(String joke){
        jokers.add(joke);
    }

    public String drawJoke(){
        if(jokers.isEmpty()){
            return "Jokes are in short supply.";
        }else{
            Random draw = new Random();
            int index = draw.nextInt(jokers.size());
            return this.jokers.get(index);
        }
    }

    public void printJokes(){
        for (int i = 0; i < jokers.size(); i++) {
            System.out.println(jokers.get(i));
        }
    }
}
