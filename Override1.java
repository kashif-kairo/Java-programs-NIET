class Parent{
    void eat(){
        System.out.println("Team Pay attention");
    }
}
class Child extends Parent{
    @Override
    void eat(){
        super.eat();
        System.out.println("Salman Pay Attention");
    }
}
public class Override1 {
    public static void main(String[] args){
        Child c = new Child();
        c.eat();
    }

    
}
