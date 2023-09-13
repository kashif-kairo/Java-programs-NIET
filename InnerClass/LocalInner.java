package InnerClass;
// Local inner class 
//< Inner class can be declared within a method of an outer class >

class Local{
    final int s =10;
    void show(){
        class LocalNested{
            void disp(){
                System.out.println("Students don't sleep");
            }
        }
        LocalNested l = new LocalNested();
        l.disp();
    }
}
public class LocalInner {
    public static void main ( String[] args){
    Local obj = new Local();
    System.out.println(obj.s);
    obj.show();
    
}
}