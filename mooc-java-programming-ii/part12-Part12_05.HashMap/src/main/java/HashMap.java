
import java.util.ArrayList;

public class HashMap<K, V> {

    private ArrayList<Pair<K, V>>[] values;
    private int counter;

    public HashMap() {
        this.values = new ArrayList[32];
        this.counter = 0;
    }

    public void add(K key, V value){
        int index = Math.abs(key.hashCode()) % this.values.length;

        if (this.values[index] == null) {
            this.values[index] = new ArrayList<>();
        }

        ArrayList<Pair<K,V>> bucket = this.values[index];

        for (int i = 0; i < bucket.size(); i ++){
            Pair<K,V> pair = bucket.get(i);
            if (pair.getKey().equals(key)) {
                pair.setValue(value);
                return;
            }
        }
        bucket.add(new Pair<>(key, value));
        this.counter++;
    }

    public V get(K key) {
        int index = Math.abs(key.hashCode()) % this.values.length;

        if (this.values[index] == null) {
            return null;
        }

        ArrayList<Pair<K, V>> bucket = this.values[index];

        for (int i = 0; i < bucket.size(); i++) {
            Pair<K, V> pair = bucket.get(i);
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }

        return null;
    }

}