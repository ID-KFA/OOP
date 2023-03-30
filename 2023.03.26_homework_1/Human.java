
import java.util.List;

public class Human {
    private String name;
    private Gender gender;
    private Human father;
    private Human mother;
    List<Human> kids;

    public Human(String name, Gender gender, Human father, Human mother, List<Human> kids) {
        this.name = name;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
        this.kids = kids;
    }

    public Human(String name, Gender gender, Human father, Human mother) {
        this.name = name;
        this.gender = gender;
        this.father = father;
        this.mother = mother;

    }

    public Human(String name, Gender gender, List<Human> kids) {
        this.name = name;
        this.gender = gender;
        this.kids = kids;

    }

    public Human(String name, Gender gender) {
        this.name = name;
        this.gender = gender;

    }

    public String getName() {
        return name;

    }

    public Gender getGender() {
        return gender;

    }

    public Human dadOf() {
        return father;

    }

    public Human momOf() {
        return mother;

    }

    public String getFather() {
        return "father: " + father.toString();
    }

    public String getMother() {
        return "mother: " + mother.toString();
    }

    public String getKids() {
        return "kids: " + kids.toString();

    }

    @Override
    public String toString() {

        String str;

        str = getName() + " - " + getGender();
        if (father != null)
            str += "; " + getFather() + ";";
        if (mother != null)
            str += " " + getMother();
        if (kids != null)
            str += " " + getKids();

        return str;
    }

}
