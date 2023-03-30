import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<Human> humans;

    public FamilyTree() {
        this(new ArrayList());

    }

    private FamilyTree(List<Human> humans) {
        this.humans = humans;
    }

    public void add(Human h) {
        humans.add(h);

    }

    public List getInfo() {
        List res = new ArrayList();
        String str;
        for (int i = 0; i < humans.size(); i++) {
            str = humans.get(i).toString();
            res.add(str);

        }
        return res;

    }
    // public Human getByName(String name){

    // for (int i = 0; i < humans.size(); i++) {
    // if (this.humans.get(i).getName().equals(name))
    // result=this.humans.get(i);

    // }
    // return result;

    // }

    public List<Human> getKids(String name) {

        List<Human> kids = new ArrayList();
        for (int i = 0; i < humans.size(); i++) {

            if (this.humans.get(i).dadOf() != null) {

                if (this.humans.get(i).dadOf().getName().equals(name)) {

                    kids.add(this.humans.get(i));
                }

            }

            if (this.humans.get(i).momOf() != null) {

                if (this.humans.get(i).momOf().getName().equals(name)) {

                    kids.add(this.humans.get(i));
                }

            }

        }
        return kids;

    }

}
