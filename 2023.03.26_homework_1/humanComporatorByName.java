import java.util.Comparator;

public class humanComporatorByName implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        // TODO Auto-generated method stub
        return o1.getName().compareTo(o2.getName());
    }
}
