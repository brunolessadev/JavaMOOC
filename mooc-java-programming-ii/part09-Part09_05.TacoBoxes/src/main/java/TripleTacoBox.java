public class TripleTacoBox implements TacoBox{

    private int tacos;

    public TripleTacoBox() {
        this.tacos = 3;
    }

    @Override
    public int tacosRemaining() {
        return tacos;
    }

    @Override
    public void eat() {
        tacos -= 1;
    if (tacos < 0){
        tacos = 0;
    }
    }
}
