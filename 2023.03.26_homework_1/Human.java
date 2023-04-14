
import java.util.List;
import java.io.*;

public class Human implements Serializable {
    private String name;
    private Gender gender;
    private Human father;
    private Human mother;
    List<Human> kids;
    private int year;

    public Human(String name, Gender gender, int year, Human father, Human mother, List<Human> kids) {
        this.name = name;
        this.gender = gender;
        this.year = year;
        this.father = father;
        this.mother = mother;
        this.kids = kids;
    }

    public Human(String name, Gender gender, int year, Human father, Human mother) {
        this.name = name;
        this.gender = gender;
        this.year = year;
        this.father = father;
        this.mother = mother;

    }

    public Human(String name, Gender gender, int year, List<Human> kids) {
        this.name = name;
        this.gender = gender;
        this.kids = kids;
        this.year = year;

    }

    public Human(String name, Gender gender, int year) {
        this.name = name;
        this.gender = gender;
        this.year = year;

    }
    public Human(String name, int year) {
        this.name = name;
        this.year = year;

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
        return "father - " + father.toString();
    }

    public String getMother() {
        return "mother - " + mother.toString();
    }

    public String getKid() {
        return "kid: " + kids.toString();

    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {

        String str;

        str = getName() + " (" + getYear() + ")";
        if (father != null)
            str += ": " + getFather() + ";";
        if (mother != null)
            str += " " + getMother();
        if (kids != null)
            str += " " + getKid();

        return str;
    }

}
