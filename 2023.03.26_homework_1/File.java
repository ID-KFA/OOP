import java.io.Serializable;
import java.io.*;

public class File implements Serializable {
    public FamilyTree obj;

    public void save(FamilyTree obj) throws IOException, ClassNotFoundException {
        this.obj = obj;

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Tree.out"));
        objectOutputStream.writeObject(obj);

        objectOutputStream.close();
        System.out.println("File saved");
    }

    public FamilyTree open() throws IOException, ClassNotFoundException {

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Tree.out"));

        this.obj = (FamilyTree) objectInputStream.readObject();
        System.out.println("File opened");
        objectInputStream.close();
        return this.obj;

    }

}