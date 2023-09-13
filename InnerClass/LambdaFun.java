package InnerClass;
interface See{
    void csds(int i);
}
public class LambdaFun {
    public static void main (String[] args){
        See A =(int i )->System.out.println("Team hii "+i);
        A.csds(5);
    }
}
