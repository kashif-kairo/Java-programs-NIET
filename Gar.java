class Cricketer{
    Cricketer(){
        System.out.println("Object is Created");
    }
    protected void finalize(){
        System.out.println("Object is destroyed");
    }

}
public class Gar {
    public static void main(String[] args){
    Cricketer c = new Cricketer();
    // c=null;
    Cricketer c1 = new Cricketer();
    c=c1;
    new Cricketer();

    System.gc();
    }
}
