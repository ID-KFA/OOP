import java.util.List;
import java.util.Scanner;

public class Console implements View {
    private Scanner scanner;
    private Menu menu;
    private boolean work;
    private Presenter presenter;
    private String name, father, mother;
    private int year;

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void start() {
        scanner = new Scanner(System.in);
        menu = new Menu(this);
        work = true;
        while (work) {
            hello();
            String command = scanner.nextLine();
            if (checkInput(command)) {
                menu.execute(Integer.parseInt(command));
            } else {
                System.out.println("Something goes wrong");
            }
        }
    }

    private boolean checkInput(String text) {
        return text.matches("[0-9]+");
    }

    private void hello() {
        System.out.println(menu.printMenu());
    }

    @Override
    public void print(String result) {
        System.out.println(result);

    }

    public void finish() {
        work = false;
    }

    public void showTree() {
        presenter.showTree();

    }

    public void getByName() {
        System.out.println("Input name");
        presenter.getByName(scanner.nextLine());
    }

    public void addPeople() {
        name=null;
        father=null;
        mother=null;

        System.out.println("Input name");
        name = scanner.nextLine();

        System.out.println("Input year");
        year = Integer.parseInt(scanner.nextLine());

        System.out.println("Input father");
        father = scanner.nextLine();

        System.out.println("Input mother");
        mother = scanner.nextLine();

        presenter.addPeople(name, year, father, mother);
    }

}
