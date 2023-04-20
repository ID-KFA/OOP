import java.util.Collections;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.*;

public class Service<E extends Human> implements Writable {
    private FamilyTree<E> tree;

    private Human result;

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

        Human h = new Human(name, year, getByName(father), getByName(mother));
        tree.add((E) h);

        return tree.getHumanList();
    }

    @Override
    public FamilyTree<E> read() throws FileNotFoundException, IOException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Tree.out"));

        try {
            tree = (FamilyTree<E>) objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("File opened");
        objectInputStream.close();
        return this.tree;

    }

    @Override
    public void save() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Tree.out"));
        objectOutputStream.writeObject(tree);

        objectOutputStream.close();
        System.out.println("File saved");

    }
}
