import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> movables;

    public Herd() {
        this.movables = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        movables.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : this.movables) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Movable movable : this.movables) {
            sb.append(movable.toString()).append("\n");
        }
        return sb.toString().trim();
    }
}
