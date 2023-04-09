import java.util.List;

public class Dog extends Human {

    public Dog(String name, Gender gender, int year) {
        super(name, gender, year);
        //TODO Auto-generated constructor stub
    }
    
   

    public Dog(String name, Gender gender, int year, Human father, Human mother, List<Human> kids) {
        super(name, gender, year, father, mother, kids);
    }




    public Dog(String name, Gender gender, int year, Human father, Human mother) {
        super(name, gender, year, father, mother);
    }



    public Dog(String name, Gender gender, int year, List<Human> kids) {
        super(name, gender, year, kids);
    }




    
}