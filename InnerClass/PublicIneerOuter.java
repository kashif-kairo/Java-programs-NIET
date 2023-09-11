package InnerClass;

public class PublicIneerOuter {
    int data =50;
    void show(){
        System.out.println("Outer Class Method");
    }
    class Inner{
        void show(){
            System.out.println("Inner Class Method");
        }
        void show1(){
            System.out.println("Another method of inner class");
        }
    }
    public static void main(String[] args){
        PublicIneerOuter o = new PublicIneerOuter();
        o.show();
        PublicIneerOuter.Inner i = o.new Inner();  // way to create the object of inner class
        // Another way of object creation is 
        // Outer.Inner <object_name> = new Outer().new Inner()
        i.show();
        i.show1();
    }

}































































































