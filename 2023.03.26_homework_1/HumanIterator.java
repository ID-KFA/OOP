import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HumanIterator implements Iterator<Human> {

    private List<Human> humans;
    private int index;

    public HumanIterator(List<Human> h) {
        this.humans = h;
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return index < humans.size();
    }

    @Override
    public Human next() {
        // TODO Auto-generated method stub
        return humans.get(index++);
    }

    @Override
    public void remove() {
        // TODO Auto-generated method stub

    }
}
