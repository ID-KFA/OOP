public class Human {
String name;
Gender gender;
Human father;
Human mother;



public Human(String name, Gender gender, Human father, Human mother){
    this.name =name;
    this.gender=gender;
    this.father=father;
    this.mother=mother;
}

public Human(String name, Gender gender){
    this.name =name;
    this.gender=gender;
    
}


public String getName(){
    return name;
    
}

public Gender getGender(){
    return gender;
}
public String getFather(){
    return "father: "+father.toString();
}
public String getMother(){
    return "mother: "+mother.toString();
}



@Override
public String toString() {
    
    return name;
}

}
