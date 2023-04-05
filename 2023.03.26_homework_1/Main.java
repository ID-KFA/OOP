import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.spi.ServiceRegistry;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FamilyTree tree = new FamilyTree();
        Service service = new Service(tree);

        Human h1 = new Human("Sergei", Gender.Male, 1947);
        Human h2 = new Human("Maria", Gender.Female, 1948);
        Human h3 = new Human("Elena", Gender.Female, 1981, h1, h2);
        Human h4 = new Human("Alexander", Gender.Male, 1978, h1, h2);

        tree.add(h1);
        tree.add(h2);
        tree.add(h3);
        tree.add(h4);

        System.out.println(tree.getInfo());
        System.out.println();
        System.out.print("Maria`s kids: " + tree.getKids("Maria"));
        System.out.println();

        System.out.print("Elena`s kids: " + tree.getKids("Elena"));
        System.out.println();

        File file = new File();
        file.save(tree);

        FamilyTree tree2 = new FamilyTree();
        tree2 = file.open();
        System.out.println(tree2.getInfo());
        System.out.println();

        System.out.println("People in the tree: ");
        for (Human human : tree) {
            System.out.println(human);
        }

        service.sortByName();

        System.out.println();
        System.out.println("Sorted people by name: ");
        for (Human human : tree) {
            System.out.println(human);
        }
        service.sortByYear();
        System.out.println();
        System.out.println("Sorted people by year: ");
        for (Human human : tree) {
            System.out.println(human);
        }

    }
}
