interface Pyramid{
    public void show();
}
interface Trainer{
    public void show1();
}
class Kashif implements Pyramid,Trainer{
    public void show(){
        System.out.println("It's Working Fine");
    }
    public void show1(){
        System.out.println("Good job");

    }
}
public class Enter {
    public static void main(String[] args){
    Kashif k = new Kashif();
    k.show();
    k.show1();
    
}
}
