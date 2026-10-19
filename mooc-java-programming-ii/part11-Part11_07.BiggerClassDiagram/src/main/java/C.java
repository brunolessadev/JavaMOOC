import java.util.ArrayList;
import java.util.List;

public class C extends B implements IC{
    private List<E> es;

    public C(){
        this.es = new ArrayList<>();
    }

    public List<E> getEs(){
        return es;
    }
}
