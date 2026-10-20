public class Hideout<T> {

    private T value;

    public Hideout() {
    }

    public void putIntoHideout(T toHide){
        value = toHide;
    }

    public T takeFromHideout(){
        T option = null;
        if (value != null){
            option = value;
            value = null;
        }
        return option;
    }

    public boolean isInHideout(){
        if (value != null){
            return true;
        }
        return false;
    }
}
