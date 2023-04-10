import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.spi.ServiceRegistry;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FamilyTree<Human> tree = new FamilyTree();
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
        tree2 = file.read();
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

        FamilyTree<Dog> tree_dog = new FamilyTree();
        Service service2 = new Service(tree_dog);

        Dog d1 = new Dog("Bim", Gender.Male, 2020);
        Dog d2 = new Dog("Alvora", Gender.Female, 2019);
        Dog d3 = new Dog("Didi", Gender.Female, 2023, d1, d2);
        Dog d4 = new Dog("Alex", Gender.Male, 2022, d1, d2);

        tree_dog.add(d1);
        tree_dog.add(d2);
        tree_dog.add(d3);
        tree_dog.add(d4);
        
        System.out.println();
        System.out.println("Dogs in the tree: ");
        for (Dog dog : tree_dog) {
            System.out.println(dog);
        }

        service2.sortByName();

        System.out.println();
        System.out.println("Sorted dogs by name: ");
        for (Dog dog : tree_dog) {
            System.out.println(dog);
        }
        service2.sortByYear();
        System.out.println();
        System.out.println("Sorted dogs by year: ");
        for (Dog dog : tree_dog) {
            System.out.println(dog);
        }

    }
    
}
