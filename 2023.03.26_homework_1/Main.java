import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.spi.ServiceRegistry;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FamilyTree tree = new FamilyTree();

        Human h1 = new Human("Sergei", Gender.Male);
        Human h2 = new Human("Maria", Gender.Female);
        Human h3 = new Human("Elena", Gender.Female, h1, h2);
        Human h4 = new Human("Alexander", Gender.Male, h1, h2);

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


    }
}
