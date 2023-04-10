
import java.io.*;

public class File implements Writable {
    private FamilyTree tree;


    @Override
    public void save(Serializable serializable) throws IOException {

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Tree.out"));
        objectOutputStream.writeObject(serializable);

        objectOutputStream.close();
        System.out.println("File saved");

    }

    @Override
    public FamilyTree read() throws FileNotFoundException, IOException {

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Tree.out"));

        try {
            tree = (FamilyTree) objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("File opened");
        objectInputStream.close();
        return this.tree;

    }

}