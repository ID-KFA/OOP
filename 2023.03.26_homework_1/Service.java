import java.util.Collections;

public class Service<E extends Human> {
    private FamilyTree<E> tree;
  

    public Service(FamilyTree<E> tree) {
        this.tree = tree;

    }

    public void sortByName() {
        Collections.sort(tree.getHumanList(), new ComporatorByName());

    }

    public void sortByYear() {
        Collections.sort(tree.getHumanList(), new ComporatorByYear());

    }


}
