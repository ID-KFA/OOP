import java.util.List;

public class Presenter {
    private View view;
    private FamilyTree tree;
    private List answer;
    private Human h;

    public Presenter(View view, FamilyTree tree) {
        this.view = view;
        this.tree = tree;
        view.setPresenter(this);

    }

    public void ShowTree() {
        answer=tree.getInfo();
        view.print(answer);
    }

    public void GetByName(String name){
        answer.clear();
        answer.add(tree.getByName(name));
        view.print(answer);

    }
    public void AddPeople(String name,int year){
        h=new Human(name, year);
        tree.add(h);
        view.print(tree.getInfo());

    }

    
}
