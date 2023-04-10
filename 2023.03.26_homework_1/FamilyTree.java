
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.io.*;

public class FamilyTree<E extends Human> implements Serializable, Iterable<E> {

 
    private List<E> humans;
    private Writable writable;

    public FamilyTree(Writable writable){

        this.writable=writable;
    }

    public void setWritable (Writable writable){
        this.writable=writable;
    }
    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
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

    public List<E> getInfo() {
        List res = new ArrayList();
        String str;
        for (int i = 0; i < humans.size(); i++) {
            str = humans.get(i).toString();
            res.add(str);

        }
        return res;

    }
    // public Human getByName(String name){

    // for (int i = 0; i < humans.size(); i++) {
    // if (this.humans.get(i).getName().equals(name))
    // result=this.humans.get(i);

    // }
    // return result;

    // }

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
