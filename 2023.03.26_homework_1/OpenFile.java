
public class OpenFile extends Command {

    public OpenFile(Console console) {
        super(console);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String description() {
        // TODO Auto-generated method stub
        return "Open file";
    }

    @Override
    public void execute() {
        getConsole().openFile();

    }

}
