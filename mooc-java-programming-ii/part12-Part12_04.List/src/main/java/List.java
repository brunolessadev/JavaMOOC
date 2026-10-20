import java.lang.reflect.Type;

public class List <T>{

    private T[] values;

    private int counter;

    public List() {
        this.values = (T[]) new Object[10];
        this.counter = 0;
    }

    public void add(T value) {
        if(this.counter == this.values.length) {
            grow();
        }

        this.values[this.counter] = value;
        this.counter++;
    }
    
    public int size(){
        return this.counter;
    }

    private void grow(){
        int newSize = this.values.length + this.values.length / 2;
        T[] newValues = (T[]) new Object[newSize];
        for (int i = 0; i < this.values.length; i++) {
            newValues[i] = (T) this.values[i];
        }

        this.values = (T[]) newValues;
    }

    public T value(int index){
        if (index < 0 || index >= counter){
            return null;
        }
        return values[index];
    }
}
