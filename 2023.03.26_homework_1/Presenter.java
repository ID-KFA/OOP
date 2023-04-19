import java.util.List;


public class Presenter {
    private View view;
    private Service service;
    private String answer;
   
    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);

    }

    public void showTree() {
        answer=service.getInfo().toString();
        view.print(answer);
    }

    public void getByName(String name){
      
        answer=service.getByName(name).toString();
        view.print(answer);

    }
    public void addPeople(String name,int year,String father, String mother){
        answer=service.addPeople(name, year, father, mother).toString();
        view.print(answer);
        
        // h=new Human(name, year,service.getByName(father),service.getByName(mother));
        // service.add(h);
        // view.print(service.getInfo());

    }

    
}
