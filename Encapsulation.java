//private accsssor
import java.util.*;
class Data{
    private String name;
    public String getname(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
}
public class Encapsulation {
    
        public static void main(String[] args){
            Data c = new Data();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name : ");
            String n ;
            n=sc.nextLine();
            sc.close();
            c.setName(n);
            System.out.println(c.getname());
        }
    
        
    
    
    
}
