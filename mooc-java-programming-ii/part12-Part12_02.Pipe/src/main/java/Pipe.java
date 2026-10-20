import java.util.ArrayList;

public class Pipe <T>{

    private ArrayList<T> tArrayList;

    public Pipe() {
        this.tArrayList = new ArrayList<>();
    }

    public void putIntoPipe(T value){
        tArrayList.add(value);
    }

    public T takeFromPipe(){
        T option;
        if (tArrayList.isEmpty()){
            return null;
        }
        option = tArrayList.get(0);
        tArrayList.remove(0);
        return option;
    }

    public boolean isInPipe(){
        if (tArrayList.isEmpty()){
            return false;
        }
        return true;
    }
}
