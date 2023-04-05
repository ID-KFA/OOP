import java.util.Comparator;

public class humanComporatorByYear implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        // TODO Auto-generated method stub
        if (o1.getYear() == o2.getYear())
            return 0;
        if (o1.getYear() > o2.getYear())
            return 1;
        else
            return -1;
    }

}
