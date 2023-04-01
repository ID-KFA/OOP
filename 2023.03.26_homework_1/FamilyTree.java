import java.util.ArrayList;
import java.util.List;

public class FamilyTree{
    private List <Human> humans;
    private Human result;
    
   
    public FamilyTree(){
        this (new ArrayList());

    }

    private FamilyTree (List<Human> humans){
        this.humans=humans;
    }

    public void add (Human h){
        humans.add(h);

    }

    public List getInfo (){
        List res=new ArrayList();
        String str;
        for (int i = 0; i < humans.size(); i++) {
            str=humans.get(i).getName() +" - "+ humans.get(i).getGender();
            if (humans.get(i).father!= null) str+="; "+humans.get(i).getFather()+";";
            if (humans.get(i).mother!= null) str+=" "+humans.get(i).getMother();
            res.add(str);

            
        }
        return res;

   

    }    
    // public Human getByName(String name){
 
    //     for (int i = 0; i < humans.size(); i++) {
    //         if (this.humans.get(i).getName().equals(name)) 
    //           result=this.humans.get(i);
                
                       
    //     }
    //     return result;

        
    // }

    

        
    


}

