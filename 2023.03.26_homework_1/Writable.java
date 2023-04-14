import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

public interface Writable {
    void save(Serializable serializable) throws IOException;

    FamilyTree read() throws FileNotFoundException, IOException;

}
