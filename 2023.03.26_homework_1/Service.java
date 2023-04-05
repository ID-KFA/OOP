import java.util.Collections;

public class Service {
    private FamilyTree tree;

    public Service(FamilyTree tree) {
        this.tree = tree;

    }

    public void sortByName() {
        Collections.sort(tree.getHumanList(), new humanComporatorByName());

    }

    public void sortByYear() {
        Collections.sort(tree.getHumanList(), new humanComporatorByYear());

    }

}
