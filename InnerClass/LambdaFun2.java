package InnerClass;
interface Addal{
    int add(int a, int b);
}
public class LambdaFun2 {
    public static void main(String[] args){
        Addal a1 =(a,b)->(a+b);
        System.out.println(a1.add(2,3));
        Addal a2= (int a, int b)->{return (a*b);};
        System.out.println(a2.add(2,3));
    }
    
}
