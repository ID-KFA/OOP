
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.*;

public class FamilyTree<E extends Human> implements Serializable, Iterable<E> {

    private List<E> humans;

    @Override
    public Iterator<E> iterator() {

        return new HumanIterator<E>(humans);
    }

    public FamilyTree() {
        this(new ArrayList<E>());

    }

    private FamilyTree(List<E> humans) {
        this.humans = humans;
    }

    public void add(E h) {
        humans.add(h);

    }

    public List<E> getHumanList() {
        return humans;
    }

    public List<E> getKids(String name) {

        List<E> kids = new ArrayList<E>();
        for (int i = 0; i < humans.size(); i++) {

            if (this.humans.get(i).dadOf() != null) {

                if (this.humans.get(i).dadOf().getName().equals(name)) {

                    kids.add(this.humans.get(i));
                }

            }

            if (this.humans.get(i).momOf() != null) {

                if (this.humans.get(i).momOf().getName().equals(name)) {

                    kids.add(this.humans.get(i));
                }

            }

        }
        return kids;

    }

}
