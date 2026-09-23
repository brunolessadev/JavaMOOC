public class Container {

    private int liquid = 0;

    public Container(){
    }

    public int contains(){
        return liquid;
    }

    public void add(int amount){
        if(amount > 0){
            liquid = liquid + amount;
            if (liquid > 100){
                liquid = 100;
            }
        }
    }

    public void remove(int amount){
        if (amount > 0){
            liquid = liquid - amount;
            if (liquid < 0){
                liquid = 0;
            }
        }
    }

    @Override
    public String toString() {
        return liquid + "/100";
    }
}
