import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Service<E extends Human> {
    private FamilyTree<E> tree;
    private List<E> humans;
    private Human result;
    private E Man;

    public Service(FamilyTree<E> tree) {
        this.tree = tree;

    }

    public void sortByName() {
        Collections.sort(tree.getHumanList(), new ComporatorByName());

    }

    public void sortByYear() {
        Collections.sort(tree.getHumanList(), new ComporatorByYear());

    }

    public List<E> getInfo() {
        List res = new ArrayList();
        String str;
        for (int i = 0; i < tree.getHumanList().size(); i++) {
            str = tree.getHumanList().get(i).toString();
            res.add(str);

        }
        return res;
    }

    public Human getByName(String name) {
        result = null;
        for (int i = 0; i < tree.getHumanList().size(); i++) {
            if (this.tree.getHumanList().get(i).getName().equals(name))
                result = this.tree.getHumanList().get(i);

        }
        return result;

    }

    public List addPeople(String name, int year, String father, String mother) {

        Human h = new Human (name, year, getByName(father), getByName(mother));
        tree.add((E) h);

        return tree.getHumanList();
    }
}

// public void add(Human h) {
// humans.add(h);

// }
// }
