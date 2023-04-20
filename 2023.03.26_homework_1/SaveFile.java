
public class SaveFile extends Command {

    public SaveFile(Console console) {
        super(console);

    }

    @Override
    public String description() {

        return "Save file";
    }

    @Override
    public void execute() {
        getConsole().saveFile();

    }

}
