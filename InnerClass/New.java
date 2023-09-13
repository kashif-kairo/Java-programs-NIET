package InnerClass;
// write a java code to implement square of the number using anonmynous and interface of class
import java.util.*;
interface A{
    void print(int n);
}
abstract class NumberCheck{
    abstract void check(int num);
}
public class New {
    public static void main(String[] argss){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        sc.close();
        A a = new A(){
            @Override
            public void print(int n){
                System.out.println(n*n);
            }
        };
        a.print(n);
        NumberCheck checker = new NumberCheck(){
            void check(int num){
                if(num>0){
                    System.out.println("Postive");
                }
                else if(num==0){
                    System.out.println("zero");
                }
                else{
                    System.out.println("Negative");
                }
            }
        };
        checker.check((n));




    }
}
//WJP to check wheather a number is negative positive or zero using abstract and anoynumus class 
