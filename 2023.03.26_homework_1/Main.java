import javax.imageio.spi.ServiceRegistry;

public class Main {
    public static void main(String[] args) {
        
    
 FamilyTree tree = new FamilyTree();

 
 Human h1=new Human ("Sergei",Gender.Male);
 Human h2=new Human ("Maria",Gender.Female);
 Human h3=new Human ("Elena",Gender.Female,h1,h2);
 Human h4=new Human ("Alexander",Gender.Male,h1,h2);


 tree.add(h1);
 tree.add(h2);
 tree.add(h3);
 tree.add(h4);


 System.out.println(tree.getInfo());

}
}
