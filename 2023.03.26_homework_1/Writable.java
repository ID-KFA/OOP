import java.io.FileNotFoundException;
import java.io.IOException;

public interface Writable {
    void save() throws IOException;

    FamilyTree read() throws FileNotFoundException, IOException;

}
