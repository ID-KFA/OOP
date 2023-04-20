import java.io.FileNotFoundException;
import java.io.IOException;

public class Presenter {
    private View view;
    private Service service;
    private String answer;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);

    }

    public void openFile() {
        try {
            answer = service.read().getHumanList().toString();
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
        view.print(answer);
    }

    public void saveFile() {

        try {
            service.save();
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    public void showTree() {
        answer = service.getInfo().toString();
        view.print(answer);
    }

    public void getByName(String name) {

        answer = service.getByName(name).toString();
        view.print(answer);

    }

    public void addPeople(String name, int year, String father, String mother) {
        answer = service.addPeople(name, year, father, mother).toString();
        view.print(answer);

    }

}
